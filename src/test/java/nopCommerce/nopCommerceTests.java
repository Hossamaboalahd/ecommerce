package nopCommerce;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
//import com.shaft.driver.SHAFT;

import java.util.List;
import java.util.Random;


public class nopCommerceTests
{
    LoginNopObjectModel obj = new LoginNopObjectModel();
    HomeNopObjectModel hobj=new HomeNopObjectModel();

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
        driver.get("https://demo.nopcommerce.com/");

    }

    @Test(priority = 1)
    public void RegisterT_01() throws InterruptedException {
        RegisterationNopOpjectModel.RegisterPage(driver).click();
        RegisterationNopOpjectModel.GenderMale(driver).click();
        RegisterationNopOpjectModel.scrolldown(driver);
        RegisterationNopOpjectModel.FirstName(driver).sendKeys("Test");
        RegisterationNopOpjectModel.LastName(driver).sendKeys("AboAlahd");
        RegisterationNopOpjectModel.scrolldown(driver);
        RegisterationNopOpjectModel.DayOfBirth(driver).sendKeys("28");
        RegisterationNopOpjectModel.MonthOfBirth(driver).sendKeys("october");
        RegisterationNopOpjectModel.YearOfBirth(driver).sendKeys("2000");
        RegisterationNopOpjectModel.Email(driver).sendKeys("AboAlahd@mail.com");
        RegisterationNopOpjectModel.scrolldown(driver);
        RegisterationNopOpjectModel.Pass(driver).sendKeys("123456789");
        RegisterationNopOpjectModel.ConfirmPass(driver).sendKeys("123456789");
        RegisterationNopOpjectModel.RegiterButton(driver).click();
        //Keeeeeeep
        //assertcolor
        Color resultButtonColour = Color.fromString(driver.findElement(By.className("result")).getCssValue("color"));
        System.out.println(resultButtonColour);
        assert resultButtonColour.asRgba().equals("rgba(76, 177, 124, 1)");
        //assert for msg
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Your registration completed']")).isDisplayed());

        Thread.sleep(3000);

    }
    @Test(priority = 3)
    //valid
    public void Login_Valid() throws InterruptedException {
        LoginNopObjectModel.LoginPage(driver).click();
        LoginNopObjectModel.scrolldown(driver);
        LoginNopObjectModel.Email(driver).sendKeys("AboAlahd@mail.com");
        LoginNopObjectModel.Pass(driver).sendKeys("123456789");
        LoginNopObjectModel.LoginButton(driver).click();
        Thread.sleep(3000);
        String current  = driver.getCurrentUrl();
        String expected="https://demo.nopcommerce.com/";
       // By myaccount =By.xpath("//a[text()='My account']");
        Assert.assertTrue(driver.findElement(obj.myaccount).isDisplayed());
        Assert.assertEquals(current,expected);

    }
    //invalid
    @Test(priority = 2)
    public void Login_02() throws InterruptedException {
        LoginNopObjectModel.LoginPage(driver).click();
        LoginNopObjectModel.Email(driver).sendKeys("wrong@example.com");
        LoginNopObjectModel.Pass(driver).sendKeys("P@ssw0rd");
        LoginNopObjectModel.scrolldown(driver);
        LoginNopObjectModel.LoginButton(driver).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//li[text()=\"No customer account found\"]")).isDisplayed());
        Color resultColour = Color.fromString(driver.findElement(By.xpath("//li[text()=\"No customer account found\"]")).getCssValue("color"));
        System.out.println(resultColour);
//        Color hexa =Color.fromString("rgba(228, 67, 75, 1)").asHex();
//        System.out.println(hexa);
        assert resultColour.asRgba().equals("rgba(228, 67, 75, 1)");

    }
    @Test(priority = 4)
    //valid
    public void CurrencyOpt() throws InterruptedException
    {

       // Login_Valid();

        HomeNopObjectModel.Currency(driver).click();
        Thread.sleep(1000);
        HomeNopObjectModel.Euro(driver).click();
         By currency= By.id("customerCurrency");
         Assert.assertTrue(driver.findElement(currency).isDisplayed());
        Thread.sleep(3000);

        HomeNopObjectModel.scrolldown(driver);
        WebElement elecomp=null;
        //List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),'€')]"));
        List<WebElement> elements = driver.findElements(By.cssSelector("div[class='product-item']"));

        Thread.sleep(3000);

        System.out.println(elements.size());
            for (int i=0; i< elements.size(); i++)
            {
                System.out.println("product");
                System.out.println(elements.get(i));
               elecomp=elements.get(i);
              String text= elecomp.getText();
                System.out.println(text);

                Assert.assertTrue(text.contains("€"));
                System.out.println("assert pass");

            }


    }
    @Test(priority = 5)
    //product name
    public void Search() throws InterruptedException
    {
        String input ="laptop";
     HomeNopObjectModel.Search(driver).sendKeys(input);
     HomeNopObjectModel.SearchButton(driver).click();
     Thread.sleep(3000);
     HomeNopObjectModel.Smallscrolldown(driver);
        WebElement elecomp=null;
     List<WebElement> elements = driver.findElements(By.cssSelector("div[class='product-item']"));
     for (int i=0;i< elements.size();i++)
     {
         System.out.println("product");
         System.out.println(elements.get(i));
         elecomp=elements.get(i);
         String text= elecomp.getText().toLowerCase();
         System.out.println(text);

         Assert.assertTrue(text.contains(input));
         System.out.println("assert pass");
     }

    }
    @Test(priority = 6)
    //Sku name
    public void Search_2() throws InterruptedException
    {
        String input ="APPLE_CAM".toUpperCase();
        //input.toUpperCase();
        HomeNopObjectModel.Search(driver).sendKeys(input);
        HomeNopObjectModel.SearchButton(driver).click();
        Thread.sleep(3000);
        HomeNopObjectModel.Smallscrolldown(driver);
        WebElement elecomp=null;
        List<WebElement> elements = driver.findElements(By.cssSelector("div[class='product-item']"));
        for (int i=0;i< elements.size();i++)
        {
            System.out.println("product");
            System.out.println(elements.get(i));
            elecomp=elements.get(i);
            String text= elecomp.getText().toLowerCase();
            //System.out.println(text);
            elecomp.click();

        }
       // elecomp.click();
        HomeNopObjectModel.Smallscrolldown(driver);

        WebElement overview= driver.findElement(By.className("overview"));
        String overviews= overview.getText().toUpperCase();
        System.out.println(overviews);
        Assert.assertTrue(overviews.contains(input));
        //الحمدلله زهقققققت
    }
    @Test(priority = 7)
    //hover using action
    public void hoverOnCategory() throws InterruptedException
    {
        Actions actions=new Actions(driver);

        actions.moveToElement(HomeNopObjectModel.DigitalCategory(driver)).click().build().perform();
         HomeNopObjectModel.Smallscrolldown(driver);
         Thread.sleep(3000);


    }
    @Test(priority = 8)
    //hover using action
    public void hoverOnCategoryRandom() throws InterruptedException
    {
        Actions actions=new Actions(driver);
        HomeNopObjectModel.Smallscrolldown(driver);
        List<WebElement> categories= driver.findElements(hobj.Category);
        int size=categories.size();
        if (size>0)
        {
        System.out.println(size);
        System.out.println(categories);

        WebElement rand=categories.get(new Random().nextInt(size));
        System.out.println(rand);
        rand.getText().toLowerCase();
      //  rand.click();
            Thread.sleep(3000);
        actions.moveToElement(rand).click().build().perform();
        Thread.sleep(3000);


        //actions.moveToElement(HomeNopObjectModel.DigitalCategory(driver)).click().build().perform();
        HomeNopObjectModel.Smallscrolldown(driver);
        Thread.sleep(3000);
        }
        else System.out.println("no categories");


    }


    @AfterMethod
    public void Home() throws InterruptedException {
        Thread.sleep(1000);
        driver.get("https://demo.nopcommerce.com/");

    }
    @AfterClass
    public void Close() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

}
