package com.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps{


    @Step
    public void addProductToCart(String productName){
//        searchResultsPage.addProductToCart(productName);
        Assert.assertTrue("Product " + productName + " not found!",
                searchResultsPage.addProductToCart(productName));
    }
}
