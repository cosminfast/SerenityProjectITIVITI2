package com.fasttrackit.features;

import com.fasttrackit.models.api.CreateUser;
import com.fasttrackit.models.api.ErrorResponse;
import com.fasttrackit.models.api.createdUser.CreatedUser;
import io.restassured.RestAssured;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class TestRest {


    @Test
    public void testCreateUser() {
        CreateUser cu = new CreateUser();
        cu.setUserName("cosmin"+ RandomStringUtils.randomAlphanumeric(10));
        cu.setPassword("Passw0rd.123!");

        RestAssured.baseURI = "https://demoqa.com/Account/v1/User";
        CreatedUser created = RestAssured.given()
                .contentType("application/json")
                .body(cu)
                .then()
                .statusCode(201)
                .when()
                .post().as(CreatedUser.class);

//        System.out.println(created.getUserID());
//        System.out.println(created.getUsername());
        Assert.assertEquals(cu.getUserName(), created.getUsername());
    }

    @Test
    public void testCreateUserExisting() {
        CreateUser cu = new CreateUser();
        cu.setUserName("cosmin8");
        cu.setPassword("Passw0rd.123!");

        RestAssured.baseURI = "https://demoqa.com/Account/v1/User";
        ErrorResponse err = RestAssured.given()
                .contentType("application/json")
                .body(cu)
                .then()
                .statusCode(406)
                .when()
                .post().as(ErrorResponse.class);

//        System.out.println(created.getUserID());
//        System.out.println(created.getUsername());
        Assert.assertEquals("User exists!", err.getMessage());
    }

    @Test
    public void testCreateUserNoPassword() {
        CreateUser cu = new CreateUser();
        cu.setUserName("cosmin1118");
        cu.setPassword("");

        RestAssured.baseURI = "https://demoqa.com/Account/v1/User";
        ErrorResponse err = RestAssured.given()
                .contentType("application/json")
                .body(cu)
                .then()
                .statusCode(400)
                .when()
                .post().as(ErrorResponse.class);

//        System.out.println(created.getUserID());
//        System.out.println(created.getUsername());
        Assert.assertEquals("UserName and Password required.",err.getMessage());
    }

    @Test
    public void testCreateUserNoPasswordAndNoUser() {
        CreateUser cu = new CreateUser();
        cu.setUserName("");
        cu.setPassword("");

        RestAssured.baseURI = "https://demoqa.com/Account/v1/User";
        ErrorResponse err = RestAssured.given()
                .contentType("application/json")
                .body(cu)
                .then()
                .statusCode(400)
                .when()
                .post().as(ErrorResponse.class);

//        System.out.println(created.getUserID());
//        System.out.println(created.getUsername());
        Assert.assertEquals("UserName and Password required.",err.getMessage());
    }

    @Test
    public void testCreateUserWeakPassword() {
        CreateUser cu = new CreateUser();
        cu.setUserName("cosmin123123");
        cu.setPassword("1");

        RestAssured.baseURI = "https://demoqa.com/Account/v1/User";
        ErrorResponse err = RestAssured.given()
                .contentType("application/json")
                .body(cu)
                .then()
                .statusCode(400)
                .when()
                .post().as(ErrorResponse.class);

//        System.out.println(created.getUserID());
//        System.out.println(created.getUsername());
        Assert.assertEquals("Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special character and Password must be eight characters or longer."
                ,err.getMessage());
    }
}
