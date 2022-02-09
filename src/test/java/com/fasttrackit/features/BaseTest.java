package com.fasttrackit.features;

import com.fasttrackit.steps.CartSteps;
import com.fasttrackit.steps.LoginSteps;
import com.fasttrackit.steps.SearchSteps;
import com.fasttrackit.utils.Constants;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected SearchSteps searchSteps;
    @Steps
    protected CartSteps cartSteps;


    @Before
    public void init() {
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }
}
