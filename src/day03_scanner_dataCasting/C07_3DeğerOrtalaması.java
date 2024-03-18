package day03_scanner_dataCasting;

import java.util.Scanner;

public class C07_3DeğerOrtalaması {
    public static void main(String[] args) {
        // Kullanıcıdan Int olarak alınan 3 degerin ortalamasini double olarak yazdiran bir kod
        //yazin

        Scanner scan = new Scanner(System.in);

        System.out.println("3 tane tam sayı girin=");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();

        // double ortalama = ((double) sayi1 + sayi2 + sayi3) / 3;  //double değeri parantezin içinde veya dışında yazılabilinir
        double ortalama = (double) (sayi1 + sayi2 + sayi3) / 3;

        System.out.println("Girilen 3 tamsayının ortalaması=" + ortalama);

    }
}
