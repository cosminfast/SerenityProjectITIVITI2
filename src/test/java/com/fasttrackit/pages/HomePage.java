package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.time.Duration;

public class HomePage extends BasePage {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade myAccountLink;

    @FindBy(css = "[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy(css = ".search-button")
    private WebElementFacade searchButton;

    public void clickMyAccountLink() {
        clickOn(myAccountLink);
    }

    public void clickLoginLink() {
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(loginLink);
        clickOn(loginLink);
    }

    public void waitForElementCcc(){
        float timeout = 0;
        do {
            try {
                getDriver().findElement(By.cssSelector("")).isDisplayed();
            }catch (Exception e){
                timeout+=0.3;
                waitABit(300);
            }
        }while (timeout <= 5000);
    }


    public void setSearchField(String value){
        typeInto(searchField, value);
    }

    public void clickSearchButton(){
        clickOn(searchButton);
    }
}
