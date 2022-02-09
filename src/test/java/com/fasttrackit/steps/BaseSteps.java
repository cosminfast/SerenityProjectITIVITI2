package com.fasttrackit.steps;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.LoginPage;
import com.fasttrackit.pages.MyAccountPage;
import com.fasttrackit.pages.SearchResultsPage;
import net.thucydides.core.steps.ScenarioSteps;

public class BaseSteps extends ScenarioSteps {
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected MyAccountPage myAccountPage;
    protected SearchResultsPage searchResultsPage;

}
