package com.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/data.csv")
public class SearchTest extends BaseTest{

    private String keyword,product;


    @Test
    public void searchForProduct(){
        searchSteps.enterSearchKeyword(keyword);
        searchSteps.clickOnSearchIcon();
        searchSteps.verifyProductIsInSearchResults(product);
    }
}
