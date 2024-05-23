package nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeNopObjectModel
{
    static By currency= By.id("customerCurrency");
    static By eurooption=By.xpath("//option[text()='Euro']");
    static By search =By.id("small-searchterms");
    static By searchbtn=By.cssSelector("button[type='submit']");
    static By digitalcategory=By.cssSelector("a[title='Show products in category Digital downloads']");
    static By Category=By.cssSelector("div[class='category-item']");



   static public WebElement Currency(WebDriver driver)
    {
        WebElement Currency= driver.findElement(currency);
        return Currency;
    }
    static public WebElement DigitalCategory(WebDriver driver)
    {
        WebElement DigitalCategory= driver.findElement(digitalcategory);
        return DigitalCategory;
    }
    static public WebElement Category(WebDriver driver)
    {
        WebElement Ctegory= driver.findElement(Category);
        return Ctegory;
    }
    static public WebElement Euro(WebDriver driver)
    {
        WebElement Euro= driver.findElement(eurooption);
        return Euro;
    }
    public static void  scrolldown(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(0,1300)");

    }
    public static void  Smallscrolldown(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(0,700)");

    }
    public static WebElement Search(WebDriver driver)
    {
        WebElement Search = driver.findElement(search);
        return Search;
    }
    public static WebElement SearchButton(WebDriver driver)
    {
        WebElement Search = driver.findElement(searchbtn);
        return Search;
    }

}
