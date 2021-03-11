package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.DashBoardPage;
import com.fleetgru.pages.LoginPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.ConfigurationReader;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FLEET646LogoutStepDef {

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //go to login page
        Driver.get().get(ConfigurationReader.get("url"));
        //based on input enter that user information
        String username = null;
        String password = null;

        if (userType.equals("driver")) {
            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        } else if (userType.equals("sales manager")) {
            username = ConfigurationReader.get("sales_manager_username");
            password = ConfigurationReader.get("sales_manager_password");
        } else if (userType.equals("store manager")) {
            username = ConfigurationReader.get("store_manager_username");
            password = ConfigurationReader.get("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username, password);
    }
    @When("the user can logout with logout button")
    public void the_user_can_logout_with_logout_button() {
        new DashBoardPage().waitUntilLoaderScreenDisappear();
        LoginPage loginPage = new LoginPage();
        loginPage.logout1.click();
        loginPage.logout2.click();

        BrowserUtils.waitFor(2);

    }

    @When("the user logs in using following credentials {string} and {string}")
    public void the_user_logs_in_using_following_credentials_and(String username, String password) {
        new LoginPage().login(username,password);

    }
    @Then("the user should succesfully logout")
    public void the_user_should_succesfully_logout() {
        Assert.assertEquals("Login", Driver.get().getTitle());

    }
}
