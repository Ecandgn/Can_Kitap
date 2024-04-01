package day09switchStatement_StringManipulasions;

import java.util.Scanner;

public class C01_GunIsmıYazdırma {

    /*
    kullanıcıdan gün numarsı isteyin
    1-pazartesi...7-pazar olacak şekilde
    girilen numaraya karşılık gelen gun ismini yazdırın
    kullanıcı 1-7 arasından sayı girmezse hata mesajı verin
     */
    public static void main(String[] args) {
        System.out.println("Gün ismini yazdırmak için 1-7 arasında bir tamsayı giriniz...");
        Scanner scan = new Scanner(System.in);
        int gunNo = scan.nextInt();
        switch (gunNo) {
            case 1:
                System.out.print("Pazartesi;");
                break;
            case 2:
                System.out.println("Salı;");
                break;
            case 3:
                System.out.println("ÇArşamba;");
                break;
            case 4:
                System.out.println("Perşembe;");
                break;
            case 5:
                System.out.println("Cuma;");
                break;
            case 6:
                System.out.println("Cumartesi;");
                break;
            case 7:
                System.out.println("Pazar;");
                break;
            default:
                System.out.println("Hatalı Giriş");
        }


    }
}