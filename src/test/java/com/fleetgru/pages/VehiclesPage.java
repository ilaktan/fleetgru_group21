package com.fleetgru.pages;



import com.fleetgru.utilities.BrowserUtils;
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

    @FindAll({@FindBy(css = "div.control-label"),
    @FindBy(xpath = "//div[@class='control-group attribute-row']//div[@class='control-label']")})
    public List<WebElement> carGeneralInformationValues;

    @FindAll({@FindBy(xpath = "(//div[@class='pull-right']//a)[1]"),
    @FindBy(css = "a.btn.icons-holder-text.no-hash")})//
    public WebElement addEvent;

    @FindBy(xpath = "(//tbody/tr[15]/td[4])[1]")
    public WebElement oneCarData;



//-Emine and Cansu---------------

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettingsButton;

    @FindBy (xpath = "//tbody//tr//td[@class='title-cell']")
    public List<WebElement> columnList;

    @FindBy(xpath = "//div//input[@placeholder='Quick Search']")
    public WebElement quickSearchInput;

    @FindBy (xpath = "//div[@class='table-wrapper']")
    public WebElement tableWrapper;

    @FindBy (xpath = "//div[@class='column-manager-no-columns']")
    public WebElement noColumnFoundMessage;

    @FindBy(css = "input[type='number']")
    public WebElement pageInputBox;

    @FindBy (xpath = "//div//a[@title='Refresh']")
    public WebElement refreshFilterButton;

    @FindBy (xpath = "//div//a[@title='Reset']")
    public WebElement resetButton;

    @FindBy (xpath = "//table//thead[@class='grid-header']/tr/th")
    public List<WebElement> tableColumnSize;

    @FindBy (xpath = "//a[@data-role='column-manager-select-all']")
    public WebElement selectAllButton;

    @FindBy (xpath = "//div//a[@title='Filters']")
    public WebElement filtersButton;

    @FindBy (xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilters;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement manageFilterSearchInput;

    @FindBy (xpath = "//ul[contains(@class, 'multiselect-checkboxes')]")
    public WebElement tableManageFilter;

    @FindBy(xpath = "(//ul[contains(@class, 'multiselect-checkboxes')])//li")
    public List<WebElement> listFilterOptions;

    @FindBy(xpath = "//div[contains(@class, 'btn filter-criteria-selector')]")
    public WebElement filterSelectorBox;

    @FindBy(xpath="(//button[@data-toggle='dropdown'])[1]")
    public WebElement containsDefault;

    @FindBy(xpath = "//a[@class='dropdown-item choice-value']")
    public List <WebElement> containsDropdownMenu;

    @FindBy (xpath = "(//input[@type='text'])[2]")
    public WebElement filterSelectorSearchInput;

    @FindBy (xpath = "//button[@class='btn btn-primary filter-update']")
    public WebElement updateButton;

    @FindBy (xpath = "(//table/tbody)/tr/td[5]")
    public List<WebElement> locationColumn;

    @FindBy(xpath = "(//table/tbody)/tr/td[4]")
    public List<WebElement> locationColumnDriver;

//---------------------------

    public void clickACarInTheTable() {
        BrowserUtils.waitFor(3);
        new WebDriverWait(Driver.get(),60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//tbody/tr[15]/td[4])[1]")));
        new Actions(Driver.get()).moveToElement(oneCarData).pause(200).click().perform();
        waitUntilLoaderScreenDisappear();

    }


//--Emine and Cansu----------------------

    public void clickColumn(String columnName){

        String xpath = "(//tbody//tr)[normalize-space()='"+columnName+"']";
        Driver.get().findElement(By.xpath(xpath)).click();

    }

    public void selectManageFilterOptions(String filterOptions){

        String xpath = "//label[@title='"+filterOptions+"']//input";
        Driver.get().findElement(By.xpath(xpath)).click();

    }

    public void manageSelectedFilter(String filterName){

        String xpath = "//div[@class='filter-item oro-drop']";

        Driver.get().findElement(By.xpath(xpath)).click();
    }
//--------------------------

}
