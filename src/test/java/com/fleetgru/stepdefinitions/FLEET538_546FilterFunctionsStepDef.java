package com.fleetgru.stepdefinitions;

import com.fleetgru.pages.DashBoardPage;
import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class FLEET538_546FilterFunctionsStepDef {

    DashBoardPage dashboardPage = new DashBoardPage();

    VehiclesPage vehicle = new VehiclesPage();

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {

        dashboardPage.waitUntilLoaderScreenDisappear();
        dashboardPage.navigateToModule(tab, module);
        dashboardPage.waitUntilLoaderScreenDisappear();

    }

    @When("the user click the Grid Setting button")
    public void the_user_click_the_Grid_Setting_button() {
        BrowserUtils.waitFor(5);
        vehicle.gridSettingsButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("following columns should be available under grid settings button")
    public void following_columns_should_be_available_under_grid_settings_button(List<String> expectedColumnList) {

        List<String> actualColumnList = BrowserUtils.getElementsText(vehicle.columnList);
        Assert.assertEquals(expectedColumnList, actualColumnList);
        System.out.println("actualColumnList = " + actualColumnList);
        System.out.println("expectedColumnList = " + expectedColumnList);
    }


    @When("the user searches column name {string} in the Quick Search input")
    public void the_user_searches_column_name_in_the_Quick_Search_input(String columnName) {
        BrowserUtils.waitFor(2);
        vehicle.quickSearchInput.sendKeys(columnName);
    }

    @Then("the system should display {string} column under dropdown menu.")
    public void the_system_should_display_column_under_dropdown_menu(String expected) {

        String actual = vehicle.tableWrapper.getText();

        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        Assert.assertTrue(actual.contains(expected));

    }

    @Then("the system should display {string} message under dropdown menu.")
    public void the_system_should_display_message_under_dropdown_menu(String expectedMessage) {
        BrowserUtils.waitFor(2);
        String actualMessage = vehicle.noColumnFoundMessage.getText();

        System.out.println("actualMessage = " + actualMessage);
        System.out.println("expectedMessage = " + expectedMessage);
        Assert.assertEquals("verify warning message", expectedMessage, actualMessage);

    }

    @When("the user go to page {string}")
    public void the_user_go_to_page(String pageNum) {
        BrowserUtils.waitFor(5);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].value=';'", vehicle.pageInputBox);
        vehicle.pageInputBox.sendKeys(pageNum);


    }

    @When("the user click the refresh button")
    public void the_user_click_the_refresh_button() {

        BrowserUtils.waitFor(5);
        vehicle.refreshFilterButton.click();
    }


    @When("the user click the reset button")
    public void the_user_click_the_reset_button() {
        BrowserUtils.waitFor(5);
        vehicle.closeGridSetting.click();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.get();
        javascriptExecutor.executeScript("arguments[0].click();", vehicle.resetButton2);
        BrowserUtils.waitFor(2);
    }

    @Then("page input should be {string}")
    public void page_input_should_be(String expectedPageNumber) {

        BrowserUtils.waitFor(5);
        String actual = vehicle.pageInputBox.getAttribute("value");

        Assert.assertEquals("verify page info", expectedPageNumber, actual);

    }


    @When("user click the {string} column")
    public void user_click_the_column(String columnName) {
        BrowserUtils.waitFor(5);
        vehicle.clickColumn(columnName);
    }

    @Then("the system should display {string} column on the webpage")
    public void the_system_should_display_column_on_the_webpage(String columnName) {
        BrowserUtils.waitFor(5);
        List<String> actualColumnList = BrowserUtils.getElementsText(vehicle.tableColumnSize);

        System.out.println("actualColumnList = " + actualColumnList);
        System.out.println("columnName = " + columnName);
        Assert.assertTrue(actualColumnList.contains(columnName));
    }

    @When("user unselect the {string} column")
    public void user_unselect_the_column(String columnName) {
        BrowserUtils.waitFor(2);
        vehicle.clickColumn(columnName);
        BrowserUtils.waitFor(1);
    }


    @Then("the system should not display {string} column on the webpage")
    public void the_system_should_not_display_column_on_the_webpage(String columnName) {
        BrowserUtils.waitFor(5);

        List<String> actualColumnList = BrowserUtils.getElementsText(vehicle.tableColumnSize);

        System.out.println("actualColumnList = " + actualColumnList);
        System.out.println("columnName = " + columnName);
        Assert.assertFalse(actualColumnList.contains(columnName));

    }


    @When("user click the Select All button")
    public void user_click_the_Select_All_button() {
        BrowserUtils.waitForVisibility(vehicle.selectAllButton, 5);


        JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
        executor.executeScript("arguments[0].click();", vehicle.selectAllButton);

        BrowserUtils.waitFor(4);
    }

    @Then("following columns should see on the webpage")
    public void following_columns_should_see_on_the_webpage(List<String> expectedColumnList) {
        BrowserUtils.waitFor(5);
        List<String> actualColumnList = BrowserUtils.getElementsText(vehicle.tableColumnSize);
        System.out.println("actualColumnList = " + actualColumnList);
        System.out.println("ExpectedColumnList = " + expectedColumnList);
        Assert.assertTrue("verify column list", actualColumnList.containsAll(expectedColumnList));

    }

    @When("the user click the filter button")
    public void the_user_click_the_filter_button() {
        BrowserUtils.waitFor(5);
        vehicle.filtersButton.click();
    }


    @When("the user click the manage filter button")
    public void the_user_click_the_manage_filter_button() {
        BrowserUtils.waitFor(4);
        vehicle.manageFilters.click();

    }

    @When("User searches {string} column in the Search input")
    public void user_searches_column_in_the_Search_input(String columnName) {
        BrowserUtils.waitFor(5);
        vehicle.manageFilterSearchInput.sendKeys(columnName);
        BrowserUtils.waitFor(1);

    }

    @Then("verifies driver not displayed")
    public void verifies_driver_not_displayed() {
        BrowserUtils.waitFor(5);
        String expected = "";
        String actual = vehicle.tableManageFilter.getText();
        Assert.assertEquals("verify match the column name", actual, expected);
        System.out.println("expected = " + expected);
        System.out.println("actual = " + actual);

    }

    @Then("following columns should be available under manage filter button")
    public void following_columns_should_be_available_under_manage_filter_button(List<String> expectedFilterOptions) {
        BrowserUtils.waitFor(5);

        List<String> actualFilterOptions = BrowserUtils.getElementsText(vehicle.listFilterOptions);

        Assert.assertEquals("verify filter options", expectedFilterOptions, actualFilterOptions);
        System.out.println("actualFilterOptions = " + actualFilterOptions);
        System.out.println("expectedFilterOptions = " + expectedFilterOptions);


    }


    @Then("the system should display the {string} option under dropdown menu")
    public void the_system_should_display_the_option_under_dropdown_menu(String expectedColumnName) {
        BrowserUtils.waitFor(5);
        String actual = vehicle.tableManageFilter.getText();
        Assert.assertTrue("verify match the column name", actual.contains(expectedColumnName));
        System.out.println("expectedColumnName = " + expectedColumnName);
        System.out.println("actual = " + actual);


    }

    @When("the user click the {string} button")
    public void the_user_click_the_button(String filterName) {
        BrowserUtils.waitFor(5);
        vehicle.selectManageFilterOptions(filterName);
    }

    @Then("the user should be able to see the {string} on the filter container")
    public void the_user_should_be_able_to_see_the_on_the_filter_container(String expectedFilter) {

        BrowserUtils.waitFor(5);
        String actual = vehicle.filterSelectorBox.getText();
        Assert.assertTrue("verify filter box", actual.contains(expectedFilter));
        System.out.println("expectedFilter = " + expectedFilter);
        System.out.println("actual = " + actual);

    }


    @When("the user click the {string} button on the filter container")
    public void the_user_click_the_button_on_the_filter_container(String filterName) {
        BrowserUtils.waitFor(5);
        vehicle.manageSelectedFilter(filterName);

    }

    @Then("verifies Contains dropdown menu displayed")
    public void verifies_Contains_dropdown_menu_displayed() {
        BrowserUtils.waitFor(5);
        Assert.assertEquals("Contains", vehicle.containsDefault.getText());
    }

    @Given("user clicks on Contains button;")
    public void user_clicks_on_Contains_button() {
        BrowserUtils.waitFor(5);
        vehicle.containsDefault.click();
    }

    @Then("user should be able to see following dropdown menu options")
    public void user_should_be_able_to_see_following_dropdown_menu_options(List<String> expectedDropdownOptions) {
        BrowserUtils.waitFor(5);
        List<String> actualDropdownOptions = BrowserUtils.getElementsText(vehicle.containsDropdownMenu);
        System.out.println("expectedDropdownOptions = " + expectedDropdownOptions);
        System.out.println("actualDropdownOptions = " + actualDropdownOptions);

        Assert.assertEquals(expectedDropdownOptions, actualDropdownOptions);

    }


    @When("the search {string} in the search box")
    public void the_search_in_the_search_box(String string) {
        BrowserUtils.waitFor(5);
        vehicle.filterSelectorSearchInput.sendKeys(string);
        BrowserUtils.waitFor(5);
        vehicle.updateButton.click();
    }

    @Then("The system should only show records that contain the Location {string}")
    public void the_system_should_only_show_records_that_contain_the_Location(String expected) {

        BrowserUtils.waitFor(5);

        List<String> actual = BrowserUtils.getElementsText(vehicle.locationColumn);

        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);

        Assert.assertTrue(actual.contains(expected));

    }
    @Then("the system should only show records that contain the Location {string} in the truck driver")
    public void the_system_should_only_show_records_that_contain_the_Location_in_the_truck_driver(String expected) {
        BrowserUtils.waitFor(2);
        List<String> actual = BrowserUtils.getElementsText(vehicle.locationColumnDriver);
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        Assert.assertTrue(actual.contains(expected));
    }

}
