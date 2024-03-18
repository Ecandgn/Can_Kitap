package day03_scanner_dataCasting;

import java.util.Scanner;

public class C09_ByteCasting {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir Sayı Girin=");
        double sayi=scan.nextDouble();
        byte byt= (byte) sayi;

        System.out.println("Girilen Sayının -128 ile 127 arasindaki bir sayiya donusturup "+byt);

    }
}
