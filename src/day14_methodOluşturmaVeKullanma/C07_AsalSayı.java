package day14_methodOluşturmaVeKullanma;

import java.util.Scanner;

public class C07_AsalSayı {
    public static void main(String[] args) {
        /*
        Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
sonuclarini donduren bir method olusturun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir tam sayı Girin...");
        int sayi = scan.nextInt();
        System.out.println(asalSayi(sayi));
    }

    public static String asalSayi(int sayi) {
        int bayrak = 5;
        String str = "";
        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                str = "Asal Sayı Değildir...";
                bayrak = 10;
                break;
            }
        }
        if (bayrak == 5) {
            str = "Asal Sayıdır...";
        }
        return str;
    }
}