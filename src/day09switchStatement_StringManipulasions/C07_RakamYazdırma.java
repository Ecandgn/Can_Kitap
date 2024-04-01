package day09switchStatement_StringManipulasions;

import java.util.Scanner;

public class C07_RakamYazdırma {
    public static void main(String[] args) {
        /*
        Kullanicidan bir rakam alip, rakami yaziyla yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir sayı Girin...");
        int sayi = scan.nextInt();
        switch (sayi) {
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("Dört");
                break;
            case 5:
                System.out.println("Beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            case 0:
                System.out.println("Sıfır");
                break;
            default:
                System.out.println("Lütfen Rakam Girin");


        }


    }
}
