package testCases;
import env.base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import utilities.ElementActions;

public class HomePageTest extends base{
    @Test(description = "Check the Home URL")
    public void tc001()
    {
        String expectedURL = "https://automationexercise.com/";
        String actualURL = HomePage.getCurrentURL();
        Assert.assertEquals(actualURL, expectedURL);
    }
    @Test(description = "Check Logo Visibility")
    public void tc002()
    {
        Assert.assertTrue(HomePage.checkLogoVisibility());
    }
    @Test(description = "Home is Selected or Not")
    public void tc003()
    {
        System.out.println(HomePage.homeItemSelectedOrNot());
        String expectedColor = "rgb(255, 165, 0)";
        String actualColor = HomePage.homeItemSelectedOrNot();
        Assert.assertEquals(actualColor, expectedColor);
    }
    @Test(description = "Check Slider Text")
    public void tc004()
    {
        String[] actualText = new String[3];
        String expectedText = "Full-Fledged practice website for Automation Engineers";
        System.out.println(HomePage.checkSlider1Text());
        actualText[0] = HomePage.checkSlider1Text();
        HomePage.clickOnSlider2Button();
        actualText[1] = HomePage.checkSlider2Text();
        System.out.println(HomePage.checkSlider2Text());
        HomePage.clickOnSlider3Button();
        actualText[2] = HomePage.checkSlider3Text();
        System.out.println(HomePage.checkSlider3Text());
        for(int i = 0; i<3; i++)
        {
            Assert.assertEquals(actualText[i], expectedText);
        }
    }
}
