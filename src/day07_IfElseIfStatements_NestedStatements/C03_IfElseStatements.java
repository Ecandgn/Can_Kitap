package day07_IfElseIfStatements_NestedStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanıcından bir tam sayı isteyin
        sayı 7 ile bölünüyorsa "7 nin katı"
        sayı 5 ile bölünüyorsa "5 in katı
        her ikisi ile bölünüyorsa "Super Sayı"
        ikisinede bölünemiyorsa "Kötü Sayı" yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir pozitif Sayı Girin...");
        int sayi = scan.nextInt();

        if (sayi % 7 == 0 && sayi % 5 == 0) {
            System.out.println("Süper Sayı");
        } else if (sayi % 7 == 0) {
            System.out.println("7 nin Katı");
        } else if (sayi % 5 == 0) {
            System.out.println("5 in Katı");

        } else {
            System.out.println("Kötü Sayı");
        }
// En gemiş kapsamlı olanı en başa yazmamız gerekir
    }
}
