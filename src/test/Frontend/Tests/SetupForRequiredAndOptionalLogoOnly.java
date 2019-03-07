package test.Frontend.Tests;

import jdk.internal.instrumentation.Logger;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created By Rajnish on Dec, 2018
 */
public class SetupForRequiredAndOptionalLogoOnly {

    public WebDriver myWebDriver;
    public WebDriverWait wait;
    public Logger myLogger_setup;

    @BeforeClass
    public void setup() throws InterruptedException, MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);
        URL url = new URL("http://localhost:4444/wd/hub");
        myWebDriver = new RemoteWebDriver(url, capabilities);
        //System.setProperty("webdriver.chrome.myWebDriver", "./WebDrivers/" + driver_selection);
        ChromeOptions options = new ChromeOptions();
        options.merge(capabilities);
        options.addArguments("disable-infobars");
        // myWebDriver = new ChromeDriver(options);
        myLogger_setup.info("Driver Defined");
        myWebDriver.manage().window().maximize();
    }
    @AfterClass
    public void Teardown() throws InterruptedException {
        myWebDriver.quit();
    }

    public void assertContains(WebElement elementToAssert, String requiredText){
        Assert.assertTrue(elementToAssert.getText().contains(requiredText));
        myLogger_setup.info("Assersion results: \n"+"\tExpected Value: "+requiredText+"\n\t"+"Actual Value: "+elementToAssert.getText());
    }
    public void frontendAccessForRequiredAndOptionalLogoTest(){
        myWebDriver.get("https://scrum.qa.yurstore.net/ogioendurance/OE335");
    }
}
