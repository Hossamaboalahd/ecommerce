package Krafts_automation_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Krafts_View_Model
{

    static By usernamelogin =By.name("username");
    static By passwordlogin =By.name("password");
    static By login =By.xpath("//span[text()=\"تسجيل الدخول\"]");


    static By kraftburger =By.xpath("//img[@alt=\"كرافت\"]");
    static By mute_button;
    static By upper_button;
    static By lower_button;
    static By likes_button;
    static By react1_button;
    static By react2_button;
    static By react3_button;
    static By react4_button;
    static By comments_button;
    static By textfeild_button;
    static By addcomment_button;
    static By author_button;
    static By contribute_button;
    static public WebElement UsernameLogin(WebDriver driver)
    {
        WebElement UsernameLogin= driver.findElement(usernamelogin);
        return UsernameLogin;
    }
    static public WebElement PasswordLogin(WebDriver driver)
    {
        WebElement PasswordLogin= driver.findElement(passwordlogin);
        return PasswordLogin;
    }
    static public WebElement Login_Button(WebDriver driver)
    {
        WebElement Login_Button= driver.findElement(login);
        return Login_Button;
    }

    static public WebElement KraftBurger(WebDriver driver)
    {
        WebElement KraftBurger= driver.findElement(kraftburger);
        return KraftBurger;
    }



    public static void  Smallscrolldown(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(0,700)");

    }
    public static void  Smallscrollup(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(700,0)");

    }


}
