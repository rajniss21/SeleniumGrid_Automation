package test.Backend.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(WebDriver pWebDriver){
        PageFactory.initElements(pWebDriver, this);
    }
    @FindBy(id = "orders")
    WebElement ordersMainMenu;

    @FindBy(id = "stores")
    WebElement storeMainMenu;

    @FindBy(id = "products")
    WebElement productsMainMenu;

    public void gotoTheOrders(){
        ordersMainMenu.click();
    }
    public WebElement getStoreMainMenu(){
        return storeMainMenu;
    }
    public void gotoProductsMainMenu(){
        productsMainMenu.click();
    }

}
