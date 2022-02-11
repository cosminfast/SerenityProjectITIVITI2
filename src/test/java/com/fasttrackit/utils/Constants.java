package com.fasttrackit.utils;

public class Constants {

    public static final String USER_EMAIL = "cosmin@fasttrackit.org";
    public static final String USER_PASS = "123456";
    public static final String USER_NAME = "Cosmin Fast";
//    public static final String BASE_URL = "http://testfasttrackit.info/selenium-test/";
    public static final String BASE_URL = PropertyFileReader.getEnvConstantsItem("BASE_URL");






//    ------------ Running tests from CMD -------------
//    mvn test - runs all test methods, depends on maven configurations
//    mvn clean test - same as above, removes target folder first
//    mvn clean test -Denv=qa - runs tests on QA env
//    mvn clean test -Dtest=AllCartTestsSuite - runs specific suite
//    mvn serenity:aggregate - generates serenity reports






}
