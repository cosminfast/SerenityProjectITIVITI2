package com.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchSteps extends BaseSteps{

    @Step
    public void enterSearchKeyword(String value){
        homePage.setSearchField(value);
    }

    @Step
    public void clickOnSearchIcon(){
        homePage.clickSearchButton();
    }

    @Step
    public void verifyProductIsInSearchResults(String productName){
        Assert.assertTrue(searchResultsPage.isProductInList(productName));
    }

    @Step
    public void executeSearchByProductName(String productName){
        enterSearchKeyword(productName);
        clickOnSearchIcon();
        verifyProductIsInSearchResults(productName);
    }

}
