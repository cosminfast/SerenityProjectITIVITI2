package com.fasttrackit.features;

import org.junit.Test;

public class CompareTest extends BaseTest{

    @Test
    public void compareProductsTest(){
        String productName1 = "SILVER DESERT NECKLACE";
        String productName2 = "A TALE OF TWO CITIES";

        searchSteps.executeSearchByProductName(productName1);
        compareSteps.addProductToCompare(productName1);
        searchSteps.executeSearchByProductName(productName2);
        compareSteps.addProductToCompare(productName2);
        compareSteps.clickOnCompare();
        compareSteps.closeCompareWindow();
        compareSteps.removeAllCompareProducts();

    }
}
