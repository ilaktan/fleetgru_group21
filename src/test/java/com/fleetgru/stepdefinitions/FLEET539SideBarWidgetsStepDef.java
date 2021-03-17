package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class FLEET539SideBarWidgetsStepDef {

    VehiclesPage vehicle = new VehiclesPage();

    @When("the user clicks on plus sign")
    public void the_user_clicks_on_plus_sign() {
        BrowserUtils.waitFor(3);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get();
        javascriptExecutor.executeScript("arguments[0].click();", vehicle.plusSign);

    }

    @When("the user clicks enter keyword inputbox")
    public void the_user_clicks_enter_keyword_inputbox() {
        BrowserUtils.waitFor(3);
        vehicle.keywordInputBox.click();
    }

    @When("sends Recent emails keys")
    public void sends_Recent_emails_keys() {
        BrowserUtils.waitFor(3);
        vehicle.keywordInputBox.sendKeys("Recent emails");
    }

    @Then("verify Recent email title displayed")
    public void verify_Recent_email_title_displayed() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(vehicle.recentEmailTitle.isDisplayed());
    }

    @When("clicks on add button")
    public void clicks_on_add_button() {
        BrowserUtils.waitFor(5);
        vehicle.addBtnForRecent.click();
    }

    @Then("verify Added sign displayed")
    public void verify_Added_sign_displayed() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(vehicle.addedSign.isDisplayed());
    }

    @When("clicks on Close Button")
    public void clicks_on_Close_Button() {
        BrowserUtils.waitFor(3);
        vehicle.closeGridSetBtn.click();
    }

    @Then("verify Recent Email Widget added on the plus sign.")
    public void verify_Recent_Email_Widget_added_on_the_plus_sign() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(vehicle.recentEmailWidget.isDisplayed());

    }

    @Then("user should be able to click add button for Sticky Note")
    public void user_should_be_able_to_click_add_button_for_Sticky_Note() {
        BrowserUtils.waitFor(3);
        vehicle.addBtnForStickyNotes.click();
    }

    @Then("verify Sticky Note Widget added.")
    public void verify_Sticky_Note_Widget_added() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(vehicle.stickNotesWidget.isDisplayed());
    }

    @Then("user should be able to click add button Task list")
    public void user_should_be_able_to_click_add_button_Task_list() {
        BrowserUtils.waitFor(3);
        vehicle.addBtnForTaskList.click();
    }

    @Then("verify Task list added.")
    public void verify_Task_list_added() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(vehicle.taskListWidget.isDisplayed());

    }

    @When("user clicks on pin button")
    public void user_clicks_on_pin_button() {
        BrowserUtils.waitFor(3);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get();
        javascriptExecutor.executeScript("arguments[0].click();", vehicle.pinBtn);
    }

    @Then("verifies existing page pinned")
    public void verifies_existing_page_pinned() {
        BrowserUtils.waitFor(4);
        Assert.assertTrue(vehicle.pinnedPage.isDisplayed());

    }

    @Then("verifies Learn how to use this space text displayed")
    public void verifies_Learn_how_to_use_this_space_text_displayed() {
        BrowserUtils.waitFor(7);
        WebElement warningTexts = null;
        try {
            warningTexts = new VehiclesPage().warningText;
        } catch (NoSuchElementException e) {
        }
        Assert.assertTrue(warningTexts != null);
    }

    @When("user clicks on favourite sign button")
    public void user_clicks_on_favourite_sign_button() {
        BrowserUtils.waitFor(5);
        vehicle.favoriteSignBtn.click();
    }

    @When("clicks on dropdown menu")
    public void clicks_on_dropdown_menu() {
        BrowserUtils.waitFor(3);
        vehicle.dropdownMenu.click();
        ;
    }

    @When("user clicks on Favorites")
    public void user_clicks_on_Favorites() {
        BrowserUtils.waitFor(5);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get();
        javascriptExecutor.executeScript("arguments[0].click();", vehicle.Favorites);
    }

    @Then("verifies existing favourites pages displayed")
    public void verifies_existing_favourites_pages_displayed() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(vehicle.favoritePages.isDisplayed());;
    }

    @When("the user should be able to click on Close Button")
    public void the_user_should_be_able_to_click_on_Close_Button() {
        vehicle.closeButton.click();
        BrowserUtils.waitFor(7);
    }
    @Then("user close Favorites button")
    public void user_close_Favorites_button() {
        BrowserUtils.waitFor(3);
        vehicle.closeBTN.click();
    }



}
