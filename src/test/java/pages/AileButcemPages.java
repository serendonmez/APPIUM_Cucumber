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
    public MobileElement isim;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement soyisim;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement sehir;

    @FindBy(xpath = "(//*[@package='com.ailebutcem'])[25]")
    public MobileElement cinsiyet;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement yasim;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement meslegim;

    @FindBy(xpath = "//*[@text='Erkek']")
    public MobileElement cinsiyetErkek;

    @FindBy(xpath = "//*[@text='Kaydet']")
    public MobileElement kaydetButton;

    @FindBy(xpath = "//*[@text='Değişiklikler başarıyla kaydedildi.']")
    public MobileElement basariliUpdateText;



    public void profilUpdateClear() {
        isim.clear();
        soyisim.clear();
        sehir.clear();
        yasim.clear();
        meslegim.clear();

    }

public void profilUpdateMethodu(String isim1, String soyisim1, String sehir1, String yas1, String meslek1){

        profilUpdateClear();

        isim.sendKeys(isim1);
        soyisim.sendKeys(soyisim1);
        sehir.sendKeys(sehir1);
        yasim.sendKeys(yas1);
        meslegim.sendKeys(meslek1);

        kaydetButton.click();

    Assert.assertTrue(basariliUpdateText.isDisplayed());

    Assert.assertEquals(isim.getText(), isim1);
    Assert.assertEquals(soyisim.getText(), soyisim1);
    Assert.assertEquals(sehir.getText(), sehir1);
    Assert.assertEquals(yasim.getText(), yas1);
    Assert.assertEquals(meslegim.getText(), meslek1);





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
