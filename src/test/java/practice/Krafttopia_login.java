package practice;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Krafttopia_login
{
    WebDriver driver;
    @BeforeSuite
    public void declare()
    {
        WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver();
    }

    @BeforeSuite
    public void krafttopia_Getpage() throws InterruptedException {
        driver.get("https://www.krafttopia.work/auth/sign-in");
        driver.manage().window().maximize();
        // WebElement signin_infrom_guest = driver.findElement(By.cssSelector("p[class=\"MuiTypography-root MuiTypography-body1 css-exrpvz\"]"));
      //  signin_infrom_guest.click();
        //Thread.sleep(3000);

    }
   // @Test(priority=0)
    public void faillogin()
    {
        By lname=By.name("username");
        By lpass=By.name("password");
        By lbutton=By.cssSelector("span[class=\"MuiTypography-root MuiTypography-caption css-1e7d4e1\"]");        WebElement name  =driver.findElement(lname);
        WebElement pass  =driver.findElement(lpass);
        WebElement button  =driver.findElement(lbutton);

        name.sendKeys("testshop@gmail.coms");
        pass.sendKeys("465465132");
        button.click();
        String currentUrl = "https://krafttopia.work/auth/sign-in";
        //WebElement url = driver.findElement();
        Assert.assertTrue(currentUrl.equals("https://krafttopia.work/auth/sign-in"));
        name.clear();
        pass.clear();

    }

    @Test(priority = 1)
    public void passlogin() throws InterruptedException {

        By lname=By.name("username");
        By lpass=By.name("password");
        By lbutton=By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div[1]/div/div[3]/div[4]/button/span");

        //WebElement signin_infrom_guest = driver.findElement(By.className("class=\"MuiTypography-root MuiTypography-body1 css-exrpvz\""));

        WebElement name  =driver.findElement(lname);
        WebElement pass  =driver.findElement(lpass);
        WebElement button  =driver.findElement(lbutton);
       // signin_infrom_guest.click();
        name.sendKeys("testo@gmail.com");
        pass.sendKeys("qweqweqwe1");
        button.click();
        Thread.sleep(3000);
      //  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
     // WebElement userlogin= driver.findElement(By.className("NavbarProfile_image_person_navbar__2jdpG"));
     // Assert.assertTrue(true, String.valueOf(userlogin));


    }
    @Test(priority =3)
     public void updatequant() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div/main/nav/div/div/div[3]/a/div")).click();
      //  driver.get("https://krafttopia.work/cart");
        Thread.sleep(3000);
    //  By plus=By.cssSelector("svg[data-testid=\"AddRoundedIcon\"]");
        By pluscart=By.xpath("/html/body/div/main/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/button/span");

        By subcart=By.xpath("/html/body/div/main/div/div/div/div/div/div[2]/div/div/div[2]/div/div/div/div/button/span");
     //   By sub=By.cssSelector("svg[data-testid=\"RemoveRoundedIcon\"]");
       for (int i =0;i<10;i++)
       {
           driver.findElement(pluscart).click();
           Thread.sleep(1000);
           driver.findElement(subcart).click();
           Thread.sleep(1000);

       }


}

    public static void  Smallscrolldown(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(0,600)");

    }

   // @Test(priority = 1)
    //حنيكه
    public void sharePost() throws InterruptedException
    {

        driver .get("https://krafttopia.work/shop/posts?id=3121689");
        Smallscrolldown(driver);
        Thread.sleep(2000);
        for (int i=0;i<100;i++) {
            Thread.sleep(2000);
            WebElement share_button = driver.findElement(By.cssSelector("path[d='M3.341 35.296C3.20206 35.296 3.06649 35.2533 2.95262 35.1736C2.83876 35.094 2.7521 34.9813 2.70437 34.8509C2.53615 34.3799 -1.3975 23.2699 3.84823 14.4062C6.88128 9.2692 12.3547 5.99806 20.1211 4.67304V1.09135C20.121 0.968434 20.1544 0.847803 20.2177 0.742458C20.281 0.637112 20.3719 0.551047 20.4805 0.493535C20.5892 0.436023 20.7114 0.409245 20.8342 0.416086C20.9569 0.422928 21.0754 0.46313 21.177 0.53236L37.0513 11.3395C37.1421 11.4018 37.2163 11.4853 37.2676 11.5827C37.3188 11.6801 37.3456 11.7885 37.3456 11.8985C37.3456 12.0086 37.3188 12.117 37.2676 12.2144C37.2163 12.3118 37.1421 12.3952 37.0513 12.4575L21.177 23.2621C21.0758 23.3321 20.9572 23.3728 20.8344 23.3796C20.7115 23.3865 20.5892 23.3592 20.4808 23.3009C20.3725 23.2437 20.2819 23.158 20.2185 23.0532C20.1551 22.9483 20.1215 22.8282 20.1211 22.7057V17.4056C17.7137 17.9036 15.4092 18.8095 13.3071 20.0842C8.13125 23.2414 5.00762 28.1637 4.00868 34.7163C3.98621 34.8649 3.91462 35.0017 3.80533 35.1049C3.69604 35.2081 3.55536 35.2717 3.4057 35.2856L3.341 35.296ZM21.472 2.36979V5.24756C21.4727 5.40856 21.4156 5.56447 21.3112 5.68698C21.2067 5.80949 21.0618 5.89048 20.9027 5.91525C13.2528 7.11087 7.9061 10.1931 5.0128 15.0791C1.57344 20.8916 2.42487 27.9618 3.24783 31.7298C5.0775 24.8097 9.26476 20.964 12.655 18.9092C15.1195 17.3933 17.862 16.385 20.7215 15.9435C20.8161 15.9329 20.9118 15.9424 21.0025 15.9714C21.0931 16.0004 21.1766 16.0483 21.2475 16.1118C21.3183 16.1753 21.375 16.2531 21.4137 16.3401C21.4524 16.427 21.4722 16.5212 21.472 16.6163V21.4273L35.4701 11.8985L21.472 2.36979Z']"));
            share_button.click();
            Thread.sleep(1000);
            // WebElement share_button_inframe= driver.findElement(By.xpath("//button[text()='Share']"));
            WebElement share_inside = driver.findElement(By.cssSelector("button[class=\"style_share_btn__xrtSQ\"]"));
            share_inside.click();
            Thread.sleep(1000);
        }


    }
   //  @Test(priority = 2)
    //حنيكه
    public void addPost() throws InterruptedException
    {
        for (int i=0;i<10;i++)
       {
            Thread.sleep(2000);
            WebElement postIcon = driver.findElement(By.cssSelector("svg[data-testid='AddRoundedIcon']"));
            postIcon.click();
            //WebElement txtbox= driver.findElement(By.cssSelector("textarea[placeholder='Write your post here..']"));
            WebElement txtbox = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[2]/textarea"));
            txtbox.sendKeys("hosam___post:)");
          //  WebElement Post= driver.findElement(By.xpath("//span[text()='post']"));
            WebElement Post= driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[4]/button/span"));
            Post.click();
            Thread.sleep(2000);


        }

    }



        @AfterSuite
    public void quit() throws InterruptedException {
        Thread.sleep(3000);
      //  driver.quit();
    }
}
