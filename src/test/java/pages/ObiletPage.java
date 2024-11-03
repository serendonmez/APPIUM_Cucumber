package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserDriver;

public class ObiletPage {

    public ObiletPage() {
        PageFactory.initElements((WebDriver) BrowserDriver.getBrowserDriver(),this);
    }

    @FindBy(xpath = "(//button[@class='sidebar toggle'])[1]")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//*[@title='Language Select']")
    public WebElement languageSelect;

     @FindBy(xpath = "//*[@data-event-label='Currency Select on Menu']")
    public WebElement currencySelect;

     @FindBy(xpath = "//*[@type='submit']")
     public WebElement searchButton;



     public void selectLanguage (String secilecekDil) throws InterruptedException {


         Thread.sleep(1000);
        hamburgerMenu.click();
        languageSelect.click();
       WebElement dil= BrowserDriver.getBrowserDriver().findElementByXPath("(//*[text()='"+secilecekDil+"'])[1]");
       dil.click();
     }

     public void selectCurency(String secilecekParaBirimi) throws InterruptedException {


         Thread.sleep(1000);
         hamburgerMenu.click();
         Thread.sleep(1000);
         currencySelect.click();
        WebElement paraBirimi =BrowserDriver.getBrowserDriver().findElementByXPath("(//*[text()='"+secilecekParaBirimi+" '])[1]");
        paraBirimi.click();
     }

     public void verifyCurrency(String secilenParaBirimi) throws InterruptedException {
         Thread.sleep(6000);

         WebElement secilenBirim= BrowserDriver.getBrowserDriver().findElementByXPath("(//*[text()=' "+secilenParaBirimi+"'])[1]");
         Thread.sleep(1000);
         Assert.assertTrue(secilenBirim.getText().contains("TL"));

     }











}
