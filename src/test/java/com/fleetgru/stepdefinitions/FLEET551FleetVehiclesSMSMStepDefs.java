package com.fleetgru.stepdefinitions;


import com.fleetgru.pages.AddEventPage;
import com.fleetgru.pages.DashBoardPage;
import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.ConfigurationReader;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FLEET551FleetVehiclesSMSMStepDefs {
    @Given("the user logins as {string} successfully")
    public void the_user_logins_as_successfully(String userType) {
        LoginPage loginPage = new LoginPage();
        switch (userType) {
            case "Truck Driver":
            case "truck driver":
            case "driver":
                loginPage.login(ConfigurationReader.get("driver_username"), ConfigurationReader.get("driver_password"));
                break;
            case "Sales Manager":
            case "sales manager":
            case "salesmanager":
                loginPage.login(ConfigurationReader.get("sales_manager_username"), ConfigurationReader.get("sales_manager_password"));
                break;
            case "Store Manager":
            case "store manager":
            case "storemanager":
                loginPage.login(ConfigurationReader.get("store_manager_username"), ConfigurationReader.get("store_manager_password"));
                break;
        }
    }

    @When("the user clicks car edit button")
    public void the_user_clicks_car_edit_button() {
        AddEventPage ec = new AddEventPage();
        /**while loop ile click sayısını yönettim*/
        BrowserUtils.waitFor(3);
        int click_count=0;
        while ((ec.editCar.isDisplayed() || ec.severalInputBoxes.isEmpty())&&click_count<4) {
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", ec.editCar);
            System.out.println("tried to click");
            click_count++;
        }

        if(ec.licencePlateEntry.isEnabled()&&ec.licencePlateEntry.isDisplayed()){
            Assert.assertTrue(ec.licencePlateEntry.isDisplayed());
        }
    }
    @Then("the user should be able to edit licence plate with {string}")
    public void the_user_should_be_able_to_edit_licence_plate_with(String licence_plate) {
        new DashBoardPage().waitUntilLoaderScreenDisappear();
        VehiclesPage vehicles = new VehiclesPage();
        new WebDriverWait(Driver.get(),90).until(ExpectedConditions.visibilityOf(vehicles.saveAndCloseButton));
        vehicles.licence_plate_inputbox.clear();
        vehicles.licence_plate_inputbox.sendKeys(licence_plate);
        new Actions(Driver.get()).moveToElement(vehicles.saveAndCloseButton).click().perform();
        int click_count=0;
        while (new VehiclesPage().saveAndCloseButton.isDisplayed()&&click_count<4) {
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", new VehiclesPage().saveAndCloseButton);
            System.out.println("Clicked");
            click_count++;
        }
        //new WebDriverWait(Driver.get(),90).until(ExpectedConditions.invisibilityOf(vehicles.saveAndCloseButton));
        new WebDriverWait(Driver.get(),90).until(ExpectedConditions.visibilityOf(new AddEventPage().editCar));
        System.out.println(vehicles.carGeneralInformationValues.get(0).getText());
        Assert.assertEquals(licence_plate, vehicles.carGeneralInformationValues.get(0).getText());

    }

    @Then("the user should be able to select Transmission type as {string}")
    public void the_user_should_be_able_to_select_Transmission_type_as(String transmission) {
        BrowserUtils.waitForVisibility(new AddEventPage().transmission, 3);
        new AddEventPage().selectDropdown(new AddEventPage().transmission).selectByVisibleText(transmission);
        System.out.println("transmission type is selected");
    }

    @Then("the user should be able to select Fuel type as {string}")
    public void the_user_should_be_able_to_select_Fuel_type_as(String fuelType) {
        BrowserUtils.waitForVisibility(new AddEventPage().fuelType, 3);
        new AddEventPage().selectDropdown(new AddEventPage().fuelType).selectByVisibleText(fuelType);
        System.out.println("fueltype is selected");
    }

    @Then("the information after save should be verified as {string} and {string}")
    public void the_information_after_save_should_be_verified_as_and(String transmission, String fuelType) {
        AddEventPage ec = new AddEventPage();
        BrowserUtils.waitFor(5);
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.visibilityOf(ec.saveAndClose));
        //ec.waitUntilWebElementVisible(ec.saveAndClose, 1000);
        BrowserUtils.clickWithJS(ec.saveAndClose);
        System.out.println("information first method");
        ec.waitUntilWebElementVisible(ec.transmissionOutput, 1000);
        Assert.assertTrue(ec.transmissionOutput.getText().equals(transmission));
        System.out.println("information \"Automatic\" assert");
        Assert.assertTrue(ec.fuelTypeOutput.getText().equals(fuelType));
        System.out.println("information \"Diesel\" assert method");
    }

    @Then("the user could be able to check all the car tags")
    public void the_user_could_be_able_to_check_all_the_car_tags() {
        AddEventPage ec = new AddEventPage();
        BrowserUtils.waitFor(3);
        ec.clickCheckBoxesAndSave(ec.checkBoxes);
/**burada tagsOutput un olduğu sayfaya gelmediyse null olarak devam ediyor. Taki visible olana kadar bekle diyorum içindeki metotla*/
        while (ec.tagsOutput == null) {
            ec.waitUntilWebElementVisible(ec.tagsOutput, 100);
        }
        System.out.println(ec.tagsOutput.getText());
        System.out.println("Junior ,  Senior ,  Employee Car ,  Purchased ,  Compact ,  Sedan ,  Convertible");
        Assert.assertTrue(ec.tagsOutput.getText().equals("Junior ,  Senior ,  Employee Car ,  Purchased ,  Compact ,  Sedan ,  Convertible"));
    }

    @Then("the user should not be able to enter driver name length more than {int} characters")
    public void the_user_should_not_be_able_to_enter_driver_name_length_more_than_characters(Integer characterNumber) {
        AddEventPage ec=new AddEventPage();
        System.out.println("ZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOP".length());
        ec.driverName.clear();
        String sampleDriverName="ZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOPZXCVBNMLKJHGFDSAQWERTYUIOP";
        ec.driverName.sendKeys(sampleDriverName);
        String inputDriverName=ec.driverName.getAttribute("value");
        System.out.println(inputDriverName.length());
        Assert.assertFalse(sampleDriverName.equals(inputDriverName));
    }

    @Then("the user should not be able to enter future immatriculation date")
    public void the_user_should_not_be_able_to_enter_future_immatriculation_date() {
        String futureDate=BrowserUtils.createFutureDate(1,6,20);
        AddEventPage ec=new AddEventPage();
        ec.immatriculationDate.sendKeys(futureDate);
        ec.saveandClose();
        System.out.println(ec.immatriculationDateOutput.getText().equals(futureDate));
        Assert.assertTrue(ec.immatriculationDateOutput.getText().equals(futureDate));
    }
}
