package com.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CompareSteps extends BaseSteps {


    @Step
    public void addProductToCompare(String productName) {
        Assert.assertTrue("The product '" + productName + "' was not found in the list!",
                searchResultsPage.addProdutToCompare(productName));
    }

    @Step
    public void clickOnCompare(){
        searchResultsPage.clickOnCompareButton();
    }

    @Step
    public void closeCompareWindow(){
        comparePage.switchToNewWindow();
        comparePage.clickCloseWindowButton();
        searchResultsPage.switchToMainWindow();
    }

    @Step
    public void removeAllCompareProducts(){
        searchResultsPage.removeAllFromCompare();
    }
}
