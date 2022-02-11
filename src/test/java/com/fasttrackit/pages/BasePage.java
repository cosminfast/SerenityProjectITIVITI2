package com.fasttrackit.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class BasePage extends PageObject {
    private static String currentWindow;

    public void scrollToPageTop() {
        ((JavascriptExecutor)getDriver()).executeScript("window.scrollTo(document.body.scrollHeight, 0)");
    }

    public void scrollToPageBottom() {
        ((JavascriptExecutor)getDriver()).executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView();", element);
    }


    public void switchToNewWindow(){
        currentWindow = getDriver().getWindowHandle();
        Set<String> allHandles = getDriver().getWindowHandles();
        for (String handle : allHandles){
            if (!handle.contentEquals(currentWindow)){
                getDriver().switchTo().window(handle);
                break;
            }
        }
    }

    public void switchToMainWindow(){
        getDriver().switchTo().window(currentWindow);
    }

}
