package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DialogContent extends ParentPage{

    public DialogContent(){

        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(xpath = "//input[@placeholder='Kullanıcı Adı']")
    public WebElement username;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//button/span[text()]")
    public WebElement loginButton;

    @FindBy(css = "[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement headText;

    @FindBy(xpath="//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName' ]//input")
    public WebElement shortName;

    @FindBy(tagName = "mat-panel-description")
    public WebElement messageBox;

    public void verifyMessageContainsText(String value){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div/*"),0));
        Assert.assertTrue(this.messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();


    }

    @FindBy(xpath = "//ms-text-field/input[@placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button/div/button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement accandDelButton;


    public void deleteItem(String deleteName){
        mySendKeys(searchInput, deleteName);
        myClick(searchButton);

        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton));
        myClick(deleteButton);
        myClick(accandDelButton);

    }

    @FindBy(xpath = "(//mat-select/div/div/span)[3]")
    public WebElement countrySelect;

    @FindBy(xpath = "//mat-option/span[text()=' Nepal ']")
    public WebElement nePal;

    @FindBy(xpath = "(//ms-edit-button/button/span)[2]")
    public WebElement edit;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priority;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//button")
    public WebElement toggleBar;

    @FindBy(xpath = "(//ms-save-button[@class='ng-star-inserted']//button)[2]")
    public WebElement saveClose;

    @FindBy(xpath = "//mat-chip-grid/div/input")
    public WebElement userType;
    @FindBy(xpath = "//mat-option/span[text()=' Teacher ']")
    public WebElement teacher;

    @FindBy(xpath = "//mat-option/span[text()=' Administrator ']")
    public WebElement administrator;

    @FindBy(xpath = "//mat-option/span[text()=' Student ']")
    public WebElement student;

    public  WebElement getWebElement(String strElementName){
        switch (strElementName){
            case "addButton": return  this.addButton;
            case "nameInput": return  this.nameInput;
            case "codeInput": return  this.codeInput;
            case"saveButton": return  this.saveButton;
            case "integrationCode": return  this.integrationCode;
            case "priority": return  this.priority;
            case "toggleBar": return  this.toggleBar;
            case "saveClose": return  this.saveClose;
            case "country": return this.countrySelect ;
            case "nepal": return  this.nePal;
            case "shortName": return  this.shortName;
            case "userType": return this.userType;
            case "Teacher": return this.teacher;
            case "Administrator": return this.administrator;
            case "Student": return this.student;



        }
        return null;

    }



}
