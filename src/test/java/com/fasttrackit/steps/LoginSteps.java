package com.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {


    @Step
    public void clickMyAccount(){
        homePage.clickMyAccountLink();
    }

    @Step
    public void clickLogin(){
        homePage.clickLoginLink();
    }

    @Step
    public void navigateToLoginPage(){
        clickMyAccount();
        clickLogin();
    }

    @Step
    public void enterUserEmail(String email){
        loginPage.setLoginField(email);
    }

    @Step
    public void enterUserPassword(String pass){
        loginPage.setPasswordField(pass);
    }

    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyUserIsLoggedIn(String userName){
        Assert.assertEquals(myAccountPage.getExpectedLoginMessage(userName),
                myAccountPage.getWelcomeText());

    }

    @Step
    public void doLogin(String email, String password){
        navigateToLoginPage();
        enterUserEmail(email);
        enterUserPassword(password);
        clickLoginButton();
    }
}
