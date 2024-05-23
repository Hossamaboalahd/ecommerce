package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class flowtechtics_superuser_IT_pageobjectmodel
{
    public static WebElement element=null;

    public static void  scrolldown(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(0,250)");
        //return scroll;
    }
    public static WebElement humburger(WebDriver driver)
    {
        WebElement humburger= driver.findElement(By.cssSelector("button[type='button']"));
        return humburger;

    }
    public static WebElement IT_button(WebDriver driver)
    {
        WebElement IT_button=driver.findElement(By.xpath("//li/a[@href='/it']"));
        return IT_button;
    }
    public static WebElement filter_textbox(WebDriver driver)
    {
        WebElement filter_textbox = driver.findElement(By.id("headlessui-listbox-button-:r0:"));
        return filter_textbox;

    }
    public static WebElement inactive_filter_option(WebDriver driver)
    {
        WebElement inactive_filter_option= driver.findElement(By.id("headlessui-listbox-option-:r4:"));
        return inactive_filter_option;
    }
    public static WebElement filter_button(WebDriver driver)
    {
        WebElement filter_button= driver.findElement(By.xpath("//*[text()='Filter']"));
        return filter_button;
    }
    public static WebElement active_filter_option(WebDriver driver)
    {
        WebElement active_filter_option=driver.findElement(By.xpath("//*[@id=\"headlessui-listbox-option-:r3:\"]"));
        return active_filter_option;
    }
    public static WebElement search_textbox(WebDriver driver)
    {
        WebElement search_textbox= driver.findElement(By.id("search"));
        return search_textbox;
    }
    public static WebElement Add_network_button(WebDriver driver)
    {
        WebElement Add_network_button= driver.findElement(By.xpath("//*[text()=\"add \"]"));
        return Add_network_button;
    }
    public static WebElement network_name_textbox(WebDriver driver)
    {
        WebElement network_name_textbox = driver.findElement(By.cssSelector("input[placeholder=\"Write Network name here ..\"]"));
        return network_name_textbox;
    }

}
