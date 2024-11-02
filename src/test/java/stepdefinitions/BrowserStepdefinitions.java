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


    @Given("dil olarak turkce secilir")
    public void dil_olarak_turkce_secilir() {
    obiletPage.hamburgerMenu.click();
    }
    @Given("para birimi olarak tl secilir")
    public void para_birimi_olarak_tl_secilir() {

    }
    @Given("otobus bileti bul a tiklanir")
    public void otobus_bileti_bul_a_tiklanir() {

    }
    @Given("gelen bilet fiyatlarinin tl oldugu dogrulanir")
    public void gelen_bilet_fiyatlarinin_tl_oldugu_dogrulanir() {

    }
}
