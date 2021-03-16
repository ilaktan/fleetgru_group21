package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class FLEET540SpecificVehicleFunction {
    @Then("the user gets any {string} information")
    public void the_user_gets_any_car_information(String carR) {
        BrowserUtils.waitFor(10);

        String CarType=carR;
        switch (CarType){
            case"car1":
                new VehiclesPage().car1.click();
                break;
            case"car2":
                new VehiclesPage().car2.click();
                break;
            case"car3":
                new VehiclesPage().car3.click();
                break;
            case"car4":
                ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new VehiclesPage().car4);
                break;
            default:
                System.out.println("there is a problem in switch case");
                break;
        }

    }
    @And("the hompage contains {string}")
    public void the_homepage_contains (String ecpectedTitle){
        BrowserUtils.waitFor(5);
        Assert.assertTrue(Driver.get().getTitle().contains(ecpectedTitle));
    }

    @When("the user gets  car1 information")
    public void car1_navigate(){
        //Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //wait.until(ExpectedConditions.visibilityOf(new CarPage().car1));
        BrowserUtils.waitFor(5);
        new VehiclesPage().car1.click();
    }
    @When("the user filters by using Activity Type")
    public void the_user_filters_by_using_Activity_Type() {

        BrowserUtils.waitFor(5);
        new VehiclesPage().activity.click();
        ArrayList<WebElement> newList = new ArrayList<>();

        for (WebElement checkbox : new VehiclesPage().activityDropDown) {
            if (!checkbox.isSelected()){
                checkbox.click();
                BrowserUtils.waitFor(3);
                newList.add(checkbox);
            }
        }

        for (int i = 0; i < newList.size(); i++)
            if (newList.get(0) == newList.get(i)) {
                BrowserUtils.waitFor(3);
                WebElement checkbox = Driver.get().findElement(By.id("ui-multiselect-1-1-option-["+i+"]"));
                Assert.assertFalse(checkbox.isSelected());
            }else{
                BrowserUtils.waitFor(3);
                WebElement checkbox = Driver.get().findElement(By.id("ui-multiselect-1-1-option-["+i+"]"));
                Assert.assertTrue(checkbox.isSelected());
            }
        BrowserUtils.waitFor(3);
        String expectedtxt=new VehiclesPage().activityInside.getText();
        Assert.assertTrue(expectedtxt.contains("Calendar"));
    }
    @When("the user filters by using Date Range")
    public void the_user_filters_by_using_Date_Range() {
        BrowserUtils.waitFor(7);
        new VehiclesPage().dateRange.click();
        new VehiclesPage().chooseDateStart.sendKeys("Jan 29, 2021");
        BrowserUtils.waitFor(4);
        //new CarPage().timeStart.sendKeys("12:00 AM");
        new VehiclesPage().chooseDateEnd.sendKeys("Feb 02, 2021");
        BrowserUtils.waitFor(4);
        //new CarPage().timeEnd.sendKeys("12:00 AM");
        new VehiclesPage().updateButton.click();
        BrowserUtils.waitFor(7);
        Assert.assertTrue(new VehiclesPage().dataRangeAttribute.getText().contains("Jan 31"));
    }
    @When("the user refreshies by using Refresh button")
    public void the_user_refreshies_by_using_Refresh_button() {
        new VehiclesPage().refresh.click();
        System.out.println("refres button works");
    }
    @Then("the user reach older page bt using Older button")
    public void the_user_reach_older_page_bt_using_Older_button() {
        new VehiclesPage().resetButton.click();
        new VehiclesPage().olderButton.click();
        Assert.assertTrue(new VehiclesPage().newerButton.isDisplayed());
    }

    @Then("the user reach newer page bt using Newer button")
    public void the_user_reach_newer_page_bt_using_Newer_button() {
        new VehiclesPage().newerButton.click();
        Assert.assertTrue(new VehiclesPage().olderButton.isDisplayed());

    }
}
