package day07_IfElseIfStatements_NestedStatements;

import java.util.Scanner;

public class C05_Emeklilik {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetini Giriniz...");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen Yaşınızı Giriniz...");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("Kadın Emekli Olabilir");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("Emekli olmak için daha " + (60 - yas) + " yıl çalışmalısın");
        } else if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("Erkek Emekli Olabilir");
        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("Emekli olmak için daha " + (65 - yas) + " yıl çalışmalısın");
        }else {
            System.out.println("Girilen bilgiler yanlış, lütfen tekrar deneyin");
        }
    }

}
