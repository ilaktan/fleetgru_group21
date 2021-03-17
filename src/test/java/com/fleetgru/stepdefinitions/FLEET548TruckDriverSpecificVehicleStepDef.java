package com.fleetgru.stepdefinitions;


import com.fleetgru.pages.*;
import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class FLEET548TruckDriverSpecificVehicleStepDef {
    LoginPage loginPage=new LoginPage();

    VehiclesPage createCarPage=new VehiclesPage();

    AddEventPage createCarPage2=new AddEventPage();

    @Then("the user sees all informations about specific car")
    public void the_user_sees_all_informations_about_specific_car() {
        BrowserUtils.waitFor(5);
        Assert.assertEquals(createCarPage.row1.getText(),"55-55");
        Assert.assertEquals(createCarPage.row2.getText(),"Michael Johnson");
        Assert.assertEquals(createCarPage.row3.getText(),"Denver");
        Assert.assertEquals(createCarPage.row4.getText(),"12,345");
        Assert.assertEquals(createCarPage.row5.getText(),"2018");
        Assert.assertEquals(createCarPage.row6.getText(),"2,018");
        Assert.assertEquals(createCarPage.row7.getText(),"Feb 1, 2022");
        Assert.assertEquals(createCarPage.row8.getText(),"Feb 1, 2019");
        Assert.assertEquals(createCarPage.row9.getText(),"$2,200.00");
        Assert.assertEquals(createCarPage.row10.getText(),"2");
        Assert.assertEquals(createCarPage.row11.getText(),"2");
        Assert.assertEquals(createCarPage.row12.getText(),"Blue");
        Assert.assertEquals(createCarPage.row13.getText(),"Automatic");
        Assert.assertEquals(createCarPage.row14.getText(),"Diesel");
        Assert.assertEquals(createCarPage.row15.getAttribute("innerText"),"22");
        Assert.assertEquals(createCarPage.row16.getText(),"122");
        Assert.assertEquals(createCarPage.row17.getText(),"2,000");
        Assert.assertEquals(createCarPage.row18.getText(),"2,000,000");
    }

    @Given("the user goes to Vehicles page")
    public void the_user_goes_to_Vehicles_page() {
        loginPage.navigateToModule("Fleet", "Vehicles");
    }

    @When("the user filters using either Activity Type button")
    public void the_user_filters_using_either_Activity_Type_button() {
        createCarPage2.waitUntilLoaderScreenDisappear();
        //forceClick(carInfoPage.activityButtonJS);
        createCarPage2.activityTypeButton.click();
        BrowserUtils.waitFor(3);
        createCarPage2.calendarEventOption.click();
    }



    @Then("data is filtered by Activity Type")
    public void data_is_filtered_by_Activity_Type() {
        for(WebElement each:createCarPage2.FilteredActivityTypeList){
            Assert.assertTrue(each.getText().contains("Calendar event"));
        }
    }
    @When("the user filters using either Date Range button")
    public void the_user_filters_using_either_Date_Range_button() {
        createCarPage2.dataRangeButton.click();
        BrowserUtils.waitFor(3);
        createCarPage2.date1.sendKeys("Feb 3, 2021");
        createCarPage2.date2.sendKeys("Feb 4, 2021");
        createCarPage2.updateButton.click();
    }
    @Then("data is filtered by Date Range")
    public void data_is_filtered_by_Date_Range() {
        BrowserUtils.waitFor(3);
        for(WebElement each:createCarPage2.dates){
            Assert.assertEquals(each.getText(), "Feb 3");
        }

    }

    @When("the user clicks refresh button")
    public void the_user_clicks_refresh_button() {
        BrowserUtils.waitFor(3);
        createCarPage2.olderButton.click();
        createCarPage2.refreshButton.click();
    }




    @Then("the data is refreshed")
    public void the_data_is_refreshed() {

        Assert.assertFalse(createCarPage2.date.getText().contains("Yesterday"));
    }



    @Given("the user click on any line")
    public void the_user_click_on_any_line() {
        createCarPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor( 6);
        createCarPage.row1.click();
    }



    @Given("the user click on Activity")
    public void the_user_click_on_Activity() {
        createCarPage2.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(createCarPage2.activityButton, 5);
        createCarPage2.activityButton.click();


    }

    public void forceClick(WebElement element){

        JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
        executor.executeScript("arguments[0].click();", element);
        element.click();

    }

    @When("the user clicks Newer")
    public void the_user_clicks_Newer() {
        BrowserUtils.waitFor(4);
        createCarPage2.newerButton.click();

    }



    @Then("the user sees all info")
    public void the_user_sees_all_info() {
        for(WebElement each:createCarPage2.FilteredActivityTypeList){
            Assert.assertTrue(each.getText().contains("Calendar"));
        }
    }

    @When("the user clicks Older")
    public void the_user_clicks_Older() {
        BrowserUtils.waitFor(4);
        createCarPage2.olderButton.click();

    }




}
