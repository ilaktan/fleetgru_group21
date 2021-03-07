package com.fleetgru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddEventPage extends BasePage{
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
    @FindBy(css = "div.filter-item.oro-drop>div")
    public WebElement activityTypeButton;

    @FindBy(xpath="//label/input[@value='Oro_Bundle_CalendarBundle_Entity_CalendarEvent']")
    public WebElement calendarEventOption;


    @FindBy(css="div.details")
    public List<WebElement> FilteredActivityTypeList;


    @FindBy(css="div.btn.filter-criteria-selector.oro-drop-opener.oro-dropdown-toggle.filter-default-value")
    public WebElement dataRangeButton;

    @FindBy(xpath="(//input[@placeholder='Choose a date'])[1]")
    public WebElement date1;

    @FindBy(xpath="(//input[@placeholder='time'])|1|")
    public WebElement time1;

    @FindBy(xpath="(//input[@placeholder='Choose a date'])[2]")
    public WebElement date2;

    @FindBy(xpath="(//input[@placeholder='time'])|2|")
    public WebElement time2;

    @FindBy(xpath="//button[text()='Update']")
    public WebElement updateButton;

    @FindBy(css="i.fa-refresh")
    public WebElement refreshButton;

    @FindBy(xpath="//a[@data-action-name='goto_previous']")
    public WebElement newerButton;

    @FindBy(xpath="//a[@data-action-name='goto_next']")
    public WebElement olderButton;

    @FindBy(xpath="//i[@class='date']")
    public List<WebElement> dates;

    @FindBy(xpath="//i[@class='date']")
    public WebElement date;

    @FindBy(xpath="(//select)[1]")
    public WebElement activityButtonJS;


}
