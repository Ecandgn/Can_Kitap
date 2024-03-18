package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Swap {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap). Yazdırın

        Scanner scan =new Scanner(System.in);

        System.out.println("Birinci Sayıyı Girin =");
        double sayi1=scan.nextDouble();

        System.out.println("İkinci Sayıyı Girin =");
        double sayi2= scan.nextDouble();

        double temp=0;
        temp =sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("Sayıların Yeini değiştirilmiş Hali\n"+"İlk Girilen Sayı="+sayi1+"\nİkinci Girilen sayı="+sayi2);
    }
}
