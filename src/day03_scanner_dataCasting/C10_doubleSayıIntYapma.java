package day03_scanner_dataCasting;

import java.util.Scanner;

public class C10_doubleSayıIntYapma {
    public static void main(String[] args) {
        //Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("İki Double Sayı Girin=");
        Double sayi1 = scan.nextDouble();
        Double sayi2 = scan.nextDouble();
        int sonuc = (int) (sayi1 / sayi2);

        // int sonuc1 = (int) (sonuc);

        System.out.println("Bölme İşleminin Sonucu=" + sonuc);

    }
}
