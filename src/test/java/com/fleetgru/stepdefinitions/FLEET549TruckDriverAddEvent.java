package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.AddEvent;
import com.fleetgru.pages.BasePage;
import com.fleetgru.pages.DashBoard;
import com.fleetgru.pages.Vehicles;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import java.util.Arrays;
import java.util.List;

public class FLEET549TruckDriverAddEvent extends BasePage {

    @When("the user navigates to {string} to {string}")
    public void the_user_navigates_to_to(String tab, String module) {
        DashBoard dashBoard = new DashBoard();
        dashBoard.navigateToModule(tab, module);
        dashBoard.waitUntilLoaderScreenDisappear();
        System.out.println("the user navigates to Fleet to Vehicles");
    }
    @When("the user clicks any car in the list")
    public void the_user_clicks_any_car_in_the_list() {
        int click_counter=0;
        while(new Vehicles().oneCarData.isDisplayed()&&click_counter<3) {
            new Vehicles().selectAndClickAnyCarInTheTable();
            System.out.println("select and click any car in the table is done");
            click_counter++;
        }
    }
    @When("clicks the -Add Event- button")
    public void clicks_the_Add_Event_button() {
        BrowserUtils.waitFor(3);
        //BrowserUtils.waitForClickablility(new Vehicles().addEvent,1);
        //just to click one time only
        while(new AddEvent().titleOfAddEvent.size()<1) {
            BrowserUtils.clickWithJS(new Vehicles().addEvent);
        }
    }

    @Then("the user should edit the required fields")
    public void the_user_should_edit_the_required_fields() {
        AddEvent addEvent=new AddEvent();
        addEvent.waitUntilLoaderScreenDisappear();
        addEvent.eventTitle.sendKeys("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        addEvent.organizerName.sendKeys("Michael Knight");
        addEvent.organizeremail.sendKeys("m.knight@organizer.com");
        addEvent.startdate.clear();
        addEvent.startdate.sendKeys("Feb 25, 2021");
        addEvent.enddate.clear();
        addEvent.enddate.sendKeys("Feb 25, 2022"+ Keys.ESCAPE);
        JavascriptExecutor j=(JavascriptExecutor) Driver.get();
        j.executeScript("arguments[0].click();",addEvent.allDayEvent);
        //addEvent.allDayEvent.click();
        //j.executeScript("arguments[0].click();",addEvent.repeat);
        j.executeScript("arguments[0].click();",addEvent.repeat);
        Select select=new Select(addEvent.repeatsDropdown);
        select.selectByVisibleText("Weekly");
        addEvent.checkBoxMonday.click();
        addEvent.saveButton.click();
        //BrowserUtils.waitForPresenceOfElement(By.cssSelector("div[class='message-item message']>strong"),10 );
        //BrowserUtils.waitForVisibility(addEvent.savedTitleOnGeneralInformationPage,5);
        addEvent.waitUntilWebElementVisible(addEvent.savedTitleOnGeneralInformationPage,1000);
        Assert.assertEquals("verified the title of the Event","ABCDEFGHIJKLMNOPQRSTUVWXYZ",addEvent.savedTitleOnGeneralInformationPage.getText());
        System.out.println("end of the user should edit the required fields step");
    }

    @Then("the user should verify the info at General Information page with Activity tab.")
    public void the_user_should_verify_the_info_at_General_Information_page_with_Activity_tab() {
        AddEvent v=new AddEvent();
        System.out.println("g created");
        v.waitUntilLoaderScreenDisappear();
        System.out.println("g.waitUntilLoaderScreenDisappear(); done");
        if(v.eventList.size()>0) {
            System.out.println("if(g.eventList.size()>0) {   inside condition");
            BrowserUtils.waitForClickablility(v.eventList.get(0),1);
            System.out.println("BrowserUtils.waitForClickability(g.eventList.get(0),1); done");
            BrowserUtils.clickWithJS(v.refreshButton);
            System.out.println("BrowserUtils.clickWithJS(g.refreshButton);  dont know if refreshed");

            try {
                v.clickExpandWhenVisible();    //bu expand yapsa da ilk sıra değil ikinci sıradakini expand yapıyor. Kodumdaki bug
                System.out.println("g.clickExpandWhenVisible(); maybe clicked");
            }
            catch (ElementClickInterceptedException click){
                System.out.println("ElementClickInterceptedException");
            }

            List<String> listEventSubEntries=BrowserUtils.getElementsText(v.eventSubEntries);
            System.out.println("List<String> listEventSubEntries=BrowserUtils.getElementsText(g.eventSubEntries);   has obtained");
            while (listEventSubEntries.size()<1){
                System.out.println("while (listEventSubEntries.size()<1){  in LOOP");
                try {
                    wait(500);
                    System.out.println("wait(500); WAITING");
                    listEventSubEntries=BrowserUtils.getElementsText(v.eventSubEntries);
                }catch (Exception e){
                    System.out.println("GOT EXCEPTION");
                }

            }
            List<String> expected= Arrays.asList("ABCDEFGHIJKLMNOPQRSTUVWXYZ","N/A","Feb 25, 2021, 12:00 AM","Feb 25, 2022, 12:00 AM","Yes","Weekly every 1 week on Monday");
            System.out.println("List<String> expected= Arrays.asList(\"ABCDEFGHIJKLMNOPQRSTUVWXYZ\",\"N/A\",\"Feb 25, 2021, 12:00 AM\",\"Feb 25, 2022, 12:00 AM\",\"Yes\",\"Weekly every 1 week on Monday\");   CREATED");
            for(int i=0;i<expected.size();i++){
                Assert.assertEquals((i+1)+"th element fits",expected.get(i),listEventSubEntries.get(i));
                System.out.println((i + 1) + "th element fits");
            }
        }
        System.out.println("stop here");
    }
}
