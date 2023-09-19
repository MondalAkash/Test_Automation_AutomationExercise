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
    public static By viewProduct = By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]");
    public static By addToCart = By.xpath("/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a");
    public static By continueShoppingButton = By.xpath("//button[normalize-space()='Continue Shopping']");
    public static By cartButton = By.xpath("//a[normalize-space()='Cart']");
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
    public static void clickOnViewProductButton()
    {
        ElementActions.clickOnItem(viewProduct);
    }
    public static void clickOnAddToCartButton()
    {
        ElementActions.clickOnItem(addToCart);
    }
    public static void clickOnContinueShoppingButton()
    {
        ElementActions.clickOnItem(continueShoppingButton);
    }
    public static void clickOnCartButton()
    {
        ElementActions.clickOnItem(cartButton);
    }

}
