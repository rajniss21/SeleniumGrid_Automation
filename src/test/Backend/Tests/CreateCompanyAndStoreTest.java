package test.Backend.Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import test.Backend.Elements.DashboardPage;
import test.Backend.Elements.SM_Stores_StorePage;

import java.io.File;


/**
 * Created By Rajnish on Jan, 2019
 */
public class CreateCompanyAndStoreTest extends Setup{

    @Test
    public void createCompanyAndStoreTest() throws InterruptedException {

        DashboardPage dashboardPageObj = new DashboardPage(myWebDriver);
        SM_Stores_StorePage sm_stores_storePageObj = new SM_Stores_StorePage(myWebDriver);
        File mySVGFile = new File("./LogosAndSvgs/");
        JavascriptExecutor jse =(JavascriptExecutor)myWebDriver;


        loginTotheModule();
        waitForThisTobeClickable(dashboardPageObj.getStoreMainMenu());
        dashboardPageObj.getStoreMainMenu().click();
        waitForThisTobeClickable(sm_stores_storePageObj.getStoresSubMenu());
        sm_stores_storePageObj.getStoresSubMenu().click();
        waitForThisTobeClickable(sm_stores_storePageObj.getCreateCompanyBtn());
        sm_stores_storePageObj.getCreateCompanyBtn().click();
        waitForThisTobeClickable(sm_stores_storePageObj.setCompanyName());
        sm_stores_storePageObj.setCompanyName().sendKeys("scrum");
        waitForThisTobeClickable(sm_stores_storePageObj.setCompanyUrl());
        sm_stores_storePageObj.setCompanyUrl().sendKeys("scrum");
        jse.executeScript("document.getElementById('company-logo').querySelectorAll('#company_logo')[0].classList.remove('hidden')");
        Thread.sleep(2000);
        sm_stores_storePageObj.setCompanyLogoUpload().sendKeys(mySVGFile.getAbsolutePath()+"/_floridalegalrights__arlm_logo__embroidery.svg");
        waitForThisTobeClickable(sm_stores_storePageObj.getCompanySubmitBtn());
        sm_stores_storePageObj.getCompanySubmitBtn().click();
        waitForThisTobeClickable(sm_stores_storePageObj.getAddStoreBtn());
        sm_stores_storePageObj.getAddStoreBtn().click();
        waitForThisTobeClickable(sm_stores_storePageObj.setStoreTitle());
        sm_stores_storePageObj.setStoreTitle().sendKeys("scrum");
        waitForThisTobeClickable(sm_stores_storePageObj.getCreateStoreSubmitBtn());
        sm_stores_storePageObj.getCreateStoreSubmitBtn().click();


    }

}
