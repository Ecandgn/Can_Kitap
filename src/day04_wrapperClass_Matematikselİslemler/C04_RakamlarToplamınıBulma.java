package day04_wrapperClass_Matematikselİslemler;

import java.util.Scanner;

public class C04_RakamlarToplamınıBulma {
    public static void main(String[] args) {

        //Kullanıcıdan 3 basamaklı bir sayı istenip rakamları basamaklara ayırıp
        // toplamı bulun.

        Scanner scan = new Scanner(System.in);
        System.out.println("3 Basamaklı Bir Sayı Girin = ");
        int sayi = scan.nextInt();

        int birler = sayi % 10;
        System.out.println("Birler Basamağı =" + birler);

        int onlar = (sayi / 10) % 10;
        System.out.println("Onlar Basamağı = " + onlar);

        int yuzler = (sayi / 100) % 10;
        System.out.println("Yüzler Basamağı = " + yuzler);

        int rakamlartoplami = birler + onlar + yuzler;
        System.out.println("Rakamlar Toplamı=" + rakamlartoplami);
    }
}
