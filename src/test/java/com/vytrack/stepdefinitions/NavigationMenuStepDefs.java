package com.vytrack.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefs {


    @Given("the sales manager is on the login page")
    public void the_sales_manager_is_on_the_login_page() {
        System.out.println("Sales mananager is on login page");
    }

    @When("the sales manager enters credentials to login")
    public void the_sales_manager_enters_credentials_to_login() {
        System.out.println("enters credentials to login");
    }
    @Then("the sales manager should be able to login")
    public void the_sales_manager_should_be_able_to_login() {

        System.out.println("no the page");
    }
    @Then("the sales manager navigate to fleet Vehicles")
    public void the_sales_manager_navigate_to_fleet_Vehicles() {
        System.out.println("navigate to vehicles page");
    }
    @Then("the sales should see the vehicles as a title")
    public void the_sales_should_see_the_vehicles_as_a_title() {

        System.out.println("see the vehicles as a title");
    }

    @Then("the sales manager navigate to fleet Marketing Compaigns")
    public void the_sales_manager_navigate_to_fleet_Marketing_Compaigns() {
        System.out.println("navigate to vehicles page");
    }
    @Then("the sales should see the Campaigns as a title")
    public void the_sales_should_see_the_Campaigns_as_a_title() {
        System.out.println("see the vehicles as a title");

    }

    @Then("the sales manager navigate to fleet Activities Calendar events")
    public void the_sales_manager_navigate_to_fleet_Activities_Calendar_events() {

        System.out.println("navigate to vehicles page");


    }
    @Then("the sales should see the Calendars as a title")
    public void the_sales_should_see_the_Calendars_as_a_title() {
        System.out.println("see the vehicles as a title");
    }



}
