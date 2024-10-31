package stepdefinitions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPages;
import utils.Driver;
import utils.ReusableMethods;

public class AileButcemStepdefinitions {

   AileButcemPages aileButcemPages=new AileButcemPages();


    @Given("ilk ekran ayarlamalarini yapin {int} {int} {int} {int} {int} ve ardindan login sayfasina {string} a ulasin")
    public void ilk_ekran_ayarlamalarini_yapin_ve_ardindan_login_sayfasina_girisyap_a_ulasin(int x, int y, int wait, int moveX, int moveY, String girisYap) throws InterruptedException {
    aileButcemPages.ilkEkranAyarlari(x,y,wait,moveX, moveY, girisYap);
    Thread.sleep(1000);

    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileri ile {string} a tiklar")
    public void mail_ve_sifre_bilgilerini_girerek_kullanici_bilgileri_ile_giris_yapin(String mail, String sifre, String girisYap) {

     aileButcemPages.loginMethodu(mail, sifre, girisYap);


    }
    @Given("uygulmaya kullanici bilgileri ile giris yapildigini dogrulayin")
    public void uygulmaya_kullanici_bilgileri_ile_giris_yapildigini_dogrulayin() {
     Assert.assertTrue(aileButcemPages.basariliGiris.isDisplayed());

    }
    @Given("sol kisimdaki menuden {string} bolumune gidildigini dogrulayin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidildigini_dogrulayin(String hesabim) throws InterruptedException {
    aileButcemPages.solMenuIcerik(hesabim);
    //


    }
    @Given("Hesabim sayfasindaki bilgileri degistitirerek degisiklikleri kaydedin ve dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistitirerek_degisiklikleri_kaydedin_ve_dogrulayin() throws InterruptedException {
     Thread.sleep(2000);
     Assert.assertTrue(aileButcemPages.hesabimText.isDisplayed());

    }
    @Given("Kullanici uygulmayi kapatir")
    public void kullanici_uygulmayi_kapatir() {

     Driver.quitAppiumDriver();


    }

}
