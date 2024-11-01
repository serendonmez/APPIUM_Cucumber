

Feature: Kullanici aile butcem uygulamasindaki gorevleri yerine getirir
@wip
  Scenario Outline:Kullanici aile butcem uygulamasindaki hesabim bolumundeki degisiklikleri dogrular


    * ilk ekran ayarlamalarini yapin 937 1479 2000 147 1479 ve ardindan login sayfasina "Giriş Yap" a ulasin
    * "mail" ve "password" bilgilerini girerek kullanici bilgileri ile "Giriş Yap" a tiklar
    * uygulmaya kullanici bilgileri ile giris yapildigini dogrulayin
    * sol kisimdaki menuden "Hesabım" bolumune gidildigini dogrulayin
    * Hesabim sayfasindaki bilgileri degistitirerek "<isim>" "<soyisim>" "<sehir>" "<yas>" "<meslek>" degisiklikleri kaydedin ve dogrulayin
    * Kullanici uygulmayi kapatir
  Examples:
   |isim | soyisim| sehir  | yas| meslek|
    |Mathew |Marshall |New York   |26 | Machine operator |
    |Roger  |Hazel    | Amsterdam |30 | Hardware engineer|


