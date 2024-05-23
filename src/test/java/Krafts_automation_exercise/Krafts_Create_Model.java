package Krafts_automation_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Krafts_Create_Model
{
    static By add_button=By.cssSelector("svg[data-testid=\"AddIcon\"]");
    static By add_craft=By.cssSelector("li[tabindex=\"-1\"]");
    static By upload =By.cssSelector("svg[data-testid=\"VideocamOutlinedIcon\"]");
    static By play_review=By.cssSelector("div[data-icon=\"►\"]");
    static By next_review=By.id("nextBtn");
    static By back_review=By.id("backBtn");
    //static By view_video_review_1=By.id("");
    static By getView_video_review_2=By.id("videoUploadedView");
    static By hashtag=By.id("hashtagsInp");
    static By status=By.id("statusSelector");
    static By status_public=By.cssSelector("svg[data-testid=\"PublicIcon\"]");
    static By status_followers=By.cssSelector("li[data-value=\"followers\"]");
    static By status_only=By.cssSelector("li[data-value=\"only\"]");
    static By create=By.id("createKraft");

    static public WebElement Status(WebDriver driver)
    {
        WebElement Status= driver.findElement(status);
        return Status;
    }
    static public WebElement Status_public(WebDriver driver)
    {
        WebElement Status_public= driver.findElement(status_public);
        return Status_public;
    }
    static public WebElement Status_followers(WebDriver driver)
    {
        WebElement Status_followers= driver.findElement(status_followers);
        return Status_followers;
    }
    static public WebElement Status_only(WebDriver driver)
    {
        WebElement Status_only= driver.findElement(status_only);
        return Status_only;
    }
    static public WebElement Play_in_review(WebDriver driver)
    {
        WebElement Play_in_review= driver.findElement(play_review);
        return Play_in_review;
    }
    static public WebElement Next_Review(WebDriver driver)
    {
        WebElement Next_review= driver.findElement(next_review);
        return Next_review;
    }
    static public WebElement Back_Review(WebDriver driver)
    {
        WebElement Back_review= driver.findElement(back_review);
        return Back_review;
    }
    static public WebElement Hashtag(WebDriver driver)
    {
        WebElement Hashtag= driver.findElement(hashtag);
        return Hashtag;
    }
    static public WebElement Create(WebDriver driver)
    {
        WebElement Create= driver.findElement(create);
        return Create;
    }


    static public WebElement Add_Button(WebDriver driver)
    {
        WebElement Add_Button= driver.findElement(add_button);
        return Add_Button;
    }
    static public WebElement Add_Craft(WebDriver driver)
    {
        WebElement Add_Craft= driver.findElement(add_craft);
        return Add_Craft;
    }
    static public WebElement Upload(WebDriver driver)
    {
        WebElement Upload= driver.findElement(upload);
        return Upload;
    }
//    static WebElement void  Upload_Video_1(WebDriver driver,String txt)
//    {
//      return   video = driver.findElement(upload).sendKeys(txt);
//
//    }
}
