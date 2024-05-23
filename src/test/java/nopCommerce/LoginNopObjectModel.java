package nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginNopObjectModel
{
    static By loginpage= By.className("ico-login");
    static By email=By.className("email");
    static By pass=By.name("Password");
    static By login=By.xpath("//button[text()=\"Log in\"]");
    static By myaccount =By.xpath("//a[text()='My account']");

    public static void  scrolldown(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(0,200)");

    }
    public static WebElement Email(WebDriver driver)
    {
      WebElement Email=driver.findElement(email);
      return Email;

    }
    public static WebElement MyAccount(WebDriver driver)
    {
        WebElement MyAccount=driver.findElement(myaccount);
        return MyAccount;

    }
    public static WebElement Pass(WebDriver driver)
    {
        WebElement Pass=driver.findElement(pass);
        return Pass;

    }
    public static WebElement LoginPage(WebDriver driver)
    {
        WebElement Login=driver.findElement(loginpage);
        return Login;

    }
    public static WebElement LoginButton(WebDriver driver)
    {
        WebElement LoginButton=driver.findElement(login);
        return LoginButton;

    }

}
