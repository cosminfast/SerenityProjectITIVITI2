package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.Set;

public class ComparePage extends BasePage{


    @FindBy(css = "button[title='Close Window']")
    private WebElementFacade closeWindowButton;


    public void clickCloseWindowButton(){
        clickOn(closeWindowButton);
    }

}
