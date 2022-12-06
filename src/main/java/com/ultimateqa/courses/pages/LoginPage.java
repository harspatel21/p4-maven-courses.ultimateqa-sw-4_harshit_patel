package com.ultimateqa.courses.pages;
// **** Created By Harshit Patel ****


import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By signinLink = By.xpath("//a[@href='/users/sign_in']");
    By verifyWelcomeBackText = By.xpath("//h2[@class='page__heading']");

    By userNameField = By.id("user[email]");
    By userPasswordField = By.id("user[password]");
    By signinButton = By.xpath("//button[@type='submit']");
    By InvalidCredentialMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");


    public void clickOnSigninLink() {
        clickOnElement(signinLink);
    }

    public void clickOnSigninButton() {
        clickOnElement(signinButton);
    }

    public String verifyWelcomeBackTextMessage() {
        return getTextFromElement(verifyWelcomeBackText);
    }

    public void enterInvalidUserName(String userName) {
        sendTextToElement(userNameField, userName);
    }

    public void enterInvalidPassword(String password) {
        sendTextToElement(userPasswordField, password);
    }

    public String verifyInvalidCredentialMessage() {
        return getTextFromElement(InvalidCredentialMessage);
    }
}
