package com.cellulant.pages;

import com.cellulant.utilities.BrowserUtil;
import com.cellulant.utilities.ConfigReader;
import com.cellulant.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddCustomer {

    @FindBy(xpath = "//button[@ng-click=\"manager()\"]")
    public WebElement loginButton;
    @FindBy(xpath = "//button[@ng-click=\"addCust()\"]")
    public WebElement addCustomerButton;
    @FindBy(xpath = "//input[@ng-model=\"fName\"]")
    public WebElement firstName;
    @FindBy(xpath = "//input[@ng-model=\"lName\"]")
    public WebElement lastName;
    @FindBy(xpath = "//input[@ng-model=\"postCd\"]")
    public WebElement postCode;
    @FindBy(xpath = "//button[.=\"Add Customer\"]")
    public WebElement addCustomer;





    public AddCustomer() {PageFactory.initElements(Driver.getDriver(),this);}

    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }

    public void bankManagerLogin(){
        loginButton.click();
    }

    public void newCustomer(){
        addCustomerButton.click();
    }

    public void addNewCustomer(String firstname, String lastname, String post){
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        postCode.sendKeys(post);

        addCustomer.click();

        Alert alert = Driver.getDriver().switchTo().alert();

        assertTrue(alert.getText().startsWith("Customer"));

        BrowserUtil.waitFor(1);

        alert.accept();


    }


}
