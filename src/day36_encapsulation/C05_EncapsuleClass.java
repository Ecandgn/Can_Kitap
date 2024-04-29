package day36_encapsulation;

public class C05_EncapsuleClass {
    /*
   1-  satiş elemanlari satiş tutarına atama yapabilsin
    bu atanan satişlar otomatik olarak toplam satırına eklensin
    ama satış tutarına son atama değeri satış görevlileri görmesin
    2- toplam satış tutarı olarak hesaplanan değer
    herkes tarafından görülebilsin
    ama kimse toplam satış değerine değer atayamasın
   */


    private int satisTutari; // setter
    private int toplamSatisMiktari; // getter

    private int enCapsuleSayi; // hem getter hem setter
    public int publicSayi;

      /*
        Encapsulation bir mecburiyet degil,
        bize yardimci olmak icin Java'nin hazirladigi bir yontemdir

        EGER bir class uyesi icin READ ve WRITE yetkilerini ayirmak isterseniz
        ENCAPSULATION kullanabilirsiniz

        1- Adindan da anlasilacagi gibi
           once bu yetkileri ayirmak istedigimiz variable'lara
           normal yollarla erisimi ENGELLEMELISINIZ

        2- Sadece deger atamasi(WRITE) yapilmasini istedigimiz
           variable'lar icin SETTER
           Sadece gorunmesini (READ) istedigimiz
           variable'lar icin ise GETTER
           method'lari olusturalim
     */


    public int getToplamSatisMiktari() {
        return toplamSatisMiktari;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisMiktari += satisTutari;
    }

    public int getEnCapsuleSayi() {
        return enCapsuleSayi;
    }

    public void setEnCapsuleSayi(int enCapsuleSayi) {
        this.enCapsuleSayi = enCapsuleSayi;
    }
}
