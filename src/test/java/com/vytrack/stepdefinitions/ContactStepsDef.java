package com.vytrack.stepdefinitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ContactStepsDef {

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

        Driver.get().get(ConfigurationReader.get("url"));

        String username = null;
        String password = null;

        if (userType.equals("driver")) {

            username = ConfigurationReader.get("driver_username");
            password = ConfigurationReader.get("driver_password");
        } else if (userType.equals("sales manager")) {
            username = ConfigurationReader.get("salesmanager_username");
            password = ConfigurationReader.get("salesmanager_password");

        } else if (userType.equals("store manager")) {

            username = ConfigurationReader.get("storemanager_username");
            password = ConfigurationReader.get("storemanager_password");

        }
        new LoginPage().login(username, password);

    }

    @Then("the user should see following options")
    public void the_user_should_see_following_options(List<String> menuOptions) {

        BrowserUtils.waitFor(3);


        List<String> actualOptions = BrowserUtils.getElementsText(new DashboardPage().menuOptions);

        Assert.assertEquals(actualOptions, menuOptions);

    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String, String> UserInfo) {


        System.out.println(UserInfo);

        System.out.println("Bir sey yazdir");

        new LoginPage().login(UserInfo.get("username"), UserInfo.get("password"));

        String actualname = new DashboardPage().getUserName();
        String expectedName = UserInfo.get("firstname") + " " + UserInfo.get("lastname");

        Assert.assertEquals(actualname, expectedName);

    }
}
