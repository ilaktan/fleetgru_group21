package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class FLEET550GetVehicleInformationStepdef {

    @Then("the user can go any page by clicking page number")
    public void the_user_can_go_any_page_by_clicking_page_number() {
        BrowserUtils.waitFor(7);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new VehiclesPage().pageForwardButton);
        BrowserUtils.waitFor(7);
        Assert.assertTrue(new VehiclesPage().inputBox.getAttribute("value").contains("2"));
    }

    @Then("the user can change the entity number by clicking the View Per Page box")
    public void the_user_can_change_the_entity_number_by_clicking_the_View_Per_Page_box() {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new VehiclesPage().viewPerPageBox1);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new VehiclesPage().viewPerPageBox50);
        BrowserUtils.waitFor(7);
        Assert.assertTrue(new VehiclesPage().viewPerPageBox1.getText().contains("50"));

    }

    @Then("the user can get all informations to her_his own email address by using Export Grid button")
    public void the_user_can_get_all_informations_to_her_his_own_email_address_by_using_Export_Grid_button() {
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new VehiclesPage().exportGrid);
        BrowserUtils.waitFor(7);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new VehiclesPage().sendingEmail);
        BrowserUtils.waitFor(2);
        Assert.assertTrue(new VehiclesPage().greenBox.isDisplayed());

    }
}
