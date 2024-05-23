package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class flowtechtics_superuser_IT
{
        WebDriver driver;










    @BeforeSuite
                public void declare()
        {

               WebDriverManager.firefoxdriver().setup();
                driver =new FirefoxDriver();
        }


        @BeforeMethod
        public void openbrowserandlogin()
        {


            //flowtechtics_login login = new flowtechtics_login();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
            driver.get("https://erp.flowtechtics.online/");
            driver.manage().window().maximize();


           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
          /*
            WebElement finduser=  driver.findElement(By.id("username"));
            WebElement findpass =driver.findElement(By.id("password"));
            finduser.sendKeys("ahmad@flowtechtics.com");
            findpass.sendKeys("test123456");
            driver.findElement(By.cssSelector("button[type=submit]")).click();
          */
            flowtechtics_superuser_login_pageobjectmodel.find_username(driver).sendKeys("ahmad@flowtechtics.com");
            flowtechtics_superuser_login_pageobjectmodel.find_password(driver).sendKeys("test123456");
            flowtechtics_superuser_login_pageobjectmodel.find_loginbutton(driver).click();


        }
    @Test(priority=0)
    public void ITfilter_inactive2() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

        wait.until(ExpectedConditions.visibilityOf(flowtechtics_superuser_IT_pageobjectmodel.humburger(driver)));
        flowtechtics_superuser_IT_pageobjectmodel.humburger(driver).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/a[@href='/it']")));
        flowtechtics_superuser_IT_pageobjectmodel.IT_button(driver).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("headlessui-listbox-button-:r0:")));
        flowtechtics_superuser_IT_pageobjectmodel.filter_textbox(driver).click();

        flowtechtics_superuser_IT_pageobjectmodel.inactive_filter_option(driver).click();
        flowtechtics_superuser_IT_pageobjectmodel.filter_button(driver).click();


    }
    @Test(priority=1)
    public void ITfilter_active2() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

        wait.until(ExpectedConditions.visibilityOf(flowtechtics_superuser_IT_pageobjectmodel.humburger(driver)));
        flowtechtics_superuser_IT_pageobjectmodel.humburger(driver).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/a[@href='/it']")));
        flowtechtics_superuser_IT_pageobjectmodel.IT_button(driver).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("headlessui-listbox-button-:r0:")));
        flowtechtics_superuser_IT_pageobjectmodel.filter_textbox(driver).click();

        flowtechtics_superuser_IT_pageobjectmodel.active_filter_option(driver).click();
        flowtechtics_superuser_IT_pageobjectmodel.filter_button(driver).click();


    }






        @Test(priority=3)
        public void ITfilter_inactive() throws InterruptedException {





            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("/it")));

            //Thread.sleep(5000);
            WebElement humburger= driver.findElement(By.cssSelector("button[type='button']"));
            humburger.click();
            Thread.sleep(5000);

            WebElement IT= driver.findElement(By.xpath("//li/a[@href='/it']"));

            IT.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("headlessui-listbox-button-:r0:")));
            WebElement inactivefilter = driver.findElement(By.id("headlessui-listbox-button-:r0:"));
            inactivefilter.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("headlessui-listbox-option-:r4:")));
            WebElement inactive_option =driver.findElement(By.id("headlessui-listbox-option-:r4:"));
            inactive_option.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Filter']")));
            WebElement filter_button = driver.findElement(By.xpath("//*[text()='Filter']"));
            filter_button.click();

        }
        @Test(priority = 2)
        public void IT_search()
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

            wait.until(ExpectedConditions.visibilityOf(flowtechtics_superuser_IT_pageobjectmodel.humburger(driver)));
            flowtechtics_superuser_IT_pageobjectmodel.humburger(driver).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/a[@href='/it']")));
            flowtechtics_superuser_IT_pageobjectmodel.IT_button(driver).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search")));
            flowtechtics_superuser_IT_pageobjectmodel.search_textbox(driver).sendKeys("hossamtest22");
            String expected="hossamtest22";

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='hossamtest22']")));
            WebElement result =driver.findElement(By.xpath("//td[text()='hossamtest22']"));

            Assert.assertTrue(driver.findElement(By.xpath("//td[text()='hossamtest22']")).isDisplayed());
        }
        @Test(priority=4)
         public void ITfilter_active() throws InterruptedException {


            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("/it")));

            //Thread.sleep(5000);
            WebElement humburger= driver.findElement(By.cssSelector("button[type='button']"));
            humburger.click();
            Thread.sleep(6000);

            WebElement IT= driver.findElement(By.xpath("//li/a[@href='/it']"));
            IT.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("headlessui-listbox-button-:r0:")));
            WebElement activefilter = driver.findElement(By.id("headlessui-listbox-button-:r0:"));
            activefilter.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"headlessui-listbox-option-:r3:\"]")));
            WebElement active_option =driver.findElement(By.xpath("//*[@id=\"headlessui-listbox-option-:r3:\"]"));
            active_option.click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Filter']")));
            WebElement filter_button = driver.findElement(By.xpath("//*[text()='Filter']"));
            filter_button.click();

        }

        @Test(priority = 5)
        public void create_new_network() throws InterruptedException {
            WebElement humburger= driver.findElement(By.cssSelector("button[type='button']"));
            humburger.click();
            Thread.sleep(6000);
            flowtechtics_superuser_IT_pageobjectmodel.IT_button(driver).click();

            //WebElement IT= driver.findElement(By.xpath("//li/a[@href='/it']"));
          //  IT.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"add \"]")));
            //______
            flowtechtics_superuser_IT_pageobjectmodel.Add_network_button(driver).click();
          //  WebElement ADD_network_button= driver.findElement(By.xpath("//*[text()=\"add \"]"));
            //ADD_network_button.click();
            //network name
            flowtechtics_superuser_IT_pageobjectmodel.network_name_textbox(driver).sendKeys("hossamnetwork6");

           // WebElement network_name=driver.findElement(By.cssSelector("input[placeholder=\"Write Network name here ..\"]"));
            //network_name.click();
           // network_name.sendKeys("hossamnetwork6");

            //networkpass
            WebElement network_pass=driver.findElement(By.cssSelector("input[placeholder=\"Write Network password here ..\"]"));
            network_pass.click();
            network_pass.sendKeys("123456789");
            //network ip
            WebElement network_ip=driver.findElement(By.cssSelector("input[placeholder=\"192.2.....\"]"));
            network_ip.click();
            network_ip.sendKeys("192.111.111.116");
            //network mac
            WebElement network_mac=driver.findElement(By.cssSelector("input[placeholder=\"ass.....\"]"));
            network_mac.click();
            network_mac.sendKeys("ec.s1.s9.o6");
            //network location
            WebElement network_loc=driver.findElement(By.cssSelector("input[placeholder=\"network location\"]"));
            network_loc.click();
            network_loc.sendKeys("hossamTeam");
            //network active
            //add
            WebElement network_Add=driver.findElement(By.xpath("//*[text()='Add']"));
            network_Add.click();


        }
        @AfterMethod
        public void quit() throws InterruptedException {
               Thread.sleep(9000);
               WebElement logout=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div[2]/button"));
               logout.click();

               //  driver.close();


        }


}
