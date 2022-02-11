package com.fasttrackit.features;

import org.junit.Test;

public class SearchTest extends BaseTest{

    @Test
    public void searchForProduct(){
        searchSteps.enterSearchKeyword("Neck");
        searchSteps.clickOnSearchIcon();
        searchSteps.verifyProductIsInSearchResults("SILVER DESERT NECKLACE");
        searchSteps.verifyProductIsInSearchResults("A TALE OF TWO CITIES");
    }
}
