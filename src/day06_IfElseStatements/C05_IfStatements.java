package day06_IfElseStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
Kullanici o veya O yazdiginda output Ocak olsun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Harf Girin");
        char harf = scan.nextLine().charAt(0);

        if (harf == 'o' || harf == 'O') {
            System.out.println("Ocak");
        }
        if (harf == 'ş' || harf == 'Ş') {
            System.out.println("Şubat");
        }
        if (harf == 'm' || harf == 'M') {
            System.out.println("Mart veya Mayıs");
        }
        if (harf == 'n' || harf == 'N') {
            System.out.println("Nisan");
        }
        if (harf == 'h' || harf == 'H') {
            System.out.println("Haziran");
        }
        if (harf == 't' || harf == 'T') {
            System.out.println("Temmuz");
        }
        if (harf == 'a' || harf == 'A') {
            System.out.println("Ağustos veya Aralık");
        }
        if (harf == 'e' || harf == 'E') {
            System.out.println("Eylül veya Ekim");
        }
        if (harf == 'k' || harf == 'K') {
            System.out.println("Kasım");
        }

    }
}
