package day14_methodOluşturmaVeKullanma;

import java.util.Scanner;

public class C05_methodKullanma {
    public static void main(String[] args) {
        // Kullanıcıdan bir metin alın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz...");
        String metin = scan.nextLine();

        // kullanıcını girdiği metni tersden yazdırın
        C03_MethodOlusturma.terstenYazdir(metin);

        //kullanıcını girdiği metni polidrom olup olmadığını true/false şeklinde yazdırın
        System.out.println(C04_Palindrome.isPalidrome(metin));

        //eğer girilen mertin polidrom ise "aferin sana"
        // değilse "bu nasıl metin daha güzel metin girmelisin yazdırın"

        boolean sonuc = C04_Palindrome.isPalidrome(metin);
        System.out.print("");
        if (sonuc) {
            System.out.println("Aferin Sana");
        } else {
            System.out.println("bu nasıl metin daha güzel metin girmelisin");
        }
    }
}
