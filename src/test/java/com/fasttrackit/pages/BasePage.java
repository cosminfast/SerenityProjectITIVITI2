package com.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasePage extends PageObject {

    public void scrollToPageTop() {
        ((JavascriptExecutor)getDriver()).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    public void scrollToPageBottom() {
        ((JavascriptExecutor)getDriver()).executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", element);
    }


}
