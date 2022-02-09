package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends BasePage {

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeText;


    public void verifyUserIsLoggedIn(String userName){
        welcomeText.shouldContainOnlyText("Hello, " + userName + "!");

    }

    public String getWelcomeText(){
        return welcomeText.getText();
    }

    public boolean isUserLoggedIn(String userName){
        return welcomeText.containsOnlyText("Hello, " + userName + "");
    }

    public String getExpectedLoginMessage(String userName){
        return "Hello, "+ userName + "";
    }

}
