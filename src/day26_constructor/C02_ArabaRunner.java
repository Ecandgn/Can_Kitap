package day26_constructor;

public class C02_ArabaRunner {
    public static void main(String[] args) {

        C01_Araba araba1 = new C01_Araba();
        System.out.println(araba1);


        /*
        marka='Marka belirtilmedi',
        model='Model Belirtilmedi',
        yil=1900,
         fiyat=0
         */
        C01_Araba araba2;

//        System.out.println(araba2.fiyat);
        // bir constructor çalışmadan objeye ilk değer ataması yapılmadan da kullanılamaz

        System.out.println(new C01_Araba().fiyat); //0
        // esitligin sadece sag tarafi olursa
        // Constructor calistigi icin
        // class'a gidip yeni bir obje olusturup, bize getirir
        // ANCAK getirdigi objeyi kaydetmedigimiz icin
        // O Obje sadece o satir icin VAR OLUR
    }
}
