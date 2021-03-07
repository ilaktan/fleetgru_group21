package com.fleetgru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEventPageDT extends BasePage{
    @FindBy(xpath="//input[@name='custom_entity_type[LicensePlate]']")
    public WebElement licensePlate;

    @FindBy(css="button.btn.btn-success.action-button")
    public WebElement saveCloseButton;

    @FindBy(xpath="//div[text()='Entity saved']")
    public WebElement entitySavedMessage;

    @FindBy(xpath="(//button[@*='open-dialog-widget'])[1]")
    public WebElement addButtonModel;

    @FindBy(xpath="(//input[@tabindex='-1'])[1]")
    public WebElement addModel;

    @FindBy(xpath="//button[text()='Select']")
    public WebElement selectButton;

    @FindBy(xpath="(//input[@tabindex='-1'])[1]")
    public WebElement addMake;


    @FindBy(xpath="(//button[@*='open-dialog-widget'])[2]")
    public WebElement addButtonMake;

    @FindBy(xpath="//a[text()='Rouge']")
    public WebElement vehicleModelline;

    @FindBy(xpath="//a[text()='Nissan']")
    public WebElement vehicleMakeline;

    @FindBy(xpath="//li[.='Activity']")
    public WebElement activityButton;


}
