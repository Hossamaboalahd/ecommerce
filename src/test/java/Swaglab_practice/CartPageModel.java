package Swaglab_practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPageModel
{

    static By continueshopping=By.name("continue-shopping");
    static By checkout=By.name("checkout");
    static By firstname=By.name("firstName");
    static By lastname=By.name("lastName");
    static By postalcode=By.name("postalCode");
    static By contiue=By.id("continue");
    static By finish=By.id("finish");
    static By cancel=By.id("cancel");


    public static WebElement ContinueShopping(WebDriver driver)
    {
        WebElement ContinueShopping=driver.findElement(continueshopping);
        return ContinueShopping;
    }
    public static WebElement CacelCheckout(WebDriver driver)
    {
        WebElement Cancel=driver.findElement(cancel);
        return Cancel;
    }

    public static WebElement Checkout(WebDriver driver)
    {
        WebElement Checkout=driver.findElement(checkout);
        return Checkout;
    }
    public static WebElement FirstName(WebDriver driver)
    {
        WebElement FirstName=driver.findElement(firstname);
        return FirstName;
    }
    public static WebElement LastName(WebDriver driver)
    {
        WebElement LastName=driver.findElement(lastname);
        return LastName;
    }
    public static WebElement PostalCode(WebDriver driver)
    {
        WebElement PostalCode=driver.findElement(postalcode);
        return PostalCode;
    }
    public static WebElement Continue(WebDriver driver)
    {
        WebElement Continue=driver.findElement(contiue);
        return Continue;
    }
    public static WebElement Finish(WebDriver driver)
    {
        WebElement Finish=driver.findElement(finish);
        return Finish;
    }

}
