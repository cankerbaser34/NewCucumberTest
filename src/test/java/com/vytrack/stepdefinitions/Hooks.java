package com.vytrack.stepdefinitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp(){

        System.out.println("this is coming from BEFORE");

        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){

            final byte[] screenshot =((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot,"image/png","screenshot");

        }

        Driver.closeDriver();

    }

    @Before("@db")
    public void setUpst(){

        System.out.println("connecting to database...");
    }

    @After("@db")
    public void tearDownst(){

        System.out.println("connecting to database");
    }
}
