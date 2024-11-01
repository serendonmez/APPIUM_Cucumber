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

     Thread.sleep(2000);
     Assert.assertTrue(aileButcemPages.hesabimText.isDisplayed());



    }
    @Given("Hesabim sayfasindaki bilgileri degistitirerek {string} {string} {string} {string} {string} degisiklikleri kaydedin ve dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistitirerek_degisiklikleri_kaydedin_ve_dogrulayin(String isim, String soyisim, String sehir, String yas, String meslek) throws InterruptedException {

    aileButcemPages.profilUpdateMethodu(isim, soyisim, sehir, yas, meslek);


    }
    @Given("Kullanici uygulmayi kapatir")
    public void kullanici_uygulmayi_kapatir() {

     Driver.quitAppiumDriver();


    }

    @Given("Anasayfadaki arti butonuna tiklayin")
    public void anasayfadaki_arti_butonuna_tiklayin() {
    ReusableMethods.koordinatTiklamaMethodu(538,2023,500);

    }

    @Given("Gelir Ekle sayfasinda aciklama kismina {string} girilir")
    public void gelir_ekle_sayfasinda_aciklama_kismina_ikinci_deger_girilir(String deger) {
     aileButcemPages.aciklama.sendKeys(deger);
    }
    @Given("Gelir Ekle sayfasindaki gelir tipi {string} olarak secilir")
    public void gelir_ekle_sayfasindaki_gelir_tipi_duzenli_olarak_secilir(String gelirTipi) throws InterruptedException {
     Thread.sleep(1000);
    aileButcemPages.gelirGiderTipi.click();
    Thread.sleep(2000);
    ReusableMethods.scrollWithUiScrollableAndClick(gelirTipi);

    }


     @Given("Gelir Periyodu {string} olarak secilir")
     public void gelir_periyodu_olarak_secilir(String maasPeriyodu) throws InterruptedException {
     aileButcemPages.gelirPeriyoduDDM.click();
     Thread.sleep(1000);
     ReusableMethods.scrollWithUiScrollableAndClick(maasPeriyodu);
     }
    @Given("Gelir Ekle sayfasinadaki Kategori Kategori {string} secilir")
    public void gelir_ekle_sayfasinadaki_kategori_kategori_maas_geliri_secilir(String maasiKategorisi) throws InterruptedException {

     ReusableMethods.scrollWithUiScrollableAndClick("Kategori");
     Thread.sleep(1000);
     ReusableMethods.scrollWithUiScrollableAndClick(maasiKategorisi);





    }
    @Given("Gelir Ekle sayfasinda Tarih belirlemesi ay {int} ve gun secimi {string} yapilir")
    public void gelir_ekle_sayfasinda_tarih_belirlemesi_ve_guncel_secimi_yapilir(int gidilecekAy, String secilecekGun) throws InterruptedException {
    aileButcemPages.datePicker.click();
     aileButcemPages.tarihSecmeMethodu(gidilecekAy,secilecekGun);

    }
    @Given("Gelir Ekle sayfasindaki Tutar bilgisi {string} {string} secilir")
    public void gelir_ekle_sayfasindaki_tutar_bilgisi_secilir(String tutar,String tutuarBirimi) throws InterruptedException {
     aileButcemPages.tutar.sendKeys(tutar);
     aileButcemPages.currencyDDM.click();
     Thread.sleep(1000);
     ReusableMethods.scrollWithUiScrollableAndClick(tutuarBirimi);

    }
    @Given("{string} butonuna text uzerinden tiklanir")
    public void butonuna_text_uzerinden_tiklanir(String text) {
    ReusableMethods.scrollWithUiScrollableAndClick(text);
    }
    @Given("basariyla eklendigi dogrulanir")
    public void basariyla_eklendigi_dogrulanir() throws InterruptedException {

     Thread.sleep(2000);
     Assert.assertTrue(aileButcemPages.GelirBasariylaEklendiText.isDisplayed());
    }

}
