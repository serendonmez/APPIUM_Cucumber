package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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
