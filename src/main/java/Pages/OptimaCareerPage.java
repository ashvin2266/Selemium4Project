package Pages;

import Utility.CommonMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class OptimaCareerPage {
    private WebDriver driver;
    @FindBy(xpath = "//ul[@id='top-menu']//a[normalize-space()='Careers']")
    WebElement careersLink;
    @FindBy(id = "logo")
    WebElement logo;
    @FindBy(name = "category")
    WebElement categoriesField;
    @FindBy(name = "type")
    WebElement jobtype;
    @FindBy(name = "location")
    WebElement location;
    @FindBy(xpath = "//div[@class='col-md-3']/button")
    WebElement filterBtn;
    @FindBy(xpath = "//div[@class='panel-heading']")
    WebElement jobTitle;
    @FindBy(xpath = "//button[normalize-space()='Accept']")
    WebElement elementCookies;
    @FindBy(xpath = "//a[@class='et_pb_button et_pb_more_button et_pb_button_one']")
    WebElement viewAllJobsBtn;
    @FindBy(xpath = "(//input[@id='Pos_Find_Results_quicksearch_filter_text'])[1]")
    WebElement searchBarText;
    @FindBy(xpath = "//input[@id='Pos_Find_Results_quicksearch_filter_locationradius']")
    WebElement locationText;
    @FindBy(xpath = "//div [@class='buttonsRight']//input[@id='buttonSubmit_save']")
    WebElement searchBtn;









    public OptimaCareerPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnCareerLink(){
        CommonMethod.clickOnElement(elementCookies);
        CommonMethod.clickOnElement(careersLink);
    }
    public boolean logoIsDisplayed(){

        return logo.isDisplayed();
    }
    public void clickViewAllJobs(){
        CommonMethod.clickOnElement(viewAllJobsBtn);
    }
    public void enterJobTitle(String jobTitle){
        searchBarText.click();
        searchBarText.clear();
        searchBarText.sendKeys(jobTitle);

    }
    public void enterLocation(String Location){
        locationText.click();
        locationText.clear();
        locationText.sendKeys(Location);

    }
    public void clickSearchBTN() throws InterruptedException {
//        searchBtn.click();
//        CommonMethod.waitUntilElementToBeClickable(driver,searchBtn,5);
        searchBtn.click();
    }
    public void selectCategories(String text){

        CommonMethod.selectByVisibleTextFromDropDown(categoriesField,text);

    }
    public void selectJobType(String type){
        CommonMethod.selectByVisibleTextFromDropDown(jobtype,type);
    }
    public void selectLocation(String city){
        CommonMethod.selectByVisibleTextFromDropDown(location,city);
    }
    public void clickOnFilterBtn(){
        filterBtn.click();
    }
    public String getTitleOfPage(){
        return driver.getTitle();
    }
    public int totalJobAvailable(){
      List<WebElement> totalJobElement= driver.findElements(By.xpath("//div[@class='panel-heading']"));
      return totalJobElement.size();
    }
    public void listOfJob(){
        List<WebElement> totalJobElement= driver.findElements(By.xpath("//div[@class='panel-heading']"));
        for (WebElement jobTitle:totalJobElement){
            System.out.println(jobTitle.getText());
        }
    }










}
