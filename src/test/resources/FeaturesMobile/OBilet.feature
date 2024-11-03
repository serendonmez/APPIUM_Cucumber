Feature: O bilet tarayici sitesine tarayici uzerinden gidilerek gorevler yerine getirilir
 @browser
  Scenario: Kullanici o bilet mobil browser tarayicisinda dil ve para birimi degisikligini dogrular

   * Kullanici "https://www.obilet.com/en" sayfasina gider
   * dil olarak "Türkçe" secilir
   * para birimi olarak "Türk lirası" secilir
   * otobus bileti bul a tiklanir
   * gelen bilet fiyatlarinin "TL" oldugu dogrulanir


