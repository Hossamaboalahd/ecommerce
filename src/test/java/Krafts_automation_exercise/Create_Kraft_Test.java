package Krafts_automation_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;


public class Create_Kraft_Test extends Base_test
{
    @Test
    public void CheckCreate() throws InterruptedException
    {
        File vid=new File("C:\\Users\\MSI\\Desktop\\محمود درويش.mp4");

        Thread.sleep(2000);

       Krafts_Create_Model.Add_Button(driver).click();
       Krafts_Create_Model.Add_Craft(driver).click();
        Krafts_Create_Model.Upload(driver).click();
        // File vid=new File("C:\\Users\\MSI\\Desktop\\محمود درويش.mp4");
        // Krafts_Create_Model.Upload(driver).sendKeys(vid.getAbsolutePath());
        Thread.sleep(6000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-icon=\"►\"]")));
        Krafts_Create_Model.Play_in_review(driver).click();
        Thread.sleep(10000);
       // Krafts_Create_Model.Play_in_review(driver).click();عشان باللوجو مش بال id
        Krafts_Create_Model.Next_Review(driver).click();
        Krafts_Create_Model.Status(driver).click();
        Thread.sleep(1000);
        Krafts_Create_Model.Status_followers(driver).click();
        Thread.sleep(1000);
        Krafts_Create_Model.Status(driver).click();
        Thread.sleep(1000);
        Krafts_Create_Model.Status_public(driver).click();
        Thread.sleep(1000);
        Krafts_Create_Model.Hashtag(driver).sendKeys("HOSSS");


        Thread.sleep(2000);






    }


}
