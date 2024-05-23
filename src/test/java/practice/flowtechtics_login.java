package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;
public class flowtechtics_login {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
        //failed
        driver.get("https://erp.flowtechtics.com/");
        driver.manage().window().maximize();

        WebElement finduser=  driver.findElement(By.id("username"));
        WebElement findpass =driver.findElement(By.id("password"));
         finduser.sendKeys("test@mail.com");
        findpass.sendKeys("123456789");
        driver.findElement(By.cssSelector("button[type=button]")).click();
        //driver.findElement(By.className("MuiTypography-root MuiTypography-caption css-1e7d4e1"));
        //driver.findElement(By.cssSelector("span[class=\"MuiTypography-root MuiTypography-caption css-1e7d4e1\"]")).click();

        // driver.findElement(By.cssSelector("button[type=button]")).click();
        //pass
        //driver.get("https://erp.flowtechtics.com/login");
        //driver.manage().window().maximize();
        finduser.clear();
        finduser.sendKeys("test@mail.com");
        findpass.clear();
        findpass.sendKeys("123456789");
      //  driver.findElement(By.className("MuiTypography-root MuiTypography-caption css-1e7d4e1"));
       // driver.findElement(By.cssSelector("span[class=\"MuiTypography-root MuiTypography-caption css-1e7d4e1\"]")).click();
        driver.findElement(By.cssSelector("button[type=button]")).click();
        //driver.quit();
    }


}
