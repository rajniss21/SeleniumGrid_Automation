package test.Backend.Tests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import test.Backend.Elements.LoginPage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class Setup {
    public String browser;
    public String nodeURL;
    public String hubURL;
    public WebDriver myWebDriver;
    public String MYURL;
    public String loginEmail;
    public String loginPassword;
    public String driver_selection;
    public Properties propertiesObject = new Properties();

    Logger myLogger_setup = Logger.getLogger("Setup");

    @BeforeSuite

    public void baseSetup() throws IOException {

        PropertyConfigurator.configure("src/log4j.properties");
        myLogger_setup.info("Running the baseSetup, laying the ground work properly");
        checkOS();
    }

    public void checkOS() throws IOException {

        FileWriter setUpPropertiesfile = new FileWriter("src/myWebDriver-select.properties");

        String OperatingSystem = System.getProperty("os.name");

        myLogger_setup.info("Running tests on " + OperatingSystem + " system. Now setting the correct Driver.");

        if (OperatingSystem.contains("Linux")) {
            propertiesObject.setProperty("driver_status", "chromedriver");
        } else {
            propertiesObject.setProperty("driver_status", "chromedriver2.40.exe");
        }

        propertiesObject.store(setUpPropertiesfile, null);
        setUpPropertiesfile.close();

    }

    public void readConstantsValues() throws IOException {

        FileReader readMyConfig = new FileReader("src/config.properties");

        propertiesObject.load(readMyConfig);
        myLogger_setup.info("Reading the config file now ...");
        MYURL = propertiesObject.getProperty("Main_URL");
        loginEmail = propertiesObject.getProperty("login_email");
        loginPassword = propertiesObject.getProperty("login_password");
        /*hubURL = propertiesObject.getProperty("hub_URL");
        nodeURL = propertiesObject.getProperty("node_URL");*/

        readMyConfig.close();

        FileReader readDriverSelect = new FileReader("src/myWebDriver-select.properties");
        propertiesObject.load(readDriverSelect);
        driver_selection = propertiesObject.getProperty("driver_status");
        readDriverSelect.close();

    }

    @BeforeMethod
    @Parameters({"browserName"})
    public void setup(String browserName) throws IOException {

        RemoteWebDriver remoteWebDriver = null;

        if (browserName.equals("chrome")) {
            DesiredCapabilities capabilities = new DesiredCapabilities().chrome();
            capabilities.setBrowserName("chrome");
            capabilities.setPlatform(Platform.WINDOWS);
            remoteWebDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        } else if (browserName.equals("firefox")) {
            DesiredCapabilities capabilities = new DesiredCapabilities().firefox();
            capabilities.setBrowserName("firefox");
            capabilities.setPlatform(Platform.WINDOWS);
            remoteWebDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        }






    }







        /*readConstantsValues();
        myLogger_setup.info("Creating instance for the test");
        *//*DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.WINDOWS);*//*
        URL url = new URL("http://localhost:4444/wd/hub");
        myWebDriver = new RemoteWebDriver(url, capabilities);
        //System.setProperty("webdriver.chrome.myWebDriver", "./WebDrivers/" + driver_selection);
        ChromeOptions options = new ChromeOptions();
        options.merge(capabilities);
        options.addArguments("disable-infobars");
        // myWebDriver = new ChromeDriver(options);
        myLogger_setup.info("Driver Defined");
        myWebDriver.manage().window().maximize();
        myLogger_setup.info("Window maximized, now getting the URL");
        myWebDriver.get("http://" + MYURL);
        myLogger_setup.info("Login-page opened successfully");
    }*/





    @AfterMethod
    public void teardown() {
        myLogger_setup.info("All test completed, quitting the myWebDriver ...");
        myWebDriver.quit();
    }
    public void loginTotheModule() throws InterruptedException {
        LoginPage loginPageobj = new LoginPage(myWebDriver);
        Thread.sleep(5000);
        loginPageobj.setEmailInput(loginEmail);
        loginPageobj.setPasswrdInput(loginPassword);
       /* *//**
         * PHP DEBUGGER CHECK
         *//*
        Thread.sleep(1000);
        waitfor(loginPageobj.getPhpDebuggerCloseBtn());
        loginPageobj.getPhpDebuggerCloseBtn().click();
        *//**
         * PHP DEBUGGER CHECK
         */
        myLogger_setup.info("Email and Password entered");
        loginPageobj.clickLoginBtn();
    }
    public void waitfor(WebElement elementToWait) {
        WebDriverWait waitforoption = new WebDriverWait(myWebDriver, 10);
        waitforoption.until(ExpectedConditions.visibilityOf(elementToWait));
    }
    public void waitForThisTobeClickable(WebElement elementTowait) {
        WebDriverWait waitForOption = new WebDriverWait(myWebDriver, 10);
        waitForOption.until(ExpectedConditions.elementToBeClickable(elementTowait));
    }

    public void scrollUp(){
        JavascriptExecutor jse = (JavascriptExecutor) myWebDriver;
        jse.executeScript("window.scrollBy(0,400)", "Scrolling Up");
    }
    public void toggleClick(WebElement elementToToggle) {
        Actions forToggleAction = new Actions(myWebDriver);
        forToggleAction.moveToElement(elementToToggle).perform();
        forToggleAction.click().build().perform();
    }



}
