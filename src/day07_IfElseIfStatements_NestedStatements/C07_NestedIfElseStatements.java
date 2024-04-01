package day07_IfElseIfStatements_NestedStatements;

import java.util.Scanner;

public class C07_NestedIfElseStatements {
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

        if (cinsiyet == 'E') {
            if (yas < 20 || yas > 90) System.out.println("Geçersiz Yaş");
            else if (yas >= 65) {
                System.out.println("Emekli olabilir");

            } else System.out.println("Emekli olması için daha " + (65 - yas)+"yıl daha çalımalısın");
        } else if (cinsiyet == 'K') {
            if (yas < 20 || yas > 90) System.out.println("Geçersiz Yaş");
            else if (yas >= 60) {
                System.out.println("Kadın Emekli olabilir");

            } else System.out.println("Emekli olması için daha " + (60 - yas)+"yıl daha çalımalısın");

        } else {
            System.out.println("Cinsiyet için K veya E girilmeli");
        }
    }
}
