package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.VehiclesPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class FLEET550GetVehicleInformationStepdef {

    @Then("the user can go any page by clicking page number")
    public void the_user_can_go_any_page_by_clicking_page_number() {
        new VehiclesPage().pageForwardButton.click();
        Assert.assertTrue(new VehiclesPage().inputBox.getText().contains("2"));
    }

    @Then("the user can change the entity number by clicking the View Per Page box")
    public void the_user_can_change_the_entity_number_by_clicking_the_View_Per_Page_box() {
        new VehiclesPage().viewPerPageBox.click();
        new VehiclesPage().viewPerPageBox50.click();
        Assert.assertTrue(new VehiclesPage().viewPerPageBox.getText().contains("50"));

    }

    @Then("the user can get all informations to her_his own email address by using Export Grid button")
    public void the_user_can_get_all_informations_to_her_his_own_email_address_by_using_Export_Grid_button() {
        new VehiclesPage().exportGrid.click();
        new VehiclesPage().sendingEmail.click();

        Assert.assertTrue(new VehiclesPage().greenBox.getText().contains("Export started successfully."));

    }
}
