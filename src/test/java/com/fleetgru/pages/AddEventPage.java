package com.fleetgru.pages;

import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;

public class AddEventPage extends BasePage{
    @FindBy(xpath = "//div[@class='controls']/input[@type='text']")
    public List<WebElement> severalInputBoxes;

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

    @FindAll({
            @FindBy(css = "div[class='message-item message']"),
            @FindBy(xpath = "//strong")
    })
    public WebElement savedTitleOnGeneralInformationPage;

    @FindBy(css = "span[id*='ui-id']")
    public List<WebElement> titleOfAddEvents;

    @FindBy(css = "span[id*='ui-id']")
    public WebElement titleOfAddEvent;

    @FindBy(css = "button[title='close']")
    public WebElement closeButton;

   // Joseph Locators

    @FindBy(xpath = "(//select)[1]")
    public WebElement transmission;

    @FindBy(xpath = "(//select)[2]")
    public WebElement fuelType;

    @FindBy(xpath = "//div/button[@type='submit']")
    public WebElement saveAndClose;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> checkBoxes;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement firstCheckBox;

    @FindBy(xpath = "//input[contains(@id,'custom_entity_type_Driver')]")
    public WebElement driverName;

    @FindBy(xpath = "//input[contains(@id,'date_selector_custom_entity_type_ImmatriculationDate')]")
    public WebElement immatriculationDate;

    @FindBy(xpath = "(//div[@class='control-label'])[8]")
    public WebElement immatriculationDateOutput;

    @FindBy(xpath = "//input[contains(@id,'custom_entity_type_LicensePlate')]")
    public WebElement licencePlateEntry;

    @FindAll({@FindBy(xpath = "(//div[@class='pull-right']//a)[1]"),
            @FindBy(css = "a.btn.icons-holder-text.no-hash")})//
    public WebElement addEvent;

    public void clickCheckBoxesAndSave(List<WebElement> checkBoxes){
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.visibilityOf(firstCheckBox));
        int count=0;
        outer: for (WebElement checkBox : checkBoxes) {
            if(!checkBox.isSelected()) {
                checkBox.click();
                System.out.println("checkBox clicked");
                count++;
            }
            if(checkBox.isSelected()) {
                count++;
            }
            if(count==7) break outer;
        }
        new AddEventPage().saveandClose();
    }
    public void saveandClose(){
        VehiclesPage v=new VehiclesPage();
        int click_count=0;
        while (saveAndClose.isDisplayed()&&click_count<11) {
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", saveAndClose);
            System.out.println("Clicked");
            click_count++;
            if(v.editCar.isDisplayed()) break;
        }
    }
    public void clickAddEventButton(){
        By addevent=By.xpath("//div[@class=\"pull-right\"]/div/div/a");
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.visibilityOfElementLocated(addevent));
        while(titleOfAddEvents.size()<1) {
            ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", addEvent);
            BrowserUtils.clickWithJS(addEvent);
        }
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("span[id*='ui-id']")));
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.textToBePresentInElement(titleOfAddEvent,"A"));
        Assert.assertEquals(new AddEventPage().titleOfAddEvent.getText(),"Add Event");

    }
    public void clickCancelAddEventButton(){
        new Actions(Driver.get()).moveToElement(Driver.get().findElement(By.cssSelector("button[type='reset']"))).click().perform();
    }

    public void editAddEvent(){
        try{new WebDriverWait(Driver.get(),60).until(ExpectedConditions.invisibilityOf(Driver.get().findElement(By.xpath("//div[@class='loader-mask shown']"))));}catch(NoSuchElementException e){}
        eventTitle.sendKeys("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        organizerName.sendKeys("Michael Knight");
        organizeremail.sendKeys("m.knight@organizer.com");
        startdate.clear();
        startdate.sendKeys("Feb 25, 2021");
        enddate.clear();
        enddate.sendKeys("Feb 25, 2022"+ Keys.ESCAPE);
        JavascriptExecutor j=(JavascriptExecutor) Driver.get();
        j.executeScript("arguments[0].click();", allDayEvent);
        j.executeScript("arguments[0].click();", repeat);
        Select select=new Select(repeatsDropdown);
        select.selectByVisibleText("Weekly");
        checkBoxMonday.click();
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", saveButton);
        waitUntilWebElementVisible(savedTitleOnGeneralInformationPage,500);
        Assert.assertEquals("verified the title of the Event","ABCDEFGHIJKLMNOPQRSTUVWXYZ", savedTitleOnGeneralInformationPage.getText());
        System.out.println("end of the user should edit the required fields step");
    }

    public void verifyGeneralInfoWithActivityTab(){
        try{new WebDriverWait(Driver.get(),60).until(ExpectedConditions.invisibilityOf(Driver.get().findElement(By.xpath("//div[@class='loader-mask shown']"))));}catch(NoSuchElementException e){}
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.accordion-heading.clearfix")));
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].scrollIntoView(true);", lastExpandButtonCollapsed);
        new Actions(Driver.get()).moveToElement(lastExpandButtonCollapsed).pause(200).click().perform();

        //locator belongs
        try{new WebDriverWait(Driver.get(),60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='items list-box list-shaped']//div[@data-layout='separate' and @class='list-item']//div[@class='controls']/div")));} catch(TimeoutException e){};
        List<String> listEventSubEntries=BrowserUtils.getElementsText(eventSubEntries);
        List<String> expected= Arrays.asList("ABCDEFGHIJKLMNOPQRSTUVWXYZ","N/A","Feb 25, 2021, 12:00 AM","Feb 25, 2022, 12:00 AM","Yes","Weekly every 1 week on Monday");
        System.out.println("List<String> expected= Arrays.asList(\"ABCDEFGHIJKLMNOPQRSTUVWXYZ\",\"N/A\",\"Feb 25, 2021, 12:00 AM\",\"Feb 25, 2022, 12:00 AM\",\"Yes\",\"Weekly every 1 week on Monday\");   CREATED");
        for(int i=0;i<expected.size();i++){
            Assert.assertEquals((i+1)+"th element fits",expected.get(i),listEventSubEntries.get(i));
            System.out.println((i + 1) + "th element fits");
        }
    }
}
