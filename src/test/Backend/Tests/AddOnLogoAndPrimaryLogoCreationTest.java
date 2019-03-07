package test.Backend.Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import test.Backend.Elements.DashboardPage;
import test.Backend.Elements.SM_Stores_StorePage;

import java.io.File;


/**
 * Created By Rajnish on Dec, 2018
 */
public class AddOnLogoAndPrimaryLogoCreationTest extends Setup{

    @Test
    public void addOnLogoAndPrimaryLogoCreationTest() throws InterruptedException{

        File mySVGFile = new File("./LogosAndSvgs/");
        JavascriptExecutor jse =(JavascriptExecutor)myWebDriver;

        DashboardPage dashboardPageObj = new DashboardPage(myWebDriver);
        SM_Stores_StorePage sm_stores_storePage = new SM_Stores_StorePage(myWebDriver);

        loginTotheModule();
        waitForThisTobeClickable(dashboardPageObj.getStoreMainMenu());
        dashboardPageObj.getStoreMainMenu().click();
        waitForThisTobeClickable(sm_stores_storePage.getStoresSubMenu());
        sm_stores_storePage.getStoresSubMenu().click();
        /*waitForThisTobeClickable(sm_stores_storePage.getStoreDC());
        sm_stores_storePage.getStoreDC().click();*/
        waitfor(sm_stores_storePage.getStoreScrum());
        sm_stores_storePage.getStoreScrum().click();
        waitForThisTobeClickable(sm_stores_storePage.getLogosTab());
        sm_stores_storePage.getLogosTab().click();
        waitForThisTobeClickable(sm_stores_storePage.getEditStoreBtn());
        sm_stores_storePage.getEditStoreBtn().click();
        waitForThisTobeClickable(sm_stores_storePage.getAddLogoBtn());
        sm_stores_storePage.getAddLogoBtn().click();
        waitForThisTobeClickable(sm_stores_storePage.setLogoTitle());
        sm_stores_storePage.setLogoTitle().sendKeys("Add On 3");
        waitForThisTobeClickable(sm_stores_storePage.getAddOnLogoRadioBtn());
        sm_stores_storePage.getAddOnLogoRadioBtn().click();
        jse.executeScript("document.getElementById('logo_image').classList.remove('hidden')");
        Thread.sleep(2000);
        sm_stores_storePage.getLogoImageUpload().sendKeys(mySVGFile.getAbsolutePath()+"/_floridalegalrights__arlm_logo__embroidery.svg");
        waitForThisTobeClickable(sm_stores_storePage.getLocationTab());
        sm_stores_storePage.getLocationTab().click();
        waitForThisTobeClickable(sm_stores_storePage.getApparelTops());
        sm_stores_storePage.getApparelTops().click();
        waitForThisTobeClickable(sm_stores_storePage.getLeftSleeve());
        sm_stores_storePage.getLeftSleeve().click();
        waitForThisTobeClickable(sm_stores_storePage.getLogoSubmitBtn());
        sm_stores_storePage.getLogoSubmitBtn().click();
        Thread.sleep(10000);

        //Creates  Second AddOn Logo...
        waitForThisTobeClickable(sm_stores_storePage.getAddLogoBtn());
        sm_stores_storePage.getAddLogoBtn().click();
        waitForThisTobeClickable(sm_stores_storePage.setLogoTitle());
        sm_stores_storePage.setLogoTitle().sendKeys("Add On 4");
        waitForThisTobeClickable(sm_stores_storePage.getAddOnLogoRadioBtn());
        sm_stores_storePage.getAddOnLogoRadioBtn().click();
        jse.executeScript("document.getElementById('logo_image').classList.remove('hidden')");
        Thread.sleep(2000);
        sm_stores_storePage.getLogoImageUpload().sendKeys(mySVGFile.getAbsolutePath()+"/_lennar___Knowology Logo_embroidery.svg");
        waitForThisTobeClickable(sm_stores_storePage.getLocationTab());
        sm_stores_storePage.getLocationTab().click();
        waitForThisTobeClickable(sm_stores_storePage.getApparelTops());
        sm_stores_storePage.getApparelTops().click();
        waitForThisTobeClickable(sm_stores_storePage.getRightSleeve());
        sm_stores_storePage.getRightSleeve().click();
        waitForThisTobeClickable(sm_stores_storePage.getLogoSubmitBtn());
        sm_stores_storePage.getLogoSubmitBtn().click();
        Thread.sleep(10000);

        // Creates Primary Logo....
        waitForThisTobeClickable(sm_stores_storePage.getAddLogoBtn());
        sm_stores_storePage.getAddLogoBtn().click();
        waitForThisTobeClickable(sm_stores_storePage.setLogoTitle());
        sm_stores_storePage.setLogoTitle().sendKeys("Primary 21");
        jse.executeScript("document.getElementById('logo_image').classList.remove('hidden')");
        sm_stores_storePage.getLogoImageUpload().sendKeys(mySVGFile.getAbsolutePath()+"/jmwrealtyservices_logo.svg");
        waitForThisTobeClickable(sm_stores_storePage.getLocationTab());
        sm_stores_storePage.getLocationTab().click();
        waitForThisTobeClickable(sm_stores_storePage.getApparelTopsPrimary());
        sm_stores_storePage.getApparelTopsPrimary().click();
        jse.executeScript("document.getElementById('location4').click()");
        jse.executeScript("document.getElementById('location5').click()");
        jse.executeScript("document.getElementById('location6').click()");
        jse.executeScript("document.getElementById('location7').click()");
        jse.executeScript("document.getElementById('location8').click()");
        jse.executeScript("document.getElementById('location9').click()");
        jse.executeScript("document.getElementById('location10').click()");
        waitForThisTobeClickable(sm_stores_storePage.getAddOnsTab());
        sm_stores_storePage.getAddOnsTab().click();
        waitForThisTobeClickable(sm_stores_storePage.getApparelTopsInsideOfAddOns());
        sm_stores_storePage.getApparelTopsInsideOfAddOns().click();
        jse.executeScript("document.getElementsByName('addons[]')[0].click()");
       // jse.executeScript("document.getElementsByName('addon_options[]')[2].click()");
        jse.executeScript("document.getElementsByName('addons[]')[1].click()");
        Thread.sleep(4000);
        waitForThisTobeClickable(sm_stores_storePage.getLogoSubmitBtn());
        sm_stores_storePage.getLogoSubmitBtn().click();
        Thread.sleep(4000);
        waitForThisTobeClickable(sm_stores_storePage.getStoreSubmitBtn());
        sm_stores_storePage.getStoreSubmitBtn().click();
        Thread.sleep(4000);
    }

}
