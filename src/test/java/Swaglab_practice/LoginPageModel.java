package Swaglab_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageModel
{
    //Declare
  //  static String url="https://www.saucedemo.com/";
    static   By usernametext = By.id("user-name");
    static By passwordtext =By.name("password");
    static By loginbutton =By.cssSelector("input[data-test='login-button']");
    static By errormsg=By.cssSelector("h3[data-test='error']");
    public void Scroll(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(0,250)");
    }
//    public  static  WebElement WebsiteUrl(WebDriver driver)
//    {
//      WebElement  WebsiteUrl=driver.get("https://www.saucedemo.com/");
//        return WebsiteUrl;
//    }
    public static WebElement UserName(WebDriver driver)
    {
        WebElement UserName= driver.findElement(usernametext);
        return UserName;

    }
    public static WebElement PassWord(WebDriver driver)
    {
        WebElement PassWord= driver.findElement(passwordtext);
        return PassWord;

    }
    public static WebElement LoginButton(WebDriver driver)
    {
        WebElement LoginButton= driver.findElement(loginbutton);
        return LoginButton;

    }


}
