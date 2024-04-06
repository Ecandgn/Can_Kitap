package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C01_faktoriyel {
    public static void main(String[] args) {
        /*
        Kullanicidan 14’den kucuk bir sayi alip, bu sayinin faktoryel degerini
hesaplayin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("14 den küçük bir sayı girin...");
        int sayi = scan.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;


        }
        System.out.println("Girilen sayinin fakyörüyel çarpımı="+"\t"+sonuc);


    }
}
