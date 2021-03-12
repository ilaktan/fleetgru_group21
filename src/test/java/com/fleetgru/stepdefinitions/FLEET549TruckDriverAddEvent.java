package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.*;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class FLEET549TruckDriverAddEvent extends BasePage {

    @When("the user navigates to {string} to {string}")
    public void the_user_navigates_to_to(String tab, String module) {
        DashBoardPage dashBoard = new DashBoardPage();
        dashBoard.navigateToModule(tab, module);
        //dashBoard.waitUntilLoaderScreenDisappear();
        //System.out.println("the user navigates to Fleet to Vehicles");
    }

    @When("the user clicks any car in the list")
    public void the_user_clicks_any_car_in_the_list() {
        new VehiclesPage().clickACarInTheTable();
    }

    @When("clicks the -Add Event- button")
    public void clicks_the_Add_Event_button() {
        //new WebDriverWait(Driver.get(),60).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("h1.oro-subtitle")));
        //new WebDriverWait(Driver.get(),60).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h1[text()='Cars']")));
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='container-fluid']//a)[1]")));
        BrowserUtils.waitFor(5);
        while(new AddEventPage().titleOfAddEvent.size()<1) {
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", new VehiclesPage().addEvent);
            BrowserUtils.clickWithJS(new VehiclesPage().addEvent);
        }
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("span[id*='ui-id']")));
        Assert.assertEquals(new AddEventPage().titleOfAddEvent.get(0).getText(),"Add Event");
    }

    @Then("the user should edit the required fields")
    public void the_user_should_edit_the_required_fields() {
        AddEventPage addEventPage =new AddEventPage();
        addEventPage.waitUntilLoaderScreenDisappear();
        addEventPage.eventTitle.sendKeys("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        addEventPage.organizerName.sendKeys("Michael Knight");
        addEventPage.organizeremail.sendKeys("m.knight@organizer.com");
        addEventPage.startdate.clear();
        addEventPage.startdate.sendKeys("Feb 25, 2021");
        addEventPage.enddate.clear();
        addEventPage.enddate.sendKeys("Feb 25, 2022"+ Keys.ESCAPE);
        JavascriptExecutor j=(JavascriptExecutor) Driver.get();
        j.executeScript("arguments[0].click();", addEventPage.allDayEvent);
        //
        //
        j.executeScript("arguments[0].click();", addEventPage.repeat);
        Select select=new Select(addEventPage.repeatsDropdown);
        select.selectByVisibleText("Weekly");
        addEventPage.checkBoxMonday.click();
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", addEventPage.saveButton);
        new Actions(Driver.get()).moveToElement(addEventPage.saveButton).click().perform();
        //
        //
        //

        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div[class='message-item message']")));
        addEventPage.waitUntilWebElementVisible(addEventPage.savedTitleOnGeneralInformationPage,1000);
        Assert.assertEquals("verified the title of the Event","ABCDEFGHIJKLMNOPQRSTUVWXYZ", addEventPage.savedTitleOnGeneralInformationPage.getText());
        System.out.println("end of the user should edit the required fields step");
    }

    @Then("the user should verify the info at General Information page with Activity tab.")
    public void the_user_should_verify_the_info_at_General_Information_page_with_Activity_tab() {
        AddEventPage v=new AddEventPage();
        v.waitUntilLoaderScreenDisappear();
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.accordion-heading.clearfix")));
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", v.lastExpandButtonCollapsed);
        new Actions(Driver.get()).moveToElement(v.lastExpandButtonCollapsed).click().perform();

            //locator belongs
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='items list-box list-shaped']//div[@data-layout='separate' and @class='list-item']//div[@class='controls']/div")));
            List<String> listEventSubEntries=BrowserUtils.getElementsText(v.eventSubEntries);
            List<String> expected= Arrays.asList("ABCDEFGHIJKLMNOPQRSTUVWXYZ","N/A","Feb 25, 2021, 12:00 AM","Feb 25, 2022, 12:00 AM","Yes","Weekly every 1 week on Monday");
            System.out.println("List<String> expected= Arrays.asList(\"ABCDEFGHIJKLMNOPQRSTUVWXYZ\",\"N/A\",\"Feb 25, 2021, 12:00 AM\",\"Feb 25, 2022, 12:00 AM\",\"Yes\",\"Weekly every 1 week on Monday\");   CREATED");
            for(int i=0;i<expected.size();i++){
                Assert.assertEquals((i+1)+"th element fits",expected.get(i),listEventSubEntries.get(i));
                System.out.println((i + 1) + "th element fits");
            }
        }
}
