package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FLEET542DeleteSpecificCarStepDef {
    @Then("the user can select any car by clicking check box from All-Cars page")
    public void the_user_can_select_any_car_by_clicking_check_box_from_All_Cars_page() {
        BrowserUtils.waitFor(5);
        new VehiclesPage().selectCheckBox.click();
        BrowserUtils.waitFor(5);
        new VehiclesPage().massActions.click();
    }

    @Then("the user can go and click to delete button at the end of menu bar")
    public void the_user_can_go_and_click_to_delete_button_at_the_end_of_menu_bar() {
        new VehiclesPage().deleteButton.click();
    }

    @Then("the user can click yes delete button at the delete confirmation box")
    public void the_user_can_click_yes_delete_button_at_the_delete_confirmation_box() {
        new VehiclesPage().confirmationYesDelete.click();
        Assert.assertTrue(new VehiclesPage().deleteGreen.getText().contains("deleted"));
    }

}
