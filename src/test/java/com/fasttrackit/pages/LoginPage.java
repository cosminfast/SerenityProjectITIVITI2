package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends BasePage {

    @FindBy(id = "email")
    private WebElementFacade loginField;

    @FindBy(id = "pass")
    private WebElementFacade passwordField;

    @FindBy(id = "send2")
    private WebElementFacade loginButton;


    public void setLoginField(String email){
        typeInto(loginField,email);
    }

    public void setPasswordField(String pass){
        typeInto(passwordField,pass);
    }

    public void clickLoginButton(){
        clickOn(loginButton);
    }
}
