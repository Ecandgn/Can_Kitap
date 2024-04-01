package day26_constructor;

public class C02_ArabaRunner {
    public static void main(String[] args) {

        C01_Araba araba1=new C01_Araba();
        System.out.println(araba1);


        /*
        marka='Marka belirtilmedi',
        model='Model Belirtilmedi',
        yil=1900,
         fiyat=0
         */
   C01_Araba araba2;

//        System.out.println(araba2.fiyat);

        System.out.println(new C01_Araba().fiyat);
    }
}
