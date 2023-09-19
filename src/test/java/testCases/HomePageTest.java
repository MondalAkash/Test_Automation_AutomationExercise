package testCases;
import env.base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.Cartpage;
import pageObjects.CreateAccountPage;
import pageObjects.HomePage;
import utilities.ElementActions;

public class HomePageTest extends base{
    @Test(priority = 1, description = "Check the Home page")
    public void verifyHome()
    {
        String expectedURL = "https://automationexercise.com/";
        String actualURL = HomePage.getCurrentURL();
        Assert.assertEquals(actualURL, expectedURL);
        Assert.assertTrue(HomePage.checkLogoVisibility());
        //System.out.println(HomePage.homeItemSelectedOrNot());
        String expectedColor = "rgb(255, 165, 0)";
        String actualColor = HomePage.homeItemSelectedOrNot();
        Assert.assertEquals(actualColor, expectedColor);
        String[] actualText = new String[3];
        String expectedText = "Full-Fledged practice website for Automation Engineers";
        //System.out.println(HomePage.checkSlider1Text());
        actualText[0] = HomePage.checkSlider1Text();
        HomePage.clickOnSlider2Button();
        actualText[1] = HomePage.checkSlider2Text();
        //System.out.println(HomePage.checkSlider2Text());
        HomePage.clickOnSlider3Button();
        actualText[2] = HomePage.checkSlider3Text();
        //System.out.println(HomePage.checkSlider3Text());
        for(int i = 0; i<3; i++)
        {
            Assert.assertEquals(actualText[i], expectedText);
        }
        //HomePage.clickOnViewProductButton();
        HomePage.clickOnAddToCartButton();
        HomePage.clickOnContinueShoppingButton();
        HomePage.clickOnCartButton();
    }
    @Test(priority = 2,description = "Verify the cartPage")
    public void verifyCart() throws InterruptedException {
        Thread.sleep(3000);
        String expectedColor = "rgb(255, 165, 0)";
        String actualColor = Cartpage.checkCartSelectedOrNot();
        Assert.assertEquals(actualColor, expectedColor);
        Cartpage.clickOnProceedToCheckOutButton();
        Cartpage.clickOnRegisterLoginButton();
        Cartpage.enterName("Test");
        Cartpage.enterEmail(ElementActions.generateEmailDynamically());
        Cartpage.clickOnSignUpButton();
        CreateAccountPage.clickOnGender();
        CreateAccountPage.enterPassword("123456");
        CreateAccountPage.selectDate("12");
        CreateAccountPage.selectMonth("January");
        CreateAccountPage.selectYear("1990");
        CreateAccountPage.enterFirstName("Test");
        CreateAccountPage.enterLastName("Test");
        CreateAccountPage.enterCompanyName("Test");
        CreateAccountPage.enterAddress("Test");
        CreateAccountPage.enterCountry("United States");
        CreateAccountPage.enterState("New York");
        CreateAccountPage.enterCity("New York");
        CreateAccountPage.enterZipCode("12345");
        CreateAccountPage.enterMobileNumber("01777777777");
        CreateAccountPage.clickOnCreateAccountButton();
        String expectedText1 = "Congratulations! Your new account has been successfully created!";
        String actualText1 = CreateAccountPage.checkSuccessMessage();
        Assert.assertEquals(actualText1, expectedText1);
    }



}
