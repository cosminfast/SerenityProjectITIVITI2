package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage extends BasePage {

    @FindBy(css = ".products-grid .item")
    private List<WebElementFacade> listOfProducts;

    @FindBy(css = "button[title='Compare']")
    private WebElementFacade compareButton;

    @FindBy(css = ".btn-remove")
    private WebElementFacade removeButton;

    By productNameElement = By.cssSelector(".product-name a");

    private static WebElement foundElement;
    private static boolean found = false;

    public boolean isProductInList(String productName) {
        for (WebElementFacade elementFacade : listOfProducts) {
            if (elementFacade.findElement(productNameElement).getText().equalsIgnoreCase(productName)) {
                foundElement = elementFacade;
                found = true;
            }
        }
        return found;
    }

    public boolean addProductToCart(String productName) {
//        if (!found || !foundElement.findElement(productNameElement).getText().equalsIgnoreCase(productName)) {
//            Assert.assertTrue(isProductInList(productName));
//        }
//        foundElement.findElement(By.cssSelector(".btn-cart")).click();

        for (WebElementFacade elementFacade : listOfProducts) {
            if (elementFacade.findElement(productNameElement).getText().equalsIgnoreCase(productName)) {
                elementFacade.findElement(By.cssSelector(".btn-cart")).click();
               return true;
            }
        }
        return false;
    }

    public boolean addProdutToCompare(String productName) {
        for (WebElementFacade elementFacade : listOfProducts) {
            if (elementFacade.findElement(productNameElement).getText().equalsIgnoreCase(productName)) {
                elementFacade.findElement(By.cssSelector(".link-compare")).click();
               return true;
            }
        }
        return false;
    }

    public void clickOnCompareButton(){
        clickOn(compareButton);
    }

    public void removeAllFromCompare(){
        while (removeButton.isPresent()){
            removeButton.click();
            getAlert().accept();
        }
    }


}
