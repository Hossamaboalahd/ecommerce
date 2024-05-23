package Swaglab_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPageModel
{
    static By search= By.className("MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeLarge css-j46id3");


    public static WebElement Search(WebDriver driver)
    {
        WebElement Hamburger= driver.findElement(search);
        return Hamburger;
    }
}
