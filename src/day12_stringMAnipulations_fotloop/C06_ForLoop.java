package day12_stringMAnipulations_fotloop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        /*
        bir kronometre yapın
        kullanıcıdan aldığınız pozitif sayıdan 1'e kadar tüm sayıları yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz...");
        int sayi = scan.nextInt();
        for (int i = sayi; i >= 1; i--) {
            System.out.print(i + " ");
        }

    }
}
