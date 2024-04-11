package day15_methodOverLoading;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        // kullanıcıdan toplanmak üzere tam sayıları isteyin
        //sayıların toplammı 500 veya daha fazla olursa
        //sayı istemeyi durdurunp tolamı yazdırın

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        while (toplam < 500) {
            System.out.println("Toplamak üzere tam sayıları girin...");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println("Girdiğiniz Sayıların toplamı : "+toplam);
    }
}
