package com.fasttrackit.features;

import com.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginWithValidCredentials(){
        loginSteps.navigateToLoginPage();
        loginSteps.enterUserEmail(Constants.USER_EMAIL);
        loginSteps.enterUserPassword(Constants.USER_PASS);
        loginSteps.clickLoginButton();
//        loginSteps.verifyUserIsLoggedIn(Constants.USER_NAME);
        loginSteps.verifyUserIsLoggedIn("test");
    }

}
