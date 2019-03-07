package test.Backend.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created By Rajnish on Dec, 2018
 */
public class SM_Products_ProductsPage {

    public SM_Products_ProductsPage(WebDriver pWebDriver){
        PageFactory.initElements(pWebDriver, this);
    }

    @FindBy(id = "products-products")
    WebElement productsSubMenu;

    @FindBy(id = "style")
    WebElement styleSearchInputField;

    @FindBy(xpath = ".//a[@href='https://admin.qa.yurstore.net/products/products/1776']")
    WebElement searchedResult;

    @FindBy(xpath = ".//a[@href='#locations']")
    WebElement productLocationTab;

    @FindBy(id = "btn-edit")
    WebElement productLocationTabEditBtn;

    @FindBy(xpath = ".//a[@data-id='2']")
    WebElement apparelTops;

    @FindBy(xpath = ".//div[@class='btn btn-primary btn-xs checkbox' and input[@value='4']]/span [@class='glyphicon glyphicon-ok']")
    WebElement leftChest;

    @FindBy(id = "btn-submit")
    WebElement productSubmitBtn;






    public WebElement gotoProductsSubMenu(){
        return productsSubMenu;
    }
    public WebElement clickStyleSearchInputField(){
        return styleSearchInputField;
    }
    public WebElement clickSearchedResult(){
        return searchedResult;
    }
    public WebElement gotoProductLocationTab(){
        return productLocationTab;
    }
    public WebElement clickProductLocationTabEditBtn(){
        return productLocationTabEditBtn;
    }
    public WebElement clickApparelTops(){
        return apparelTops;
    }
    public WebElement checkLeftChestRadioBtn(){
        return leftChest;
    }
    public WebElement clickProductSubmitBtn(){
        return productSubmitBtn;
    }


}
