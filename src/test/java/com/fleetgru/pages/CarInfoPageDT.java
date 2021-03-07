package com.fleetgru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CarInfoPageDT extends BasePage{

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
