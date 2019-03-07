package test.Backend.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Saman Kapali on 20/03/2017.
 */
public class LoginPage {

    public LoginPage(WebDriver pWebDriver){
           PageFactory.initElements(pWebDriver, this);
    }

    @FindBy(id="email")
    WebElement emailInput;

    @FindBy(id="password")
    WebElement passwrdInput;

    @FindBy(id="login-btn")
    WebElement loginBtn;

    @FindBy(className="phpdebugbar-close-btn")
    WebElement phpDebuggerCloseBtn;

    public WebElement getEmailInput() {
        return emailInput;
    }

    public void setEmailInput(String userEmail) {
        emailInput.sendKeys(userEmail);
    }

    public WebElement getPasswrdInput() {
        return passwrdInput;
    }

    public void setPasswrdInput(String userPassword) {
        passwrdInput.sendKeys(userPassword);
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public WebElement getPhpDebuggerCloseBtn(){
        return phpDebuggerCloseBtn;
    }
}
