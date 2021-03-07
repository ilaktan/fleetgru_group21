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


public class VehiclesPage extends BasePage {


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
