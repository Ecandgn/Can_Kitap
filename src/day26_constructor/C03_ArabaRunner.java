package day26_constructor;

public class C03_ArabaRunner {

    public static void main(String[] args) {

        C01_Araba araba1 = new C01_Araba();
        araba1.marka = "BMW";
        araba1.model = "5.20";
        araba1.yil = 2001;
        araba1.fiyat = 4000;
        System.out.println(araba1); //Araba özellikler{marka='BMW', model='5.20', yil=2001, fiyat=4000}

        C01_Araba araba2 = new C01_Araba("Tofas", "Şahin", 1990, 15000);
        System.out.println(araba2);
        C01_Araba araba3 = new C01_Araba("Nissan", "note", 2020, 2000);
        System.out.println(araba3);
        C01_Araba araba4 = new C01_Araba("opel", "corsa", 2010, 4500);
        System.out.println(araba4);

    }

}
