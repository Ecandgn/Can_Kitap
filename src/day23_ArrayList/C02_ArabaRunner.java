package day23_ArrayList;

public class C02_ArabaRunner {
    public static void main(String[] args) {

        C01_Araba araba1 = new C01_Araba();

        System.out.println(araba1.marka);
        System.out.println(araba1.model);
        System.out.println(araba1.yil);
        System.out.println(araba1.fiyat);

        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.yil = 2012;
        araba1.fiyat = 8000;

        C01_Araba araba2 = new C01_Araba();
        System.out.println(araba2.marka);
        System.out.println(araba2.model);
        System.out.println(araba2.yil);
        System.out.println(araba2.fiyat);


        C01_Araba araba3 = new C01_Araba();


    }
}
