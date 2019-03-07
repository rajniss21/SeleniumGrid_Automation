package test.Frontend.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajnish on Aug, 2018
 */
public class LandingPage {
    public LandingPage(WebDriver pWebdriver){
        PageFactory.initElements(pWebdriver, this);
    }

    /**
     * ..............SignIn Section................
     */
    @FindBy(xpath = ".//button[@title='sign in']")
    WebElement SignIn_SignOutBtn;

    @FindBy(id = "exampleInputEmail1")
    WebElement emailAddressInput;

    @FindBy(id = "exampleInputPassword1")
    WebElement passwordInput;

    @FindBy(xpath = ".//button[text()[contains(.,'Sign In')]]")
    WebElement signInBtn;

    @FindBy(className="phpdebugbar-close-btn")
    WebElement phpDebuggerCloseBtn;

    /**
     * ..............Store Coupons Section................
     */
    @FindBy(xpath = ".//*[text()[contains(.,' Store Coupons')]]")
    WebElement storeCoupons;

    @FindBy(id = "btn-create")
    WebElement addCouponBtn;

    @FindBy(id = "type_email")
    WebElement emailRadioBtn;

    @FindBy(id = "add-recipients")
    WebElement addRecipientBtn;

    @FindBy(xpath = ".//input[@placeholder='Add Recipient Email']")
    List<WebElement> recipientEmail=new ArrayList<>();

    @FindBy(id = "coupon_value")
    WebElement couponValue;

    @FindBy(id = "billing_code")
    WebElement billingCode;

    @FindBy(id = "btn-submit")
    WebElement submitBtn;

    @FindBy(id = "logo-header")
    WebElement LogosText;

    @FindBy(xpath = ".//h4[contains(text(),'Product Color')]")
    WebElement productColorsHeader;

    @FindBy(xpath =".//span[@class='more-addon-logos']")
    WebElement addOnlogoTextHeader;


    public void clickSignIn_SignOutBtn(){
        SignIn_SignOutBtn.click();
    }

    public WebElement getEmailAddressInput() {
        return emailAddressInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }
    public void clickSignInBtn(){
        signInBtn.click();
    }

    public WebElement getPhpDebuggerCloseBtn(){
        return phpDebuggerCloseBtn;
    }

    public void clickStoreCoupons(){
        storeCoupons.click();
    }
    public void clickAddCouponsBtn(){
        addCouponBtn.click();
    }
    public void clickEmailRadioBtn(){
        emailRadioBtn.click();
    }
    public void clickAddRecipientBtn(){
        addRecipientBtn.click();
    }

    public List<WebElement> getRecipientEmail() {
        return recipientEmail;
    }

    public WebElement getCouponValue() {
        return couponValue;
    }
    public WebElement getBillingCode(){
        return billingCode;
    }
    public void clickSubmitBtn(){
        submitBtn.click();
    }
    public String getLogoHeaderText(){
        String heading1 = LogosText.getText();
        return heading1;
    }
    public String getProductColorHeaderText(){
        String heading2 = productColorsHeader.getText();
        return heading2;
    }
    public String getAddOnLogoTextHeader(){
        String heading3 = addOnlogoTextHeader.getText();
        return heading3;
    }
}
