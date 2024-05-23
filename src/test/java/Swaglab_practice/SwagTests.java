package Swaglab_practice;
import com.google.gson.internal.bind.util.ISO8601Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import javax.swing.*;
import java.time.Duration;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class SwagTests
{
   // HomePageModel obj=new HomePageModel();

    //System.out.println(obj.burger);


    WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    @BeforeSuite
    public void Declare()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
    }

    @BeforeClass
    public void WebsiteNavigate()
    {

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void login()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        LoginPageModel.UserName(driver).sendKeys("standard_user");
        LoginPageModel.PassWord(driver).sendKeys("secret_sauce");
        LoginPageModel.LoginButton(driver).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));



    }
    @Test
    public void filtera_z()
    {
        HomePageModel.FilterButtonGlobal(driver).click();
        HomePageModel.FilterOptionA_Z(driver).click();

    }
    @Test
    public void filterz_a()
    {
        HomePageModel.FilterButtonGlobal(driver).click();
        HomePageModel.FilterOptionZ_A(driver).click();

    }
    @Test
    public void filterh_l()
    {
        HomePageModel.FilterButtonGlobal(driver).click();
        HomePageModel.FilterOptionH_L(driver).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("option[value='hilo']")).isSelected());


    }
    @Test
    public void filterl_h()
    {
        HomePageModel.FilterButtonGlobal(driver).click();
        HomePageModel.FilterOptionL_H(driver).click();

    }
    @Test(priority=5)
    public void addtocart()
    {
        HomePageModel.AddToCart(driver).click();
    }
    @Test(priority=6)
    public void addtocartlastitem() throws InterruptedException {
        HomePageModel.scrolldown(driver);
        HomePageModel.AddToCartLastItem(driver).click();
        HomePageModel.OpenLastItem(driver).click();
        Thread.sleep(3000);
        Assert.assertTrue(HomePageModel.Removelastitem(driver).isDisplayed());
        HomePageModel.Removelastitem(driver).click();
        HomePageModel.AddToCartLastItem(driver).click();
       // HomePageModel.CartIcon(driver).click();
      //  HomePageModel.Removelastitem(driver).click();




        //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-test='add-to-cart-test.allthethings()-t-shirt-(red)']")));


    }
    @Test(priority=7)
    public void ContinueShopping() throws InterruptedException
    {
       Thread.sleep(2000);
       // addtocartlastitem();
        HomePageModel.CartIcon(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("continue-shopping")));
        CartPageModel.ContinueShopping(driver).click();
        Thread.sleep(2000);
        HomePageModel.CartIcon(driver).click();
        Thread.sleep(3000);


    }
    @Test(priority=8)
    public void Checkout() throws InterruptedException
    {
       // Thread.sleep(2000);
        //addtocartlastitem();
        HomePageModel.CartIcon(driver).click();

        Thread.sleep(3000);
        CartPageModel.Checkout(driver).click();
        //CartPageModel.Continue(driver).click();
        CartPageModel.FirstName(driver).sendKeys("HossamTest");
        CartPageModel.LastName(driver).sendKeys("AboAlahd");
        CartPageModel.PostalCode(driver).sendKeys("032");
        CartPageModel.Continue(driver).click();
        Thread.sleep(3000);
        HomePageModel.scrolldown(driver);
        CartPageModel.Finish(driver).click();


    }
    @Test(priority=9)
    public void Twitterlink() throws InterruptedException {
        HomePageModel.scrolldown(driver);
        String handle= driver.getWindowHandle();
        HomePageModel.TwitterIcon(driver).click();
        Thread.sleep(3000);
       // driver.close();

        driver.switchTo().window(handle);




    }
    @Test(priority=10)
    public void FacebookLink() throws InterruptedException {
        HomePageModel.scrolldown(driver);
        String handle= driver.getWindowHandle();
        HomePageModel.FacebookIcon(driver).click();
        Thread.sleep(3000);
        driver.switchTo().window(handle);


    }
    @Test(priority=11)
    public void LinkedInLink() throws InterruptedException {
        HomePageModel.scrolldown(driver);
        String handle= driver.getWindowHandle();
        HomePageModel.LinkedInIcon(driver).click();
        Thread.sleep(3000);

        driver.switchTo().window(handle);
        //driver.close();



    }
    @Test(priority=12)
    public void CheckBurgerList() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        HomePageModel.scrolldown(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn")));


        HomePageModel.Burger(driver).click();
        HomePageModel.CloseBurger(driver).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn")));
        Thread.sleep(3000);

        HomePageModel.Burger(driver).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='All Items']")));
        HomePageModel.AllItemBurger(driver).click();
        HomePageModel.CloseBurger(driver).click();



    }
    @Test(priority=13)
    public void CheckAbout() throws InterruptedException
    {

        HomePageModel.Burger(driver).click();
        HomePageModel.About(driver).sendKeys(Keys.CONTROL , "t");
        Thread.sleep(2000);
//        Actions action = new Actions(driver);
//        action.contextClick()
//        action.KeyDown(Keys.Control).MoveToElement(body).Click().Perform();


        // Assert.assertTrue(driver.findElement(By.className("MuiTypography-root MuiTypography-h1 css-9sm5so")).isDisplayed());

       // driver.navigate().back();
        driver.navigate().refresh();


    }
    @Test(priority=14)
    public void BlockedUser() throws InterruptedException
    {
        HomePageModel.Burger(driver).click();
        HomePageModel.LogOut(driver).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        LoginPageModel.UserName(driver).sendKeys("locked_out_user");
        LoginPageModel.PassWord(driver).sendKeys("secret_sauce");
        LoginPageModel.LoginButton(driver).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed());



        LoginPageModel.UserName(driver).clear();
        LoginPageModel.PassWord(driver).clear();
        login();


    }
    @Test(priority=15)
    public void ProblemUser() throws InterruptedException
    {
        HomePageModel.Burger(driver).click();
        HomePageModel.LogOut(driver).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        LoginPageModel.UserName(driver).sendKeys("problem_user");
        LoginPageModel.PassWord(driver).sendKeys("secret_sauce");
        LoginPageModel.LoginButton(driver).click();
        HomePageModel.AddToCart(driver).click();
        Assert.assertTrue(driver.findElement(By.name("remove-sauce-labs-backpack")).isDisplayed());
        Assert.assertFalse(driver.findElement(By.name("remove-sauce-labs-backpack")).isSelected());

        ContinueShopping();



    }
    @Test(priority=16)
    public void GlitchUser() throws InterruptedException
    {
        HomePageModel.Burger(driver).click();
        HomePageModel.LogOut(driver).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        LoginPageModel.UserName(driver).sendKeys("performance_glitch_user");
        LoginPageModel.PassWord(driver).sendKeys("secret_sauce");
        LoginPageModel.LoginButton(driver).click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-test='add-to-cart-sauce-labs-backpack']")));
