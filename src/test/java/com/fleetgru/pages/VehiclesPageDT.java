package com.fleetgru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehiclesPageDT extends BasePage{

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




}
