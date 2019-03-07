package test.Backend.Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import test.Backend.Elements.DashboardPage;
import test.Backend.Elements.SM_Products_ProductsPage;

/**
 * Created By Rajnish on Dec, 2018
 */
public class ProductEditTest extends Setup {

    @Test
    public void productEditTest() throws InterruptedException{

        JavascriptExecutor jse =(JavascriptExecutor)myWebDriver;
        DashboardPage dashboardPageObj = new DashboardPage(myWebDriver);
        SM_Products_ProductsPage sm_products_productsPage = new SM_Products_ProductsPage(myWebDriver);

        loginTotheModule();
        dashboardPageObj.gotoProductsMainMenu();
        waitForThisTobeClickable(sm_products_productsPage.gotoProductsSubMenu());
        sm_products_productsPage.gotoProductsSubMenu().click();
        waitForThisTobeClickable(sm_products_productsPage.clickStyleSearchInputField());
        sm_products_productsPage.clickStyleSearchInputField().sendKeys("OE335", Keys.ENTER);
        waitForThisTobeClickable(sm_products_productsPage.clickSearchedResult());
        sm_products_productsPage.clickSearchedResult().click();
        waitForThisTobeClickable(sm_products_productsPage.gotoProductLocationTab());
        sm_products_productsPage.gotoProductLocationTab().click();
        waitForThisTobeClickable(sm_products_productsPage.clickProductLocationTabEditBtn());
        sm_products_productsPage.clickProductLocationTabEditBtn().click();
        waitForThisTobeClickable(sm_products_productsPage.clickApparelTops());
        sm_products_productsPage.clickApparelTops().click();
        Thread.sleep(3000);
        jse.executeScript("document.getElementById('location4').click()");
        Thread.sleep(3000);
        jse.executeScript("document.getElementById('location5').click()");
        jse.executeScript("document.getElementById('location7').click()");
        waitForThisTobeClickable(sm_products_productsPage.clickProductSubmitBtn());
        sm_products_productsPage.clickProductSubmitBtn().click();
        Thread.sleep(2000);






    }
}
