package pageObjects;

import org.openqa.selenium.By;
import utilities.ElementActions;

import static utilities.ElementActions.getText;

public class HomePage {
    public static By logo = By.xpath("//img[@alt='Website for automation practice']");
    public static By slider1Text = By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]");
    public static By slider2ChangeButton = By.xpath("//section[@id='slider']//li[2]");
    public static By slider2Text = By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]");
    public static By slider3ChangeButton = By.xpath("//section[@id='slider']//li[3]");
    public static By slider3Text = By.xpath("//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]");
    public static By homeItem = By.xpath("//a[normalize-space()='Home']");
    public static boolean checkLogoVisibility()
    {
        return ElementActions.visibilityCheck(logo);
    }
    public static String getCurrentURL()
    {
        return ElementActions.getURL();
    }
    public static String homeItemSelectedOrNot()
    {
        return ElementActions.itemSelectedOrNot(homeItem);
    }
    public static String checkSlider1Text()
    {
        return ElementActions.getText(slider1Text).toString();
    }
    public static String checkSlider2Text()
    {
        return ElementActions.getText(slider2Text).toString();
    }
    public static String checkSlider3Text()
    {
        return ElementActions.getText(slider3Text).toString();
    }
    public static void clickOnSlider2Button()
    {
        ElementActions.clickOnItem(slider2ChangeButton);
    }
    public static void clickOnSlider3Button()
    {
        ElementActions.clickOnItem(slider3ChangeButton);
    }
}
