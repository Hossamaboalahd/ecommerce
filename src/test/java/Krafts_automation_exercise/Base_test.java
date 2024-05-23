package Krafts_automation_exercise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Base_test
{
    WebDriver driver;
    @BeforeSuite
    public void DeclareDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver();
    }
    @BeforeClass
    public void Website()
    {
        driver.get("https://www.krafttopia.work/auth/sign-in");
        Krafts_View_Model.UsernameLogin(driver).sendKeys("flowtest902@gmail.com");
        Krafts_View_Model.PasswordLogin(driver).sendKeys("test123456");
        Krafts_View_Model.Login_Button(driver).click();




    }
    @AfterMethod
    public void Home() throws InterruptedException {
        Thread.sleep(1000);
       // driver.get("https://www.krafttopia.work/auth/sign-in");

    }
    @AfterClass
    public void Close() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
}
