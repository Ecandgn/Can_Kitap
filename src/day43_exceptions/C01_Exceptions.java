package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {
        /*
            java kodlari calistirirken
            bir sorunla karsilastiginda
            ONCELIKLE kod yazarinin bu sorunu ongorup, cozum yolu gosterip gostermedigini kontrol eder
              - eger cozum yolu gosterilmisse,
                o cozumu gerleslestirir (handle eder) ve NORMAL calismasina devam eder
              - eger cozum yolu gosterilmemisse
                kodun calismasini o satir itibariyle durdurur
                hatanin bulundugu satiri, hatanin cinsini ve sebebini bize rapor eder

            Iyi bir kod yazarinin
            exception olusma olasiliklarini iyi tespit edip
            java'ya tum olasi exception durumlarinda
            ne yapmasi gerektigini soyler
         */
        // kullanıcıdan iki tam sayı alıp

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 2 tam sayi giriniz");

        int sayi1 = 0;
        int sayi2 = 0;
        boolean hatavarmi = false;
        try {
            sayi1 = scan.nextInt();
            sayi2 = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("sana tam sayı yaz dedik:)");
            hatavarmi=true;


        }
// bu iki sayiyi birbirine böldürüp sonucu yazdırın
        if (hatavarmi) {
            System.out.println("Hataları düzeltip sonra tekrar dene");

        } else if (sayi2 == 0) {
            System.out.println("Bölünecek sayi 0 olamaz");
        } else {
            System.out.println("Sayiların bölümü : " + sayi1 / sayi2);
        }
    }
}
