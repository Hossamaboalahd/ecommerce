package Krafts_automation_exercise;

import org.testng.annotations.*;

public class Krafts_View_Icon_test extends Base_test
{



    @Test
    public void CheckIcon() throws InterruptedException
    {
       // Home_Model.Home(driver).click();
       // Thread.sleep(200);

        Krafts_View_Model.Smallscrolldown(driver);
        Thread.sleep(2000);
        Krafts_View_Model.Smallscrollup(driver);
        Thread.sleep(2000);





    }



}
