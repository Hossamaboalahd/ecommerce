package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class flowtechtics_superuser_login_pageobjectmodel
{

    public static WebElement element=null;

   protected  WebDriver superuser_home;
     flowtechtics_superuser_login_pageobjectmodel(WebDriver driver)
     {
        superuser_home=driver;
     }
    public static void  scrolldown(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(0,250)");
        //return scroll;
    }
    public static WebElement find_username(WebDriver driver)
    {
        element =  driver.findElement(By.id("username"));
       return element;
    }
    public static WebElement find_password(WebDriver driver)
    {
        element=driver.findElement(By.id("password"));
       return element;

    }
    public static WebElement find_loginbutton(WebDriver driver)
    {
        element=driver.findElement(By.cssSelector("button[type=submit]"));
        return element;
    }


}
