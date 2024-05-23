package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class firsttask {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver =new FirefoxDriver();




       // driver.get("https://demo.automationtesting.in/Register.html");
       // driver.findElement(By.id("APjFqb")).sendKeys("ISTQB");
       // driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();

       // String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
       // Actions act = new Actions(driver);
      //  WebElement xx= driver.findElement(By.cssSelector(".eKjLze > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > a:nth-child(1) > h3:nth-child(2) > span:nth-child(1)"));
       // act.contextClick(xx).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ENTER).build().perform();
      //  driver.close();
      //  driver.quit();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
       // driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched")).sendKeys("hossam");
       // driver.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required")).sendKeys("aboalahd");
       driver.findElement(By.id("password")).sendKeys("secret_sauce");
       driver.findElement(By.id("login-button")).click();
       driver.findElement(By.className("bm-burger-button")).click();
       driver.findElement(By.id("inventory_sidebar_link")).click();
       driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/button")).click();
        String element = driver.findElement(By.cssSelector("[class=\"btn_primary btn_inventory\"]")).getText();
        System.out.println(element);
       // driver.findElement(By.)
        // By.cssSelector( " tagname[   attribute=value    ] " );
        // By.xpath( " //tagname[ @  attribute="value"   ] " )  ;   tagname <a
        driver.close();










    }
}
