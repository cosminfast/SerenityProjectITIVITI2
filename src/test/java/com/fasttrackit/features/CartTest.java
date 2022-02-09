package com.fasttrackit.features;

import org.junit.Test;

public class CartTest extends BaseTest{


    @Test
    public void addToCart(){
        String productName = "SILVER DESERT NECKLACE";
        searchSteps.executeSearchByProductName(productName);
        cartSteps.addProductToCart(productName);
    }
}
