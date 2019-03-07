package test.Backend.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MM_OrdersPage {

    public MM_OrdersPage(WebDriver pWebDriver) {
        PageFactory.initElements(pWebDriver, this);
    }

    /*List of sub-menus of Orders main-menu*/

    @FindBy(id = "orders-estimate")
    WebElement estimateSubmenu;

    public WebElement getEstimateSubmenu() {
        return estimateSubmenu;
    }
}
