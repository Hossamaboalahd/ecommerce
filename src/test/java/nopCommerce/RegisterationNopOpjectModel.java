package nopCommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;


public class RegisterationNopOpjectModel
{
    static By gendermale= By.id("gender-male");
    static By genderfemale=By.id("gender-female");
    static By firstname=By.name("FirstName");
    static By lastname= By.name("LastName");
    static By dayofbirth=By.name("DateOfBirthDay");
    static By monthofbirth=By.name("DateOfBirthMonth");
    static By yearofbirth=By.name("DateOfBirthYear");
    static By email=By.name("Email");
    static By companyname=By.name("Company");
    static By pass=By.id("Password");
    static By confirmpass=By.name("ConfirmPassword");
    static By registerbutton=By.name("register-button");
    static By registerpage= By.className("ico-register");
    static By result=By.className("result");
    static  Color RGBA_COLOUR = Color.fromString("rgba(76, 177, 124, 1)");


    public static WebElement GenderMale(WebDriver driver)
    {
        WebElement GenderMale= driver.findElement(gendermale);
        return GenderMale;
    }
    public static WebElement GenderFemale(WebDriver driver)
    {
        WebElement GenderFemale= driver.findElement(genderfemale);
        return GenderFemale;
    }
    public static WebElement FirstName(WebDriver driver)
    {
        WebElement FirstName= driver.findElement(firstname);
        return FirstName;
    }
    public static WebElement LastName(WebDriver driver)
    {
        WebElement LastName= driver.findElement(lastname);
        return LastName;
    }
    public static WebElement DayOfBirth(WebDriver driver)
    {
        WebElement DayOfBirth= driver.findElement(dayofbirth);
        return DayOfBirth;
    }
    public static WebElement MonthOfBirth(WebDriver driver)
    {
        WebElement MonthOfBirth= driver.findElement(monthofbirth);
        return MonthOfBirth;
    }
    public static WebElement YearOfBirth(WebDriver driver)
    {
        WebElement YearOfBirth= driver.findElement(yearofbirth);
        return YearOfBirth;
    }
    public static WebElement Email(WebDriver driver)
    {
        WebElement Email= driver.findElement(email);
        return Email;
    }
    public static WebElement CompanyName(WebDriver driver)
    {
        WebElement CompanyName= driver.findElement(companyname);
        return CompanyName;
    }
    public static WebElement Pass(WebDriver driver)
    {
        WebElement Pass= driver.findElement(pass);
        return Pass;
    }
    public static WebElement ConfirmPass(WebDriver driver)
    {
        WebElement ConfirmPass= driver.findElement(confirmpass);
        return ConfirmPass;
    }
    public static WebElement RegiterButton(WebDriver driver)
    {
        WebElement RegiterButton= driver.findElement(registerbutton);
        return RegiterButton;
    }
    public static WebElement RegisterPage(WebDriver driver)
    {
        WebElement RegisterPage= driver.findElement(registerpage);
        return RegisterPage;
    }
    public static WebElement Result(WebDriver driver)
    {
        WebElement Result= driver.findElement(result);
        return Result;
    }
    public static void  scrolldown(WebDriver driver)
    {
        JavascriptExecutor scroll=(JavascriptExecutor)driver;
        scroll.executeScript("scroll(0,200)");

    }





}
