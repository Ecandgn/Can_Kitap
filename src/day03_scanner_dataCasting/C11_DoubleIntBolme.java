package day03_scanner_dataCasting;

import java.util.Scanner;

public class C11_DoubleIntBolme {
    public static void main(String[] args) {
        //Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir Double Tam Sayı Girin=");
        double sayi = scan.nextDouble();
        System.out.println("Bir Tam Sayı Girin=");
        int sayi1 = scan.nextInt();
        int sonuc = (int) (sayi / sayi1);

        System.out.println("Bölme İşleminin Sonucu=\t" + sonuc);

    }
}
