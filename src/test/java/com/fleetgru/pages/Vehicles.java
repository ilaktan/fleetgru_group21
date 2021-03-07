package com.fleetgru.pages;

import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class Vehicles extends BasePage {


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
    @FindBy(xpath = "(//div[@class='pull-right']//a)[1]")          //
    public WebElement addEvent;

    @FindBy(xpath = "(//tbody/tr[15]/td[4])[1]")
    public WebElement oneCarData;



    public void selectAndClickAnyCarInTheTable() {
        Random random = new Random();
        int start = 1;
        int end = 25;
        int selectedcarindex = random.nextInt(end + 1 - start) + start;
        WebElement oneCarData = Driver.get().findElement(By.xpath("(//tbody/tr[15]/td[4])[1]"));
        int i = 0;

        while (i < 10) {
            try {
                if (oneCarData.isDisplayed()) {
                    oneCarData.click();
                    break;
                }

                new Actions(Driver.get()).moveToElement(oneCarData).pause(200).click().perform();
            } catch (StaleElementReferenceException | ElementClickInterceptedException s) {
                i++;
            }
        }
        waitUntilLoaderScreenDisappear();

    }






}