//        Thread.sleep(5000);
//        HomePageModel.AddToCart(driver).click();
//        Assert.assertTrue(driver.findElement(By.name("remove-sauce-labs-backpack")).isDisplayed());
//        Assert.assertFalse(driver.findElement(By.name("remove-sauce-labs-backpack")).isSelected());

        HomePageModel.scrolldown(driver);
        HomePageModel.AddToCartLastItem(driver).click();
        HomePageModel.Removelastitem(driver).click();

    }
    @Test(priority=17)
    public void VisualBugUser() throws InterruptedException
    {
        HomePageModel.Burger(driver).click();
        HomePageModel.LogOut(driver).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        LoginPageModel.UserName(driver).sendKeys("visual_user");
        LoginPageModel.PassWord(driver).sendKeys("secret_sauce");
        LoginPageModel.LoginButton(driver).click();
        HomePageModel.FilterOptionH_L(driver).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("option[value='hilo']")).isSelected());
        HomePageModel.scrolldown(driver);
        HomePageModel.AddToCartLastItem(driver).click();
        HomePageModel.scrollup(driver);

    }
    @Test(priority=18)
    public void Reset() throws InterruptedException
    {
        HomePageModel.Burger(driver).click();
        HomePageModel.ResetAppState(driver).click();
        HomePageModel.CloseBurger(driver).click();
    }

    @Test(priority=19)
    public void BuyAndReset() throws InterruptedException
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));

        HomePageModel.scrolldown(driver);
        HomePageModel.AddToCartLastItem(driver).click();
        Assert.assertTrue(driver.findElement(By.className("shopping_cart_badge")).isDisplayed());
        Reset();
       // wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.className("shopping_cart_badge"))));
     //   Assert.assertFalse(driver.findElement(By.className("shopping_cart_badge")).isDisplayed());

    }
    @Test(priority=20)

    public void WrongCheckout() throws InterruptedException {
        addtocartlastitem();
        HomePageModel.CartIcon(driver).click();

        Thread.sleep(3000);
        CartPageModel.Checkout(driver).click();
        //CartPageModel.Continue(driver).click();
        CartPageModel.Continue(driver).click();
        Thread.sleep(3000);
        HomePageModel.scrolldown(driver);
        Assert.assertTrue(driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed());
        HomePageModel.CartIcon(driver).click();
        HomePageModel.Removelastitem(driver).click();
    }
    @Test(priority=21)

    public void CancelCheckout() throws InterruptedException
    {
        WrongCheckout();
        CartPageModel.Checkout(driver).click();
       // CartPageModel.Continue(driver).click();
        CartPageModel.CacelCheckout(driver).click();

    }
    @Test(priority=22)

    public void Invaliduser() throws InterruptedException
    {
        wait_close();
        LoginPageModel.UserName(driver).sendKeys("fake");
        LoginPageModel.PassWord(driver).sendKeys("fake");
        LoginPageModel.LoginButton(driver).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("h3[data-test='error']")).isDisplayed());
        LoginPageModel.UserName(driver).clear();
        LoginPageModel.PassWord(driver).clear();
        login();


    }



    @AfterMethod
    public void wait_close() throws InterruptedException {
      //  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn")));
        Thread.sleep(3000);
        HomePageModel.Burger(driver).click();
        HomePageModel.LogOut(driver).click();

    }
    @AfterSuite
    public void QuitDriver()
    {
        driver.quit();
    }


}

