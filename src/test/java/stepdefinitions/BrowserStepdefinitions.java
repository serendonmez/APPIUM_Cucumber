package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.ObiletPage;
import utils.BrowserDriver;

public class BrowserStepdefinitions {

    ObiletPage obiletPage=new ObiletPage();

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
        BrowserDriver.getBrowserDriver().get(url);
    }


    @Given("dil olarak {string} secilir")
    public void dil_olarak_turkce_secilir(String secilecekDil) throws InterruptedException {

        obiletPage.selectLanguage(secilecekDil);
    }
    @Given("para birimi olarak {string} secilir")
    public void para_birimi_olarak_tl_secilir(String secilecekParaBirimi) throws InterruptedException {

        obiletPage.selectCurency(secilecekParaBirimi);

    }
    @Given("otobus bileti bul a tiklanir")
    public void otobus_bileti_bul_a_tiklanir() throws InterruptedException {
        Thread.sleep(1000);
        obiletPage.searchButton.click();
    }
    @Given("gelen bilet fiyatlarinin {string} oldugu dogrulanir")
    public void gelen_bilet_fiyatlarinin_tl_oldugu_dogrulanir(String paraBirimi) throws InterruptedException {

        obiletPage.verifyCurrency(paraBirimi);
    }
}
