package day14_methodOluşturmaVeKullanma;

import java.util.Scanner;

public class C08_tamBolenleri {
    public static void main(String[] args) {
        /*
        Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
bolenleri yazdıran ve sayisini bulup bize donduren bir method olusturun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir tam sayı girin...");
        int sayi = scan.nextInt();
        System.out.println("Pozitif Tam Sayı Bölenlerinin sayısı; " + bolen(sayi));
    }

    public static int bolen(int sayi1) {
        int tamsayi = 0;
        for (int i = 1; i <= sayi1; i++) {
            if (sayi1 % i == 0) {
                System.out.print(" " + i); // bölenleri methodun içinde yazdırır
                tamsayi += 1;
            }
        }
        System.out.println("");
        return tamsayi;
    }
}
