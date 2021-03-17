package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FLEET549TruckDriverAddEvent extends BasePage {

    @When("the user navigates to {string} to {string}")
    public void the_user_navigates_to_to(String tab, String module) {
        new DashBoardPage().navigateToModule(tab, module);
    }

    @When("the user clicks any car in the list")
    public void the_user_clicks_any_car_in_the_list() {
        new VehiclesPage().clickACarInTheTable();
    }

    @When("clicks the -Add Event- button")
    public void clicks_the_Add_Event_button() {
        new AddEventPage().clickAddEventButton();

    }

    @Then("clicks cancel button")
    public void clicks_cancel_button() {
        new AddEventPage().clickCancelAddEventButton();
    }

    @Then("the user should edit the required fields")
    public void the_user_should_edit_the_required_fields() {
        new AddEventPage().editAddEvent();
    }

    @Then("the user should verify the info at General Information page with Activity tab.")
    public void the_user_should_verify_the_info_at_General_Information_page_with_Activity_tab() {
        new AddEventPage().verifyGeneralInfoWithActivityTab();
    }
}
