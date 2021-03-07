package com.fleetgru.pages;

import com.fleetgru.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddEvent extends BasePage{

    @FindBy(xpath = "//div[@class='items list-box list-shaped']//div[@data-layout='separate' and @class='list-item']")
    public List<WebElement> eventList;

    @FindBy(xpath = "//a[contains(@href,'#accordion-item')][ @class='accordion-icon accordion-toggle collapsed']") //css = "a[data-toggle='collapse']"
    public WebElement expandButtonCollapsed;
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
    public void clickExpandWhenVisible(){
        waitUntilLoaderScreenDisappear();
        if (expandButtonCollapsed.isDisplayed()) {
            waitUntilWebElementVisible(expandButtonCollapsed,10000);
            while(new Vehicles().carGeneralInformationValues.size()<1) {
                BrowserUtils.clickWithJS(expandButtonCollapsed);
            }
            waitUntilWebElementVisible(savedTitleOnGeneralInformationPage,1000);
            BrowserUtils.waitFor(1);
        }
//        while(new AddEvent().titleOfAddEvent.size()<1) {
//            BrowserUtils.clickWithJS(new Vehicles().addEvent);
//        }

    }
}
