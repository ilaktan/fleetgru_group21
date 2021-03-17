package com.fleetgru.stepdefinitions;


import com.fleetgru.pages.*;
import com.fleetgru.pages.DashBoardPage;
import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.ConfigurationRW;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
                loginPage.login(ConfigurationRW.get("driver_username"), ConfigurationRW.get("driver_password"));
                break;
            case "Sales Manager":
            case "sales manager":
            case "salesmanager":
                loginPage.login(ConfigurationRW.get("sales_manager_username"), ConfigurationRW.get("sales_manager_password"));
                break;
            case "Store Manager":
            case "store manager":
            case "storemanager":
                loginPage.login(ConfigurationRW.get("store_manager_username"), ConfigurationRW.get("store_manager_password"));
                break;
        }
    }

    @When("the user clicks car edit button")
    public void the_user_clicks_car_edit_button() {
        AddEventPage ec = new AddEventPage();
        VehiclesPage v=new VehiclesPage();
        /**while loop ile click sayısını yönettim*/
        if(!v.editCar.isDisplayed()) Driver.get().navigate().refresh();
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.visibilityOf(v.editCar));
        int click_count=0;
        while (click_count<11) {
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", v.editCar);
            System.out.println("clicked editCar");
            click_count++;
            BrowserUtils.waitFor(1);
            if(ec.saveAndClose.isDisplayed()) break;
        }

    }
    @Then("the user should be able to edit licence plate with {string}")
    public void the_user_should_be_able_to_edit_licence_plate_with(String licence_plate) {
        new DashBoardPage().waitUntilLoaderScreenDisappear();
        VehiclesPage v = new VehiclesPage();
        AddEventPage ec=new AddEventPage();
        new WebDriverWait(Driver.get(),90).until(ExpectedConditions.visibilityOf(ec.saveAndClose));
        v.licence_plate_inputbox.clear();
        v.licence_plate_inputbox.sendKeys(licence_plate);
        ec.saveandClose();

        BrowserUtils.waitFor(1);
        //Assert.assertTrue("Entity saved is printed",Driver.get().findElement(By.xpath("//div[@class='flash-messages-holder']//div[@class='message']")).isDisplayed());

        System.out.println(v.carGeneralInformationValues.get(0).getText());
        Assert.assertEquals(licence_plate, v.carGeneralInformationValues.get(0).getText());

    }

    @Then("the user should be able to select Transmission type as {string}")
    public void the_user_should_be_able_to_select_Transmission_type_as(String transmission) {
        BrowserUtils.waitForVisibility(new AddEventPage().transmission, 10);
        new AddEventPage().selectDropdown(new AddEventPage().transmission).selectByVisibleText(transmission);
        //System.out.println("transmission type is selected");
    }

    @Then("the user should be able to select Fuel type as {string}")
    public void the_user_should_be_able_to_select_Fuel_type_as(String fuelType) {
        BrowserUtils.waitForVisibility(new AddEventPage().fuelType, 3);
        new AddEventPage().selectDropdown(new AddEventPage().fuelType).selectByVisibleText(fuelType);
        //System.out.println("fueltype is selected");
    }

    @Then("the information after save should be verified as {string} and {string}")
    public void the_information_after_save_should_be_verified_as_and(String transmission, String fuelType) {
        VehiclesPage v = new VehiclesPage();
        AddEventPage ec=new AddEventPage();
        BrowserUtils.waitFor(5);
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.visibilityOf(ec.saveAndClose));

        int click_count=0;
        while ((ec.saveAndClose.isDisplayed() || ec.severalInputBoxes.size()>0)&&click_count<2) {
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", ec.saveAndClose);
            System.out.println("click saveandclose");
            click_count++;
        }
        //System.out.println("information first method");
        new WebDriverWait(Driver.get(),30).until(ExpectedConditions.visibilityOf(v.editCar));
        new WebDriverWait(Driver.get(),10).until(ExpectedConditions.visibilityOf(v.transmissionOutput));
        Assert.assertTrue(v.transmissionOutput.getText().equals(transmission));
        System.out.println("information \"Automatic\" assert");
        new WebDriverWait(Driver.get(),10).until(ExpectedConditions.visibilityOf(v.fuelTypeOutput));
        Assert.assertTrue(v.fuelTypeOutput.getText().equals(fuelType));
        System.out.println("information \"Diesel\" assert method");
    }

    @Then("the user could be able to check all the car tags")
    public void the_user_could_be_able_to_check_all_the_car_tags() {
        AddEventPage ec = new AddEventPage();
        VehiclesPage v = new VehiclesPage();
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']")));
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.invisibilityOf(Driver.get().findElement(By.xpath("//div[@class='loader-mask shown']"))));
        ec.clickCheckBoxesAndSave(ec.checkBoxes);

    /**
    burada tagsOutput un olduğu sayfaya gelmediyse null olarak devam ediyor. Taki visible olana kadar bekle diyorum içindeki metotla
        while (v.tagsOutput == null) {
            ec.waitUntilWebElementVisible(v.tagsOutput, 100);
        }
    */
        new WebDriverWait(Driver.get(),30).until(ExpectedConditions.visibilityOf(v.tagsOutput));
        System.out.println(v.tagsOutput.getText());
        System.out.println("Junior ,  Senior ,  Employee Car ,  Purchased ,  Compact ,  Sedan ,  Convertible");
        Assert.assertTrue(v.tagsOutput.getText().equals("Junior ,  Senior ,  Employee Car ,  Purchased ,  Compact ,  Sedan ,  Convertible"));
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
