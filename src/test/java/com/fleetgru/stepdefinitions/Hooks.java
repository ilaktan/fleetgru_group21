package com.fleetgru.stepdefinitions;


import com.fleetgru.utilities.ConfigurationRW;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tthis is coming from BEFORE");
        Driver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.get().get(ConfigurationRW.get("url"));
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        //log out

        try{
            WebElement username= Driver.get().findElement(By.cssSelector("#user-menu>a"));
            WebElement logout= Driver.get().findElement(By.cssSelector("#user-menu ul .no-hash"));
            new WebDriverWait(Driver.get(),20).until(ExpectedConditions.visibilityOf(username));
            if(!username.isDisplayed()) Driver.get().navigate().refresh();
            new WebDriverWait(Driver.get(),10).until(ExpectedConditions.visibilityOf(username));
            new Actions(Driver.get()).moveToElement(username).click().perform();
            new WebDriverWait(Driver.get(),20).until(ExpectedConditions.visibilityOf(logout));
            new Actions(Driver.get()).moveToElement(logout).click().perform();
        }catch(NoSuchElementException | ElementNotInteractableException|TimeoutException e){

        }


        //close Driver
        Driver.closeDriver();

    }


}
