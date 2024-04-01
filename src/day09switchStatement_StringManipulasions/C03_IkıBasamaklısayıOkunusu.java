package day09switchStatement_StringManipulasions;

import java.util.Scanner;

public class C03_IkıBasamaklısayıOkunusu {
    public static void main(String[] args) {
        /*
        Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("İki Basamaklı Bir sayı Girin");
        int sayi = scan.nextInt();
        int birler = sayi % 10;
        sayi = sayi - birler;
        int onlar = sayi / 10;
        switch (onlar) {
            case 0:
                break;
            case 1:
                System.out.print("on");
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("Ottuz");
                break;
            case 4:
                System.out.print("Kırk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmış");
                break;
            case 7:
                System.out.print("Yetmiş");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;
            default:
                System.out.println("İki basamaklı bir sayı girin");

        }
        switch (birler) {
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            case 0:
                break;

        }

    }
}
