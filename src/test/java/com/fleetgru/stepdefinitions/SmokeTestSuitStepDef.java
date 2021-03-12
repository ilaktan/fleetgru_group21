package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.ConfigurationReader;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SmokeTestSuitStepDef {

    LoginPage loginPage = new LoginPage();
    VehiclesPage vehiclesPage = new VehiclesPage();


    @Given("the user logged in successfully as a {string}")
    public void the_user_logged_in_successfully_as_a(String userType) {

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);

        String username = null;
        String password = null;

        if(userType.equals("truck driver")){

            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");

        }else if(userType.equals("sales manager")){

            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");

        }else if(userType.equals("store manager")){

            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }

        loginPage.login(username, password);

    }


    @Then("should see grid setting title")
    public void should_see_grid_setting_title() {
        String expected = "Grid Settings";
        String actual = vehiclesPage.gridSettingsButtonTitle.getText();
        Assert.assertEquals("verify grid settings title", expected, actual);

        vehiclesPage.closeGridSetting.click();
    }

    @Then("the user should see the Manage Filters button")
    public void the_user_should_see_the_Manage_Filters_button() {
        String actual = vehiclesPage.manageFilters.getText();
        String expected = "Manage filters";

        Assert.assertEquals("Verify manage filter button", expected, actual);

    }
    @Then("the title should be {string}")
    public void the_title_contains(String expectedTitle) {
        BrowserUtils.waitFor(5);
        String actualTitle = Driver.get().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertEquals("Dashboard", actualTitle);
    }
}
