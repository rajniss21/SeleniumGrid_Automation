package test.Frontend.Tests;


import org.testng.annotations.Test;
import test.Frontend.Elements.LandingPage;
import test.Frontend.SetupFrontend;

import java.io.IOException;

/**
 * Created by Rajnish on Aug, 2018
 */
public class EmailAddressesPostTest extends SetupFrontend {

     public int i = 0;

    @Test(dataProvider = "EmailData", dataProviderClass = test.Frontend.Data.DataForEmails.class, priority = 2)

    public void emailAddressesPostTest(String Email) throws InterruptedException, IOException {
        /**
         * Please check the excel file before running the test.
         * This test reads multiple excel files data(i.e, more than 100 iterations)
         * Run this test enabling hide price toggle button in store edit billing section.
         * */

        LandingPage landingPageObj = new LandingPage(myWebDriver);
        Thread.sleep(1000);
        landingPageObj.clickAddRecipientBtn();
        Thread.sleep(2000);
        landingPageObj.getRecipientEmail().get(i).sendKeys(Email);
        i = i+1;
        Thread.sleep(1000);
        




    }
}
