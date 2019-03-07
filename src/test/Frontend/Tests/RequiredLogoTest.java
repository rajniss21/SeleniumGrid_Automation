package test.Frontend.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.Frontend.Elements.LandingPage;

/**
 * Created By Rajnish on Dec, 2018
 */
public class RequiredLogoTest extends SetupForRequiredAndOptionalLogoOnly {

    @Test
    public void requiredLogoTest() throws InterruptedException {

        LandingPage landingPageObj = new LandingPage(myWebDriver);

        frontendAccessForRequiredAndOptionalLogoTest();
        Thread.sleep(3000);
        String heading2 = landingPageObj.getProductColorHeaderText();
        Assert.assertEquals("Product Color", heading2);
        System.out.println(heading2 +" text is displayed");
    }
}
