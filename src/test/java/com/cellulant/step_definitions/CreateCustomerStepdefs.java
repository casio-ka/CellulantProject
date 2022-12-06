package com.cellulant.step_definitions;

import com.cellulant.pages.AddCustomer;
import com.cellulant.utilities.BrowserUtil;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateCustomerStepdefs {

    AddCustomer addCustomer;

    @Given("user is on the login page")
    public void theUserIsOnTheLoginPage() {
        addCustomer = new AddCustomer();

        addCustomer.goTo();
        BrowserUtil.waitFor(1);

    }

    @When("user clicks the bank manager login button")
    public void theUserClicksTheBankManagerLogin() {

        addCustomer = new AddCustomer();
        addCustomer.bankManagerLogin();
        BrowserUtil.waitFor(1);
    }

    @And("user clicks add customer button")
    public void theUserClicksAddCustomerButton() {

        addCustomer = new AddCustomer();
        addCustomer.newCustomer();
        BrowserUtil.waitFor(1);
        
    }

    @Then("user can add a new customer")
    public void theUserCanAddANewCustomer() {
        addCustomer = new AddCustomer();

        Faker faker = new Faker();

        addCustomer.addNewCustomer(faker.name().firstName(),faker.name().lastName(),faker.address().zipCode());
        BrowserUtil.waitFor(2);



    }
}
