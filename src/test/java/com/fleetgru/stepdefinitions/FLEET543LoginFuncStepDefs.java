package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.AddEventPage;
import com.fleetgru.pages.LoginPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.ConfigurationRW;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

public class FLEET543LoginFuncStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationRW.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);

    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        String username = ConfigurationRW.get("driver_username");
        String password = ConfigurationRW.get("driver_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(5);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Dashboard", actualTitle);
        try {
            if (new AddEventPage().titleOfAddEvent.isDisplayed()) {
                new Actions(Driver.get()).moveToElement(Driver.get().findElement(By.cssSelector("button[type='reset']"))).click().perform();
            }
        } catch (NoSuchElementException e) {
        }
    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {
        String username = ConfigurationRW.get("sales_manager_username");
        String password = ConfigurationRW.get("sales_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);

    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        String username = ConfigurationRW.get("store_manager_username");
        String password = ConfigurationRW.get("store_manager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username, password);
    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String string, String string2) {
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationRW.get(string);
        String password = ConfigurationRW.get(string2);

        loginPage.login(username, password);
        //new DashBoardPage().waitUntilLoaderScreenDisappear();
    }

    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        BrowserUtils.waitFor(2);
        try {
            Assert.assertEquals(expectedTitle, new LoginPage().invalid.getText());


        } catch (Exception e) {
            String passwordMessage = new LoginPage().password.getAttribute("validationMessage");
            String usernameMessage = new LoginPage().userName.getAttribute("validationMessage");

            String usernameinput = new LoginPage().userName.getAttribute("value");
            String passwordinput = new LoginPage().password.getAttribute("value");
            System.out.println("usernameinput = " + usernameinput);
            System.out.println("passwordinput = " + passwordinput);

            if (usernameinput == null && passwordinput == null) {
                Assert.assertEquals(expectedTitle, usernameMessage);
            } else if (usernameinput == null && passwordinput != null) {
                Assert.assertEquals(expectedTitle, usernameMessage);
            } else if (usernameinput != null && passwordinput == null) {
                Assert.assertEquals(expectedTitle, passwordMessage);

            }


        }
    }
}
