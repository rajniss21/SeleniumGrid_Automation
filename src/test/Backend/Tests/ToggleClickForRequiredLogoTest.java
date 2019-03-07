package test.Backend.Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import test.Backend.Elements.DashboardPage;
import test.Backend.Elements.SM_Stores_StorePage;

/**
 * Created By Rajnish on Dec, 2018
 */
public class ToggleClickForRequiredLogoTest extends Setup{

    @Test
    public void toggleClickOnRequiredAddOnLogoTest() throws InterruptedException{

        JavascriptExecutor jse =(JavascriptExecutor)myWebDriver;
        DashboardPage dashboardPageObj = new DashboardPage(myWebDriver);
        SM_Stores_StorePage sm_stores_storePage = new SM_Stores_StorePage(myWebDriver);

        loginTotheModule();
        waitForThisTobeClickable(dashboardPageObj.getStoreMainMenu());
        dashboardPageObj.getStoreMainMenu().click();
        waitForThisTobeClickable(sm_stores_storePage.getStoresSubMenu());
        sm_stores_storePage.getStoresSubMenu().click();
        waitForThisTobeClickable(sm_stores_storePage.getStoreScrum());
        sm_stores_storePage.getStoreScrum().click();
        waitForThisTobeClickable(sm_stores_storePage.getLogosTab());
        sm_stores_storePage.getLogosTab().click();
        scrollUp();
        waitForThisTobeClickable(sm_stores_storePage.getEditStoreBtn());
        sm_stores_storePage.getEditStoreBtn().click();
        scrollUp();
        jse.executeScript("document.getElementsByClassName('close')[2].click()");
       // waitForThisTobeClickable(sm_stores_storePage.clickPrimaryLogoEditPencil());
       // sm_stores_storePage.clickPrimaryLogoEditPencil().click();
        waitForThisTobeClickable(sm_stores_storePage.getAddOnsTab());
        sm_stores_storePage.getAddOnsTab().click();
        jse.executeScript("document.getElementsByName('addon_options[]')[0].click()");
        waitForThisTobeClickable(sm_stores_storePage.getLogoSubmitBtn());
        sm_stores_storePage.getLogoSubmitBtn().click();
        Thread.sleep(2000);
        waitForThisTobeClickable(sm_stores_storePage.getStoreSubmitBtn());
        sm_stores_storePage.getStoreSubmitBtn().click();
        Thread.sleep(2000);
    }
}
