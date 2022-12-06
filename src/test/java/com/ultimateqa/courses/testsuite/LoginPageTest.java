package com.ultimateqa.courses.testsuite;
// **** Created By Harshit Patel ****

import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        loginPage.clickOnSigninLink();
        String expectedMessage = "Welcome Back!";
        Assert.assertEquals(loginPage.verifyWelcomeBackTextMessage(), expectedMessage, "User Not Logged In");
    }

    @Test
    public void verifyTheErrorMessage() {
        loginPage.clickOnSigninLink();
        loginPage.enterInvalidUserName("Test123545@Gmail.com");
        loginPage.enterInvalidPassword("Test123254");
        loginPage.clickOnSigninButton();
        String expectedMessage = "Invalid email or password.";
        Assert.assertEquals(loginPage.verifyInvalidCredentialMessage(), expectedMessage, "User Logged In");
    }

}
