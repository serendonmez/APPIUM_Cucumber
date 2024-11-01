

Feature: Kullanici aile butcem uygulamasindaki gorevleri yerine getirir

  Background: Sisteme giris yapilmasi iicn gereken ortak adimlar
    * ilk ekran ayarlamalarini yapin 937 1479 2000 147 1479 ve ardindan login sayfasina "Giriş Yap" a ulasin
    * "mail" ve "password" bilgilerini girerek kullanici bilgileri ile "Giriş Yap" a tiklar
    * uygulmaya kullanici bilgileri ile giris yapildigini dogrulayin


  Scenario Outline:Kullanici aile butcem uygulamasindaki hesabim bolumundeki degisiklikleri dogrular


    * sol kisimdaki menuden "Hesabım" bolumune gidildigini dogrulayin
    * Hesabim sayfasindaki bilgileri degistitirerek "<isim>" "<soyisim>" "<sehir>" "<yas>" "<meslek>" degisiklikleri kaydedin ve dogrulayin
    * Kullanici uygulmayi kapatir
  Examples:
    |isim |soyisim |sehir |yas |meslek |
    |isim1|soyisim1|sehir1|yas1|meslek1|
    |isim2|soyisim2|sehir2|yas2|meslek2|

  @wip
  Scenario: Aile butcem uygulamasindaki gelir ekleme gorevleri yerine getirilir

  * Anasayfadaki arti butonuna tiklayin
  * "Gelir Ekle" butonuna text uzerinden tiklanir
  * Gelir Ekle sayfasinda aciklama kismina "Ekim ayi Bordrosu" girilir
    * Gelir Ekle sayfasindaki gelir tipi "Düzenli" olarak secilir
    * Gelir Periyodu "Aylık" olarak secilir

  * Gelir Ekle sayfasinadaki Kategori Kategori "Maaş Geliri" secilir
  * Gelir Ekle sayfasinda Tarih belirlemesi ay 2 ve gun secimi "15" yapilir
  * Gelir Ekle sayfasindaki Tutar bilgisi "3000" "EUR" secilir
  * "Kaydet" butonuna text uzerinden tiklanir
  * basariyla eklendigi dogrulanir
  * Kullanici uygulmayi kapatir



