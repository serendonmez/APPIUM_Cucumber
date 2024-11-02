Feature: O bilet tarayici sitesine tarayici uzerinden gidilerek gorevler yerine getirilir
 @browser
  Scenario: Kullanici o bilet mobil browser tarayicisinda dil ve para birimi degisikligini dogrular

   * Kullanici "https://www.obilet.com/en" sayfasina gider
   * dil olarak turkce secilir
   * para birimi olarak tl secilir
   * otobus bileti bul a tiklanir
   * gelen bilet fiyatlarinin tl oldugu dogrulanir


