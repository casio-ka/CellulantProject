package com.cellulant.pages;

import com.cellulant.utilities.ConfigReader;
import com.cellulant.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/div[2]/button" )
    public WebElement loginButton;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[1]/button[1]")
    public WebElement addCustomerButton;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")
    public WebElement firstName;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")
    public WebElement lastName;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")
    public WebElement postCode;
    @FindBy(xpath = "/html/body/div/div/div[2]/div/div[2]/div/div/form/button")
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
    }





}
