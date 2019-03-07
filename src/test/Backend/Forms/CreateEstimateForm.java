package test.Backend.Forms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateEstimateForm {
    public CreateEstimateForm(WebDriver pWebDriver)  {
        PageFactory.initElements(pWebDriver, this);
    }

    @FindBy(xpath = ".//a[@class='btn add']")
    WebElement createEstimateBtn;

    @FindBy(id = "company_select")
    WebElement selectCompany;


    @FindBy(xpath =".//select[@name='store']//option[@value='585']" )
    WebElement selectStore;

    @FindBy(xpath = ".//input[@name='first_name']")
    WebElement firstName;

    @FindBy(xpath = ".//input[@name='last_name']")
    WebElement lastName;

    @FindBy(xpath = ".//input[@name='email']")
    WebElement email;

    @FindBy(xpath = ".//input[@name='phone']")
    WebElement phone;

    @FindBy(xpath = ".//input[@name='cell']")
    WebElement cell;

    @FindBy(id = "address-location")
    WebElement business;

    @FindBy(id = "address-1")
    WebElement address;

    @FindBy(id = "address-city")
    WebElement city;

    @FindBy(id = "address-state")
    WebElement state;

    @FindBy(id = "address-zip")
    WebElement zipCode;

    @FindBy(xpath = ".//input[@class='btn btn-primary btn-verify pull-right']")
    WebElement verifyBtn;

    @FindBy(xpath = ".//button[@id='select-address']")
    WebElement useThisAddressBtn;

    @FindBy(xpath = ".//a[@id='add-item']")
    WebElement addItemBtn;

    @FindBy(xpath = ".//input[@id='addItem']")
    WebElement addItemInputField;

    @FindBy(xpath = ".//*[text()[contains(.,'Invalid Address')]]")
    WebElement textToVerify;

    @FindBy(xpath = ".//i[@class='fa fa-percent fa-icon']")
    WebElement calculateSalesTax;

    @FindBy(xpath = ".//i[@class='fa fa-truck fa-icon']")
    WebElement calculateShipping;

    @FindBy(xpath = ".//input[@id='btn-submit']")
    WebElement submitBtn;



    public WebElement clickCreateEstimateBtn(){
        return createEstimateBtn;
    }
    public void setSelectCompany(String selectCompanyInput){
        Select dropdown = new Select(selectCompany);
        dropdown.selectByVisibleText(selectCompanyInput);
    }
    public void setSelectStore() {
        selectStore.click();
        // Select dropdown = new Select(selectStore);
        //dropdown.selectByIndex(1);

    }

    public WebElement setFirstName() {
        return firstName;
    }

    public WebElement setLastName() {
        return lastName;
    }

    public WebElement setEmail() {
        return email;
    }

    public WebElement setPhone() {
        return phone;
    }

    public WebElement setCell() {
        return cell;
    }


    public WebElement setBusiness() {
        return business;
    }

    public WebElement setAddress() {
        return address;
    }

    public WebElement setCity() {
        return city;
    }

    public void setState(String stateInput){
        Select dropdown = new Select(state);
        dropdown.selectByVisibleText(stateInput);

    }

    public WebElement setZipCode() {
        return zipCode;
    }
    public WebElement clickVerifyBtn() {
        return verifyBtn;
    }
    public WebElement clickUseThisAddressBtn() {
        return useThisAddressBtn;
    }
    public WebElement clickAddItemBtn(){
        return addItemBtn;
    }

    public WebElement getAddItemInputField() {
        return addItemInputField;
    }

    public WebElement getTextToVerify() {
        return textToVerify;
    }

    public WebElement getCalculateSalesTax() {
        return calculateSalesTax;
    }

    public WebElement getCalculateShipping() {
        return calculateShipping;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }
}
