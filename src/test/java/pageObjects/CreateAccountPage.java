package pageObjects;

import org.openqa.selenium.By;
import utilities.ElementActions;

public class CreateAccountPage {
    public static By selectGender = By.xpath("//input[@id='id_gender1']");
    public static void clickOnGender()
    {
        ElementActions.clickOnItem(selectGender);
    }
    public static By passwordField = By.xpath("//input[@id='password']");
    public static void enterPassword(String password)
    {
        ElementActions.sendText(passwordField, password);
    }
    public static By dateField = By.xpath("//select[@id='days']");
    public static void selectDate(String date)
    {
        ElementActions.selectFromDropDown(dateField, date);
    }
    public static By monthField = By.xpath("//select[@id='months']");
    public static void selectMonth(String month)
    {
        ElementActions.selectFromDropDown(monthField, month);
    }
    public static By yearField = By.xpath("//select[@id='years']");
    public static void selectYear(String year)
    {
        ElementActions.selectFromDropDown(yearField, year);
    }
    public static By firstNameField = By.xpath("//input[@id='first_name']");
    public static void enterFirstName(String firstName)
    {
        ElementActions.sendText(firstNameField, firstName);
    }
    public static By lastNameField = By.xpath("//input[@id='last_name']");
    public static void enterLastName(String lastName)
    {
        ElementActions.sendText(lastNameField, lastName);
    }
    public static By companyNameField = By.xpath("//input[@id='company']");
    public static void enterCompanyName(String companyName)
    {
        ElementActions.sendText(companyNameField, companyName);
    }
    public static By addressField = By.xpath("//input[@id='address1']");
    public static void enterAddress(String address)
    {
        ElementActions.sendText(addressField, address);
    }
    public static By countryField = By.xpath("//select[@id='country']");
    public static void enterCountry(String country)
    {
        ElementActions.selectFromDropDown(countryField, country);
    }
    public static By stateField = By.xpath("//input[@id='state']");
    public static void enterState(String state)
    {
        ElementActions.sendText(stateField, state);
    }
    public static By cityField = By.xpath("//input[@id='city']");
    public static void enterCity(String city)
    {
        ElementActions.sendText(cityField, city);
    }
    public static By zipField = By.xpath("//input[@id='zipcode']");
    public static void enterZipCode(String zipCode)
    {
        ElementActions.sendText(zipField, zipCode);
    }
    public static By mobileField = By.xpath("//input[@id='mobile_number']");
    public static void enterMobileNumber(String mobileNumber)
    {
        ElementActions.sendText(mobileField, mobileNumber);
    }
    public static By createAccountButton = By.xpath("//button[normalize-space()='Create Account']");
    public static void clickOnCreateAccountButton()
    {
        ElementActions.clickOnItem(createAccountButton);
    }
    public static By successMessage = By.xpath("//p[contains(text(),'Congratulations! Your new account has been success')]");
    public static String checkSuccessMessage()
    {
        return ElementActions.getText(successMessage).toString();
    }

}
