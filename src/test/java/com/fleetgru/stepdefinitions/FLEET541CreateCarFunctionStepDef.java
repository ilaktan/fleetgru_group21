package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.*;
import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FLEET541CreateCarFunctionStepDef{

        VehiclesPage createCar=new VehiclesPage();
        AddEventPage createCar2=new AddEventPage();
        LoginPage loginPage=new LoginPage();



        @When("enters license plate info")
        public void enters_license_plate_info() {
            createCar2.licensePlate.sendKeys("ZZZ");
        }
        @When("the user clicks on Save & Close button")
        public void the_user_clicks_on_Save_Close_button() {
            createCar2.waitUntilLoaderScreenDisappear();
            BrowserUtils.waitFor( 5);
            createCar2.saveCloseButton.click();
        }
        @Then("Entity is saved message is displayed")
        public void entity_is_saved_message_is_displayed() {
            createCar2.waitUntilLoaderScreenDisappear();
            BrowserUtils.waitForVisibility(createCar2.entitySavedMessage, 5);
            Assert.assertTrue(createCar2.entitySavedMessage.isDisplayed());
        }



        @When("the user clicks +Add to add vehicle make")
        public void the_user_clicks_Add_to_add_vehicle_make() {
            createCar2.addButtonMake.click();
            createCar2.addMake.click();
            createCar2.selectButton.click();
            BrowserUtils.waitFor(7);
            createCar2.saveCloseButton.click();

        }
        @Then("new vehicle and make are displayed")
        public void new_vehicle_and_make_are_displayed() {
            Assert.assertEquals(createCar2.vehicleMakeline.getText(),"Nissan");
            Assert.assertEquals(createCar2.vehicleModelline.getText(),"Rouge");
        }
        @When("the user click on Create Car button")
        public void the_user_click_on_Create_Car_button() {
            createCar.waitUntilLoaderScreenDisappear();
            BrowserUtils.waitFor(9);
            createCar.createCarButton.click();


        }


        @When("the user clicks +Add to add vehicle model")
        public void the_user_clicks_Add_to_add_vehicle_model() {
            createCar2.waitUntilLoaderScreenDisappear();
            BrowserUtils.waitFor(5);
            createCar2.addButtonModel.click();
            createCar2.addModel.click();
            createCar2.selectButton.click();
        }

    }
