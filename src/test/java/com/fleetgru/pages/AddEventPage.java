package com.fleetgru.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AddEventPage extends BasePage{

    @FindBy(css = "div.accordion-heading.clearfix")    ////div[@class='items list-box list-shaped']//div[@data-layout='separate' and @class='list-item']
    public List<WebElement> eventList;

    @FindBy(xpath = "(//a[contains(@href,'#accordion-item')][ @class='accordion-icon accordion-toggle collapsed'])[1]") //css = "a[data-toggle='collapse']"
    public WebElement lastExpandButtonCollapsed;
    //public List<WebElement> expandButtons;

    //seen after event items expanded
    //
    @FindAll({@FindBy(xpath = "//div[@class='items list-box list-shaped']//div[@data-layout='separate' and @class='list-item']//div[@class='controls']/div"),
    @FindBy(xpath = "//div[@class='responsive-block']//div[@class='control-label']")})
    public List<WebElement> eventSubEntries;



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
