package test.Backend.Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import test.Backend.Elements.DashboardPage;
import test.Backend.Elements.SM_Products_ProductsPage;
import test.Backend.Elements.SM_Stores_StorePage;

/**
 * Created By Rajnish on Jan, 2019
 */
public class DeleteCompanyAndCompanyEditTest extends Setup {

    @Test
    public void deleteCompanyAndProductEditTest() throws InterruptedException{

        DashboardPage dashboardPageObj = new DashboardPage(myWebDriver);
        SM_Stores_StorePage sm_stores_storePageObj = new SM_Stores_StorePage(myWebDriver);
        SM_Products_ProductsPage sm_products_productsPageObj = new SM_Products_ProductsPage(myWebDriver);
        JavascriptExecutor jse =(JavascriptExecutor)myWebDriver;


        loginTotheModule();
        waitForThisTobeClickable(dashboardPageObj.getStoreMainMenu());
        dashboardPageObj.getStoreMainMenu().click();
        waitForThisTobeClickable(sm_stores_storePageObj.getStoresSubMenu());
        sm_stores_storePageObj.getStoresSubMenu().click();
        Thread.sleep(2000);
        waitForThisTobeClickable(sm_stores_storePageObj.getCompanyScrum());
        sm_stores_storePageObj.getCompanyScrum().click();
        waitForThisTobeClickable(sm_stores_storePageObj.getCompanyEditBtn());
        sm_stores_storePageObj.getCompanyEditBtn().click();
        waitForThisTobeClickable(sm_stores_storePageObj.getCompanyDeleteBtn());
        sm_stores_storePageObj.getCompanyDeleteBtn().click();
        waitForThisTobeClickable(sm_stores_storePageObj.getConfirmDeleteBtn());
        sm_stores_storePageObj.getConfirmDeleteBtn().click();
        Thread.sleep(3000);
        dashboardPageObj.gotoProductsMainMenu();
        waitForThisTobeClickable(sm_products_productsPageObj.gotoProductsSubMenu());
        sm_products_productsPageObj.gotoProductsSubMenu().click();
        waitForThisTobeClickable(sm_products_productsPageObj.clickStyleSearchInputField());
        sm_products_productsPageObj.clickStyleSearchInputField().sendKeys("OE335", Keys.ENTER);
        waitForThisTobeClickable(sm_products_productsPageObj.clickSearchedResult());
        sm_products_productsPageObj.clickSearchedResult().click();
        waitForThisTobeClickable(sm_products_productsPageObj.gotoProductLocationTab());
        sm_products_productsPageObj.gotoProductLocationTab().click();
        waitForThisTobeClickable(sm_products_productsPageObj.clickProductLocationTabEditBtn());
        sm_products_productsPageObj.clickProductLocationTabEditBtn().click();
        waitForThisTobeClickable(sm_products_productsPageObj.clickApparelTops());
        sm_products_productsPageObj.clickApparelTops().click();
        jse.executeScript("document.getElementById('location4').click()");
        jse.executeScript("document.getElementById('location5').click()");
        jse.executeScript("document.getElementById('location7').click()");
        waitForThisTobeClickable(sm_products_productsPageObj.clickProductSubmitBtn());
        sm_products_productsPageObj.clickProductSubmitBtn().click();
        Thread.sleep(2000);



    }

}
