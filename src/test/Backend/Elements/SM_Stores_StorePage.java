package test.Backend.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created By Rajnish on Dec, 2018
 */
public class SM_Stores_StorePage {


    public SM_Stores_StorePage(WebDriver pWebDriver){
        PageFactory.initElements(pWebDriver, this);
    }

    @FindBy(id = "stores-stores")
    WebElement storesSubMenu;

    @FindBy(xpath = ".//td[@id='store-dc']")
    WebElement storeDC;

    @FindBy(id = "store-scrum")
    WebElement storeScrum;

    @FindBy(xpath = ".//a[@href='#logos']")
    WebElement logosTab;

    @FindBy(id = "btn-edit")
    WebElement editStoreBtn;

    @FindBy(id = "add-logo")
    WebElement addLogoBtn;

    @FindBy(id = "btn-submit")
    WebElement storeSubmitBtn;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/table/tbody/tr[9]/td[3]/a")
    WebElement storeURL;

    @FindBy(xpath = ".//span[@class='glyphicon glyphicon-pencil edit-logo pull-right close' and @data-id='1874']")
    WebElement primaryLogoEditPencil;

    @FindBy(id = "create-company-btn")
    WebElement createComanyBtn;

    @FindBy(id = "company_name")
    WebElement companyName;

    @FindBy(id = "company_url")
    WebElement companyUrl;

    @FindBy(id = "company_logo")
    WebElement companyLogoUpload;

    @FindBy(id = "btn-submit")
    WebElement companySubmitBtn;

    @FindBy(id= "scrum-add-store-btn")
    WebElement addStoreBtn;

    @FindBy(id = "division_name")
    WebElement storeTitle;

    @FindBy(xpath = ".//tr[@class='main']//*[contains(text(),'scrum')]")
    WebElement companyScrum;

    @FindBy(id = "btn-edit")
    WebElement companyEditBtn;

    @FindBy(id = "btn-delete")
    WebElement companyDeleteBtn;

    @FindBy(id = "btn-confirm-delete")
    WebElement confirmDeleteBtn;







    /**
     * .......Details tab section........
    */

    @FindBy(id = "logo_title")
    WebElement logoTitle;

    @FindBy(xpath = ".//input[@value='primary']")
    WebElement primaryLogoRadioBtn;

    @FindBy(xpath = ".//input[@value='add_on']")
    WebElement addOnLogoRadioBtn;

    @FindBy(id = "logo_type")
    WebElement logoType;

    @FindBy(id = "logo_price")
    WebElement logoPrice;

    @FindBy(xpath = "min_qty_input")
    WebElement minimumQuantity;

    @FindBy(id = "logo_image")
    WebElement logoImageUpload;


    /**
     * .......End of Details tab section........
     */

    /**
     * .......Addon Logo Section........
     */
    @FindBy(xpath = ".//a[@href='#location']")
    WebElement locationTab;

    @FindBy(xpath = ".//a[@role='button' and @aria-controls='product-addon-collapse-2']")
    WebElement apparelTops;

    //apparel tops locations
    @FindBy(xpath = ".//label[contains(text(),'Left Chest') and input[@value='4']and span[@class='checkmark']]")
    WebElement leftChest;

    @FindBy(xpath = ".//label[contains(text(),'Right Chest') and input[@value='5']and span[@class='checkmark']]")
    WebElement rightChest;

    @FindBy(xpath = ".//label[contains(text(),'Left Sleeve') and input[@value='6']and span[@class='checkmark']]")
    WebElement leftSleeve;

    @FindBy(xpath = ".//label[contains(text(),'Right Sleeve') and input[@value='7']and span[@class='checkmark']]")
    WebElement rightSleeve;

    @FindBy(id = "logo_submit")
    WebElement logoSubmitBtn;

    /**
     * .......End of AddOn Section........
     */

    /**
     * .......Primary Logo Locations Tab........
     */
    @FindBy(xpath = ".//a[@role='button' and @aria-controls='product-primarylogo-collapse-2']")
    WebElement apparelTopsPrimary;

    @FindBy(xpath = ".//div[@class='btn btn-primary btn-xs checkbox']/span[@class='glyphicon glyphicon-ok']")
    WebElement leftChestLogoLoaction;

    @FindBy(xpath = ".//span[@class='glyphicon glyphicon-ok']/../input[@value='5']/../span[@class='glyphicon glyphicon-ok']")
    WebElement rightChestLogoLoaction;

    @FindBy(xpath = ".//span[@class='glyphicon glyphicon-ok']/../input[@value='6']/../span[@class='glyphicon glyphicon-ok']")
    WebElement leftSleeveLogoLocation;

    @FindBy(xpath = ".//span[@class='glyphicon glyphicon-ok']/../input[@value='6']/../span[@class='glyphicon glyphicon-ok']")
    WebElement rightSleeveLogoLocation;

    /**
     * ....... End Of Primary Logo Locations Tab........
     */

    /**
     * .......Primary Logo AddOns Tab........
     */

