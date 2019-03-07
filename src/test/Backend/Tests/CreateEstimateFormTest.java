package test.Backend.Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import test.Backend.Elements.DashboardPage;
import test.Backend.Elements.MM_OrdersPage;
import test.Backend.Forms.CreateEstimateForm;

public class CreateEstimateFormTest extends Setup{

    @Test
    public void ordersEstimateTests() throws InterruptedException{
        DashboardPage dashboardPageObj = new DashboardPage(myWebDriver);
        MM_OrdersPage mm_ordersPageObj = new MM_OrdersPage(myWebDriver);
        CreateEstimateForm createEstimateFormObj = new CreateEstimateForm(myWebDriver);
        Actions actions = new Actions(myWebDriver);


        loginTotheModule();
        dashboardPageObj.gotoTheOrders();
        mm_ordersPageObj.getEstimateSubmenu().click();
        createEstimateFormObj.clickCreateEstimateBtn().click();
        Thread.sleep(2000);
        createEstimateFormObj.setSelectCompany("DC");
        Thread.sleep(4000);
        createEstimateFormObj.setSelectStore();
        Thread.sleep(2000);
        createEstimateFormObj.setFirstName().sendKeys("Rajnish");
        createEstimateFormObj.setLastName().sendKeys("Pradhan");
        createEstimateFormObj.setEmail().sendKeys("rajnish.pradhan@ekbana.net");
        createEstimateFormObj.setPhone().sendKeys("9779841000000");
        createEstimateFormObj.setBusiness().sendKeys("Business 3");
        createEstimateFormObj.setAddress().sendKeys("4525 Florida Ave S Suite 2-5");
        createEstimateFormObj.setCity().sendKeys("Lakeland");
        createEstimateFormObj.setState("Florida");
        createEstimateFormObj.setZipCode().sendKeys("33813");
        createEstimateFormObj.clickVerifyBtn().click();
        scrollUp();
        Thread.sleep(2000);
        if (createEstimateFormObj.getTextToVerify().isDisplayed()){
            Thread.sleep(2000);
            createEstimateFormObj.clickUseThisAddressBtn().click();
            Thread.sleep(2000);
        }else{
            createEstimateFormObj.clickAddItemBtn().click();
        }
        Thread.sleep(2000);
        actions.moveToElement(createEstimateFormObj.clickAddItemBtn());
        actions.click();
        Thread.sleep(1000);
        actions.moveToElement(createEstimateFormObj.getAddItemInputField());
        actions.click().sendKeys("4200", Keys.ENTER).build().perform();
        scrollUp();
        Thread.sleep(4000);
        createEstimateFormObj.getCalculateSalesTax().click();
        Thread.sleep(4000);
        createEstimateFormObj.getCalculateShipping().click();
        Thread.sleep(4000);
        createEstimateFormObj.getSubmitBtn().click();
        Thread.sleep(2000);
    }
}
