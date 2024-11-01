package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPages {

    public AileButcemPages() {

         PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()),this);
    }



    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    private MobileElement emailBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    private  MobileElement passwordBox;


    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public MobileElement basariliGiris;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    private MobileElement solMenu;

    @FindBy(xpath = "//*[@text='Hesabım']")
    public MobileElement hesabimText;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement isimBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement soyisimBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement sehirBox;



    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement yasimBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement meslegimBox;



    @FindBy(xpath = "//*[@text='Kaydet']")
    public MobileElement kaydetButton;

    @FindBy(xpath = "//*[@text='Değişiklikler başarıyla kaydedildi.']")
    public MobileElement basariliUpdateText;


    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement aciklama;
    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[3]")
    public MobileElement gelirGiderTipi;


    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[6]")
    public MobileElement datePicker;



    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement tutar;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[7]")
    public MobileElement currencyDDM;


    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[4]")
    public MobileElement gelirPeriyoduDDM;

    @FindBy(xpath = "//*[@resource-id='text2']")
    public MobileElement GelirBasariylaEklendiText;

@FindBy(xpath = "//*[@content-desc='Next month']")
public MobileElement nextMonth;





    public void tarihSecmeMethodu(int gidilecekAy, String secilecekGun) throws InterruptedException {


        for (int i = 0; i <gidilecekAy ; i++) {
            nextMonth.click();
            Thread.sleep(1000);
        }
        ReusableMethods.scrollWithUiScrollableAndClick(secilecekGun);
        ReusableMethods.scrollWithUiScrollableAndClick("OK");





    }

    public void profilUpdateClear() {
        isimBox.clear();
        soyisimBox.clear();
        sehirBox.clear();
        yasimBox.clear();
        meslegimBox.clear();

    }

public void profilUpdateMethodu(String isim, String soyisim, String sehir, String yas, String meslek){

        profilUpdateClear();

        isimBox.sendKeys(ConfigReader.getProperty(isim));
        soyisimBox.sendKeys(ConfigReader.getProperty(soyisim));
        sehirBox.sendKeys(ConfigReader.getProperty(sehir));
        yasimBox.sendKeys(ConfigReader.getProperty(yas));
        meslegimBox.sendKeys(ConfigReader.getProperty(meslek));

        kaydetButton.click();

    Assert.assertTrue(basariliUpdateText.isDisplayed());

    Assert.assertEquals(isimBox.getText(), ConfigReader.getProperty(isim));
    Assert.assertEquals(soyisimBox.getText(), ConfigReader.getProperty(soyisim));
    Assert.assertEquals(sehirBox.getText(), ConfigReader.getProperty(sehir) );
    Assert.assertEquals(yasimBox.getText(), ConfigReader.getProperty(yas));
    Assert.assertEquals(meslegimBox.getText(), ConfigReader.getProperty(meslek) );





}





    public void loginMethodu(String mail, String password, String girisYap){

        emailBox.sendKeys(ConfigReader.getProperty(mail));
        passwordBox.sendKeys(ConfigReader.getProperty(password));

        ReusableMethods.scrollWithUiScrollableAndClick(girisYap);




    }


    public void solMenuIcerik(String icerik) throws InterruptedException {
        Thread.sleep(5000);
        solMenu.click();
        Thread.sleep(1000);
        ReusableMethods.scrollWithUiScrollableAndClick( icerik);




    }



    public void ilkEkranAyarlari(int xPress, int yPress, int wait, int xMove, int yMove, String girisYap) throws InterruptedException {

        Driver.getAndroidDriver();

        Thread.sleep(3000);

        for (int i = 0; i < 6; i++) {


            ReusableMethods.ekranKaydirma(xPress, yPress, wait, xMove, yMove);


        }


        ReusableMethods.scrollWithUiScrollableAndClick(girisYap);


    }
}
