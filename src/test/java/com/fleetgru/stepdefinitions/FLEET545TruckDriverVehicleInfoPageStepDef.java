package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.DashBoardPage;
import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;
import java.util.List;

public class FLEET545TruckDriverVehicleInfoPageStepDef {

    DashBoardPage dashBoardPage = new DashBoardPage();
    VehiclesPage vehiclesPage = new VehiclesPage();

    List<String> actualPageInfo = new ArrayList<>();

    @Then("the sub-title should be {string}")
    public void the_sub_title_should_be_(String expectedSubTitle) {
        //BrowserUtils.waitForVisibility(dashBoardPage.pageSubTitle, 5);
        BrowserUtils.waitFor(5);
        Assert.assertEquals("verify page subtitle", expectedSubTitle, dashBoardPage.getPageSubTitle());
        System.out.println(dashBoardPage.getPageSubTitle());
        System.out.println(expectedSubTitle);
    }

    @Then("the page number should be {string}")
    public void the_page_number_should_be(String expected) {

        BrowserUtils.waitForVisibility(vehiclesPage.pageInputBox, 5);
        String actual = vehiclesPage.pageInputBox.getAttribute("value");
        Assert.assertEquals("verify default page number", expected, actual);
        System.out.println(actual);
        System.out.println(expected);
    }

    @When("the user should use the forward button")
    public void the_user_should_use_the_forward_button() {

        for (int i = 0; i < 5; i++) {
            BrowserUtils.waitFor(5);
            actualPageInfo.add(vehiclesPage.pageInputBox.getAttribute("value"));
            vehiclesPage.forwardButton.click();
            BrowserUtils.waitForPageToLoad(5);
        }
    }

    @When("the user should use the back button")
    public void the_user_should_use_the_back_button() {
        BrowserUtils.waitFor(3);

        for (int i = 0; i < 6; i++) {
            actualPageInfo.add(vehiclesPage.pageInputBox.getAttribute("value"));
            vehiclesPage.backButton.click();
            BrowserUtils.waitFor(2);
        }
    }

    @Then("verify the page numbers")
    public void verify_the_page_numbers(List<String> expectedPageInfo) {
        Assert.assertEquals("verify page infos", expectedPageInfo, actualPageInfo);
        System.out.println("expectedPageInfo = " + expectedPageInfo);
        System.out.println("actualPageInfo = " + actualPageInfo);
    }

    @When("the user writes on the page input box {string}")
    public void the_user_writes_on_the_page_input_box(String pageNumber) {
        BrowserUtils.waitFor(3);

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].value=';'", vehiclesPage.pageInputBox);
        BrowserUtils.waitFor(1);
        vehiclesPage.pageInputBox.sendKeys(pageNumber);
        BrowserUtils.waitFor(1);

    }

    @Then("the page input box should be {string}")
    public void the_page_input_box_should_be(String expectedInputNum) {

        BrowserUtils.waitFor(5);
        String actualInputNum = vehiclesPage.pageInputBox.getAttribute("value");
        Assert.assertEquals("verify page input box",expectedInputNum, actualInputNum);
        System.out.println("expectedInputNum = " + expectedInputNum);
        System.out.println("actualInputNum = " + actualInputNum);

    }

    @Then("the per page button should be {string}")
    public void the_per_page_button_should_be(String expectedDefaultNum) {
        BrowserUtils.waitFor(5);
        String actualDefaultNum = vehiclesPage.perPageButton.getText();
        Assert.assertEquals("verify default per-page number",expectedDefaultNum, actualDefaultNum);

    }

    @When("the user clicks the view per page button")
    public void the_user_clicks_the_view_per_page_button() {
        BrowserUtils.waitFor(5);
        vehiclesPage.perPageButton.click();

    }

    @When("the user select the item {string}")
    public void the_user_select_the_item(String numberItem) {
        BrowserUtils.waitFor(5);
        vehiclesPage.selectPerPageItem(numberItem);
    }

    @Then("the dropdown should be {string}")
    public void the_dropdown_should_be(String expectedPerPageNum) {
        BrowserUtils.waitFor(5);
        String actualPerPageNum = vehiclesPage.perPageButton.getText();
        Assert.assertEquals("verify per-page number", expectedPerPageNum, actualPerPageNum);

    }

    @Then("row size should be {string}")
    public void row_size_should_be(String expectedRowSize) {
        BrowserUtils.waitFor(5);
        int actualRowSize = vehiclesPage.tableRowSize.size();
        Assert.assertEquals("verify row size", Integer.parseInt(expectedRowSize), actualRowSize);

    }


    @When("the user clicks on the Export Grid button")
    public void the_user_clicks_on_the_Export_Grid_button() {
        BrowserUtils.waitFor(5);
        vehiclesPage.exportGridButton.click();
        BrowserUtils.waitFor(1);

    }

    @When("User click the {string}")
    public void User_click_the(String formatType) {
        BrowserUtils.waitFor(5);
        vehiclesPage.selectFormat(formatType);

    }

    @Then("the user should be able to see success message on the page")
    public void the_user_should_be_able_to_see_success_message_on_the_page() {
        BrowserUtils.waitForVisibility(vehiclesPage.successMessage, 5);
        String actualMessage = vehiclesPage.successMessage.getText();
        String expectedMessage = "Export started successfully. You will receive email notification upon completion.";

        Assert.assertEquals("verify success message", expectedMessage, actualMessage);
        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("actualMessage = " + actualMessage);

    }


}
