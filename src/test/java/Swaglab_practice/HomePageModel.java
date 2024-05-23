package Swaglab_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageModel
{
    //declare
    static By burger=By.id("react-burger-menu-btn");
    static By closeburger=By.id("react-burger-cross-btn");
    static By logout=By.id("logout_sidebar_link");
    static By filterbutton=By.cssSelector("select[data-test='product_sort_container']");
    static By filteroption_az=By.cssSelector("option[value='az']");
    static By filteroption_za=By.cssSelector("option[value='za']");
    static By Filteroption_lohi=By.cssSelector("option[value='lohi']");
    static By Filteroption_hilo=By.cssSelector("option[value='hilo']");
    static By addtocart =By.cssSelector("button[data-test='add-to-cart-sauce-labs-backpack']");
    static By addtocartlastitem =By.cssSelector("button[data-test='add-to-cart-test.allthethings()-t-shirt-(red)']");
    static By removelastitem=By.name("remove-test.allthethings()-t-shirt-(red)");
    static By openlastitem=By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']");
    static By carticon= By.className("shopping_cart_link");
    static By twittericon=By.xpath("//a[text()='Twitter']");
    static By facebook=By.xpath("//a[text()='Facebook']");
    static By likedin=By.xpath("//a[text()='LinkedIn']");
    static By allitemburger=By.xpath("//a[text()='All Items']");
    static By about=By.id("about_sidebar_link");
    static By resetappstate=By.id("reset_sidebar_link");



    public static WebElement LogOut(WebDriver driver)
        {
            WebElement LogOut= driver.findElement(logout);
            return  LogOut;
        }

    public static WebElement Burger(WebDriver driver)
    { WebElement Burger=driver.findElement(burger);
        return Burger;
    }
    public static WebElement ResetAppState(WebDriver driver)
    {
        WebElement ResetAppState= driver.findElement(resetappstate);
        return ResetAppState;
    }
    public static WebElement CloseBurger(WebDriver driver)
    {
        WebElement CloseBurger= driver.findElement(closeburger);
        return CloseBurger;
    }
    public static WebElement AllItemBurger(WebDriver driver)
    {
        WebElement AllItemBurger= driver.findElement(allitemburger);
        return AllItemBurger;
    }
    public static WebElement About(WebDriver driver)
    {
        WebElement About= driver.findElement(about);
        return About;
    }

    public static WebElement AddToCart(WebDriver driver)
    {
        WebElement AddToCart=driver.findElement(addtocart);
        return AddToCart;
    }
    public static WebElement AddToCartLastItem(WebDriver driver)
    {
        WebElement AddToCartLastItem=driver.findElement(addtocartlastitem);
        return AddToCartLastItem;
    }
    public static WebElement OpenLastItem(WebDriver driver)
    {
        WebElement OpenLastItem= driver.findElement(openlastitem);
        return OpenLastItem;
    }
    public static WebElement Removelastitem(WebDriver driver)
    {
        WebElement Removelastitem=driver.findElement(removelastitem);
        return Removelastitem;
    }
    public static void  scrolldown(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(0,250)");
        //return scroll;
    }
    public static void  scrollup(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(250,0)");
        //return scroll;
    }
    public static WebElement CartIcon(WebDriver driver)
    {
        WebElement CartIcon= driver.findElement(carticon);
        return CartIcon;
    }

    public static WebElement FilterButtonGlobal (WebDriver driver)
    {
      WebElement FilterButtonGlobal=driver.findElement(filterbutton);
      return FilterButtonGlobal;
    }
    public static WebElement FilterOptionA_Z (WebDriver driver)
    {
        WebElement FilterOptionA_Z=driver.findElement(filteroption_az);
        return FilterOptionA_Z;
    }
    public static WebElement FilterOptionZ_A (WebDriver driver)
    {
        WebElement FilterOptionZ_A=driver.findElement(filteroption_za);
        return FilterOptionZ_A;
    }
    public static WebElement FilterOptionL_H (WebDriver driver)
    {
        WebElement FilterOptionL_H=driver.findElement(Filteroption_lohi);
        return FilterOptionL_H;
    }
    public static WebElement FilterOptionH_L (WebDriver driver)
    {
        WebElement FilterOptionH_L=driver.findElement(Filteroption_hilo);
        return FilterOptionH_L;
    }
    public static WebElement TwitterIcon(WebDriver driver)
    {
        WebElement TwitterIcon= driver.findElement(twittericon);
        return TwitterIcon;
    }
    public static WebElement FacebookIcon(WebDriver driver)
    {
        WebElement FacebookIcon= driver.findElement(facebook);
        return FacebookIcon;
    }
    public static WebElement LinkedInIcon(WebDriver driver)
    {
        WebElement LinkedInIcon= driver.findElement(likedin);
        return LinkedInIcon;
    }



}
