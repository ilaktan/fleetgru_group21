package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class FLEET542DeleteSpecificCarStepDef {
    @Then("the user can select any car by clicking check box from All-Cars page")
    public void the_user_can_select_any_car_by_clicking_check_box_from_All_Cars_page() {
        BrowserUtils.waitFor(5);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new VehiclesPage().selectCheckBox);
        BrowserUtils.waitFor(5);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new VehiclesPage().massActions);

    }

    @Then("the user can go and click to delete button at the end of menu bar")
    public void the_user_can_go_and_click_to_delete_button_at_the_end_of_menu_bar() {
        BrowserUtils.waitFor(5);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new VehiclesPage().deleteButton);

    }

    @Then("the user can click yes delete button at the delete confirmation box")
    public void the_user_can_click_yes_delete_button_at_the_delete_confirmation_box() {
        BrowserUtils.waitFor(3);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new VehiclesPage().confirmationYesDelete);
        BrowserUtils.waitFor(3);
        Assert.assertTrue(new VehiclesPage().deleteGreen.getText().contains("deleted"));
    }

}
