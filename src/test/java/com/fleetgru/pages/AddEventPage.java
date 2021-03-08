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
  
    @FindBy(css = "div.accordion-heading.clearfix")    ////div[@class='items list-box list-shaped']//div[@data-layout='separate' and @class='list-item']
    public List<WebElement> eventList;

    @FindBy(xpath = "(//a[contains(@href,'#accordion-item')][ @class='accordion-icon accordion-toggle collapsed'])[1]") //css = "a[data-toggle='collapse']"
    public WebElement lastExpandButtonCollapsed;
    //public List<WebElement> expandButtons;

    //seen after event items expanded
    @FindBy(xpath = "//div[@class='items list-box list-shaped']//div[@data-layout='separate' and @class='list-item']//div[@class='controls']/div")
    public List<WebElement> eventSubEntries;

    @FindBy(css = "a.action.btn")
    public WebElement refreshButton;

    //Title
    @FindBy(xpath = "//input[@data-name='field__title']")
    public WebElement eventTitle;
    //organizer
    @FindBy(xpath = "//input[@data-name='field__organizer-display-name']")
    public WebElement organizerName;
    //organizeremail
    @FindBy(xpath = "//input[@data-name='field__organizer-email']")
    public WebElement organizeremail;
    //startdate "Feb 25,2021"
    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[1]")
    public WebElement startdate;
    //enddate    "Feb 25,2022"
    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[2]")
    public WebElement enddate;
    //alldayevent
    @FindBy(xpath = "//fieldset//div[@class='controls']/input[@data-name='field__all-day']")  //(//div/input[@type='checkbox'])[2]   //input[@name='oro_calendar_event_form[allDay]']   //input[contains(@id,'oro_calendar_event_form_al')]   //input[@data-name='field__all-day']
    public WebElement allDayEvent;
    //repeat
    @FindBy(xpath = "(//div/input[@type='checkbox'])[3]")
    public WebElement repeat;
    //select repeats weekly
    @FindBy(css = "select[data-name='recurrence-repeats']")
    public WebElement repeatsDropdown;
    //select monday
    @FindBy(xpath = "//label[@class='multi-checkbox-control__item'][2]/input")
    public WebElement checkBoxMonday;
    @FindBy(css = "button.btn.btn-primary")
    public WebElement saveButton;

    @FindBy(css = "div[class='message-item message']")
    public WebElement savedTitleOnGeneralInformationPage;

    @FindBy(css = "span[id*='ui-id']")
    public List<WebElement> titleOfAddEvent;

    @FindBy(css = "button[title='close']")
    public WebElement closeButton;


}
