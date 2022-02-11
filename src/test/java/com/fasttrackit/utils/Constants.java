package com.fasttrackit.utils;

public class Constants {

    public static final String USER_EMAIL = "cosmin@fasttrackit.org";
    public static final String USER_PASS = "123456";
    public static final String USER_NAME = "Cosmin Fast";
//    public static final String BASE_URL = "http://testfasttrackit.info/selenium-test/";
    public static final String BASE_URL = PropertyFileReader.getEnvConstantsItem("BASE_URL");

}
