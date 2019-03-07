package test.Backend.Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import test.Backend.Elements.DashboardPage;
import test.Backend.Elements.SM_Stores_StorePage;

import java.io.File;

/**
 * Created By Rajnish on Dec, 2018
 */
public class PrimaryLogoCreationTest extends Setup{

    @Test
    public void primaryLogoCreationTest() throws InterruptedException{

        File mySVGFile = new File("./LogosAndSvgs/");
        JavascriptExecutor javascriptExecutor =(JavascriptExecutor)myWebDriver;

        DashboardPage dashboardPageObj = new DashboardPage(myWebDriver);
        SM_Stores_StorePage sm_stores_storePage = new SM_Stores_StorePage(myWebDriver);

        loginTotheModule();
        waitForThisTobeClickable(dashboardPageObj.getStoreMainMenu());
        dashboardPageObj.getStoreMainMenu().click();
        waitForThisTobeClickable(sm_stores_storePage.getStoresSubMenu());
        sm_stores_storePage.getStoresSubMenu().click();
        waitForThisTobeClickable(sm_stores_storePage.getStoreDC());
        sm_stores_storePage.getStoreDC().click();
        waitForThisTobeClickable(sm_stores_storePage.getLogosTab());
        sm_stores_storePage.getLogosTab().click();
        waitForThisTobeClickable(sm_stores_storePage.getEditStoreBtn());
        sm_stores_storePage.getEditStoreBtn().click();
        waitForThisTobeClickable(sm_stores_storePage.getAddLogoBtn());
        sm_stores_storePage.getAddLogoBtn().click();
        waitForThisTobeClickable(sm_stores_storePage.setLogoTitle());
        sm_stores_storePage.setLogoTitle().sendKeys("Primary 21");
        javascriptExecutor.executeScript("document.getElementById('logo_image').classList.remove('hidden')");
        sm_stores_storePage.getLogoImageUpload().sendKeys(mySVGFile.getAbsolutePath()+"/jmwrealtyservices_logo.svg");
        waitForThisTobeClickable(sm_stores_storePage.getLocationTab());
        sm_stores_storePage.getLocationTab().click();
        waitForThisTobeClickable(sm_stores_storePage.getApparelTopsPrimary());
        sm_stores_storePage.getApparelTopsPrimary().click();
        javascriptExecutor.executeScript("document.getElementById('location4').click()");
        javascriptExecutor.executeScript("document.getElementById('location5').click()");
        javascriptExecutor.executeScript("document.getElementById('location6').click()");
        javascriptExecutor.executeScript("document.getElementById('location7').click()");
        javascriptExecutor.executeScript("document.getElementById('location8').click()");
        javascriptExecutor.executeScript("document.getElementById('location9').click()");
        javascriptExecutor.executeScript("document.getElementById('location10').click()");
        waitForThisTobeClickable(sm_stores_storePage.getAddOnsTab());
        sm_stores_storePage.getAddOnsTab().click();
        waitForThisTobeClickable(sm_stores_storePage.getApparelTopsInsideOfAddOns());
        sm_stores_storePage.getApparelTopsInsideOfAddOns().click();
        javascriptExecutor.executeScript("document.getElementsByName('addons[]')[2].click()");
        javascriptExecutor.executeScript("document.getElementsByName('addon_options[]')[2].click()");
        //toggleClick(sm_stores_storePage.getAddOn3ToggleBtn());
        javascriptExecutor.executeScript("document.getElementsByName('addons[]')[3].click()");
        waitForThisTobeClickable(sm_stores_storePage.getLogoSubmitBtn());
        sm_stores_storePage.getLogoSubmitBtn();
        Thread.sleep(2000);
        waitForThisTobeClickable(sm_stores_storePage.getStoreSubmitBtn());
        sm_stores_storePage.getStoreSubmitBtn().click();
        Thread.sleep(2000);



    }
}
