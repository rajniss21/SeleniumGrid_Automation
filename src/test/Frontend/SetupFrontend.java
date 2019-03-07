package test.Frontend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import test.Frontend.Elements.LandingPage;


public class SetupFrontend {

   public WebDriver myWebDriver;
   public WebDriverWait wait;

   @BeforeClass
    public void setup() throws InterruptedException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.myWebDriver", "WebDrivers/chromedriver2.40.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        myWebDriver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(myWebDriver,10);
        myWebDriver.manage().window().maximize();
        frontendAccess();
    }

    @AfterClass
    public void clickSubmitBtnAndTeardown() throws InterruptedException{
        LandingPage landingPageObj = new LandingPage(myWebDriver);
        landingPageObj.getCouponValue().sendKeys("1");
        landingPageObj.getBillingCode().sendKeys("123");
        landingPageObj.clickSubmitBtn();
        Thread.sleep(2000);
        myWebDriver.quit();
    }

    public void frontendAccess() throws InterruptedException{
        myWebDriver.get("https://arkham.dc.qa.yurstore.net/");
        LandingPage landingPageObj = new LandingPage(myWebDriver);
        waitFor(landingPageObj.getPhpDebuggerCloseBtn());
        landingPageObj.getPhpDebuggerCloseBtn().click();
        Thread.sleep(2000);
        landingPageObj.clickSignIn_SignOutBtn();
        Thread.sleep(5000);
        landingPageObj.getEmailAddressInput().sendKeys("rajnish.pradhan@ekbana.net");
        landingPageObj.getPasswordInput().sendKeys( "ironmansucks");
        Thread.sleep(2000);
        landingPageObj.clickSignInBtn();
        Thread.sleep(2000);
        landingPageObj.clickStoreCoupons();
        Thread.sleep(1000);
        landingPageObj.clickAddCouponsBtn();
        Thread.sleep(1000);
        landingPageObj.clickEmailRadioBtn();
    }

    public void waitFor(WebElement elementToWait) {
        WebDriverWait waitforoption = new WebDriverWait(myWebDriver, 10);
        waitforoption.until(ExpectedConditions.visibilityOf(elementToWait));
    }




}
