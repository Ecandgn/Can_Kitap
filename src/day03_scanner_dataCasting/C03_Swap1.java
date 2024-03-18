package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Swap1 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //degerlerini degistirin(swap).

        Scanner scan = new Scanner(System.in);

        System.out.println("Birinci Sayıyı Girin =");
        double sayi1 = scan.nextDouble();

        System.out.println("İkinci Sayıyı Girin =");
        double sayi2 = scan.nextDouble();

        sayi1 = sayi2 + sayi1;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;

        System.out.println("Sayıların Yeini değiştirilmiş Hali\n" + "İlk Girilen Sayı=" + sayi1 + "\nİkinci Girilen sayı=" + sayi2);

    }
}
