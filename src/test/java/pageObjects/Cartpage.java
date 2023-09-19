package pageObjects;

import org.openqa.selenium.By;
import utilities.ElementActions;

public class Cartpage {
    public static By cartLink = By.xpath("//a[normalize-space()='Cart']");
    public static String checkCartSelectedOrNot()
    {
        return ElementActions.itemSelectedOrNot(cartLink);
    }

    public static By proceedToCheckOutButton = By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a");
    public static void clickOnProceedToCheckOutButton()
    {
        ElementActions.clickOnItem(proceedToCheckOutButton);
    }
    public static By registerLoginButton = By.xpath("//a[normalize-space()='Register / Login']");
    public static void clickOnRegisterLoginButton()
    {
        ElementActions.clickOnItem(registerLoginButton);
    }
    public static By nameField = By.xpath("//input[@placeholder='Name']");
    public static void enterName(String name)
    {
        ElementActions.sendText(nameField, name);
    }
    public static By emailField = By.xpath("//input[@data-qa='signup-email']");
    public static void enterEmail(String email)
    {
        ElementActions.sendText(emailField, email);
    }
    public static By signUpButton = By.xpath("//button[normalize-space()='Signup']");
    public static void clickOnSignUpButton()
    {
        ElementActions.clickOnItem(signUpButton);
    }



}