    @FindBy(xpath = ".//a[@href='#add_ons']")
    WebElement addOnsTab;

    @FindBy(xpath = ".//a[@role='button' and @aria-controls='addon-loc-collapse-2']")
    WebElement apperealTopsInsideOfAddOns;

    @FindBy(xpath = ".//div[@class='common-div ']/div[@class='btn-group']/label[@style='margin-bottom:0px;']/div[@class='btn btn-primary btn-xs checkbox']/span[@class='glyphicon glyphicon-ok']")
    WebElement addOn3;

    @FindBy(xpath = ".//span[@class='material-switch pull-right']/label[@for='1798_addon_options']")
    WebElement addOn3ToggleBtn;

    @FindBy(xpath = ".//span[@class='material-switch pull-right']/label[@for='1799_addon_options']")
    WebElement addOn4ToggleBtn;
    /**
     * .......End of Primary Logo AddOns Tab........
     */


    public WebElement getStoresSubMenu(){
       return storesSubMenu;
    }
    public WebElement getStoreDC(){
        return storeDC;
    }

    public WebElement getLogosTab(){
        return logosTab;
    }

    public WebElement getEditStoreBtn(){
        return editStoreBtn;
    }

    public WebElement getAddLogoBtn(){
        return addLogoBtn;
    }
    public WebElement getStoreSubmitBtn(){
        return storeSubmitBtn;
    }

    public WebElement setLogoTitle(){
        return logoTitle;
    }

    public WebElement getPrimaryLogoRadioBtn(){
        return primaryLogoRadioBtn;
    }

    public WebElement getAddOnLogoRadioBtn(){
        return addOnLogoRadioBtn;
    }

   /* public void selectLogoType(String logoTypeSelectionDropdown){
        Select dropdown = new Select(logoType);
        dropdown.selectByVisibleText(logoTypeSelectionDropdown);
    }

    public void clickOnLogoPrice(){
        logoPrice.clear();
        logoPrice.sendKeys("3.75");
    }*/
   public WebElement getLogoImageUpload(){
       return logoImageUpload;
   }
   public WebElement getLocationTab(){
       return locationTab;
   }
   public WebElement getApparelTops(){
       return apparelTops;
   }
   public WebElement getApparelTopsPrimary(){
       return apparelTopsPrimary;
   }
   public WebElement getLeftChest(){
       return leftChest;
   }
   public WebElement getRightChest(){
       return rightChest;
   }
   public WebElement getLeftSleeve(){
       return leftSleeve;
   }
   public WebElement getRightSleeve(){
       return rightSleeve;
   }
   public WebElement getLogoSubmitBtn(){
       return logoSubmitBtn;
   }
   public WebElement getLeftChestLogoLoaction(){
       return leftChestLogoLoaction;
   }
   public WebElement getRightChestLogoLoaction(){
       return rightChestLogoLoaction;
   }
   public WebElement getLeftSleeveLogoLocation(){
       return leftSleeveLogoLocation;
   }
   public WebElement getRightSleeveLogoLocation(){
       return rightSleeveLogoLocation;
   }
   public WebElement getAddOnsTab(){
       return addOnsTab;
   }
   public WebElement getApparelTopsInsideOfAddOns(){
       return apperealTopsInsideOfAddOns;
   }
   public WebElement getAddOn3(){
       return addOn3;
   }
   /*public void clickAddOn3ToggleBtn(){
       Actions forToggleAction = new Actions(myWebDriver);
       forToggleAction.moveToElement(addOn3ToggleBtn).perform();
       forToggleAction.click().build().perform();
   }*/
   public WebElement getAddOn3ToggleBtn(){
       return addOn3ToggleBtn;
   }
   public WebElement getAddOn4ToggleBtn(){
       return addOn4ToggleBtn;
   }
   public WebElement clickStoreURL(){
       return storeURL;
   }
   public WebElement clickPrimaryLogoEditPencil(){
       return primaryLogoEditPencil;
   }
    public WebElement getCreateCompanyBtn() {
        return createComanyBtn;
    }

    public WebElement setCompanyName() {
        return companyName;
    }
    public WebElement setCompanyUrl(){
        return companyUrl;
    }
    public WebElement setCompanyLogoUpload(){
        return companyLogoUpload;
    }
    public WebElement getCompanySubmitBtn(){
        return companySubmitBtn;
    }
    public WebElement getAddStoreBtn(){
        return addStoreBtn;
    }
    public WebElement setStoreTitle(){
        return storeTitle;
    }
    public WebElement getCreateStoreSubmitBtn(){
        return storeSubmitBtn;
    }
    public WebElement getStoreScrum(){
       return storeScrum;
    }
    public WebElement getCompanyScrum(){
       return companyScrum;
    }
    public WebElement getCompanyEditBtn(){
       return companyEditBtn;
    }
    public WebElement getCompanyDeleteBtn(){
       return companyDeleteBtn;
    }
    public WebElement getConfirmDeleteBtn(){
       return confirmDeleteBtn;
    }

















}
