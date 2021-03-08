package com.fleetgru.pages;



import com.fleetgru.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;


public class VehiclesPage extends BasePage{

    @FindBy(xpath="//a[@title='Create Car']")
    public WebElement createCarButton;

    @FindBy(xpath="//td[@data-column-label=\"License Plate\"]")
    public WebElement row1;

    @FindBy(xpath="//td[@data-column-label=\"Driver\"]")
    public WebElement row2;

    @FindBy(xpath="//td[@data-column-label=\"Location\"]")
    public WebElement row3;

    @FindBy(xpath="//td[@data-column-label=\"Chassis Number\"]")
    public WebElement row4;

    @FindBy(xpath="//td[@data-column-label=\"Model Year\"]")
    public WebElement row5;

    @FindBy(xpath="//td[@data-column-label=\"Last Odometer\"]")
    public WebElement row6;

    @FindBy(xpath="//td[@data-column-label=\"Immatriculation Date\"]")
    public WebElement row7;

    @FindBy(xpath="//td[@data-column-label=\"First Contract Date\"]")
    public WebElement row8;
    @FindBy(xpath="//td[@data-column-label=\"Catalog Value (VAT Incl.)\"]")
    public WebElement row9;
    @FindBy(xpath="//td[@data-column-label=\"Seats Number\"]")
    public WebElement row10;
    @FindBy(xpath="//td[@data-column-label=\"Doors Number\"]")
    public WebElement row11;
    @FindBy(xpath="//td[@data-column-label=\"Color\"]")
    public WebElement row12;
    @FindBy(xpath="//td[@data-column-label=\"Transmission\"]")
    public WebElement row13;
    @FindBy(xpath="//td[@data-column-label=\"Fuel Type\"]")
    public WebElement row14;
    @FindBy(xpath="//td[@data-column-label=\"CO2 Emissions\"]")
    public WebElement row15;
    @FindBy(xpath="//td[@data-column-label=\"Horsepower\"]")
    public WebElement row16;
    @FindBy(xpath="//td[@data-column-label=\"Horsepower Taxation\"]")
    public WebElement row17;
    @FindBy(xpath="//td[@data-column-label=\"Power (kW)\"]")
    public WebElement row18;

      @FindBy(css = "div[class='message-item message']")
    public WebElement savedTitleOnGeneralInformationPage;



    @FindBy(xpath = "(//button[@data-toggle='dropdown'])[1]")
    public WebElement dropdownWebtableShowElement;

    @FindBy(xpath = "//input[@data-name='field__license-plate']")
    public WebElement licence_plate_inputbox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement saveAndCloseButton;

    @FindBy(css = "div.control-label")
    public List<WebElement> carGeneralInformationValues;

    @FindAll({@FindBy(xpath = "(//div[@class='pull-right']//a)[1]"),
    @FindBy(css = "a.btn.icons-holder-text.no-hash")})//
    public WebElement addEvent;

    @FindBy(xpath = "(//tbody/tr[15]/td[4])[1]")
    public WebElement oneCarData;

    public void clickACarInTheTable() {
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody/tr[15]/td[4])[1]")));
        new Actions(Driver.get()).moveToElement(oneCarData).pause(200).click().perform();
        waitUntilLoaderScreenDisappear();

    }

}
