package day12_stringMAnipulations_fotloop;

import java.util.Scanner;

public class C08_AradakiSsayılarıYazdırma {
    public static void main(String[] args) {
        /*
       kullanıcıdan başlangıç ve bitiş değerini alıp sınırlar dahilinde
        aralarındaki başlangıçtan bitiş değerine kadar 7 ile bölünebilem sayıları yazdırın
        bitiş değeri başlangıçtan uzak olsa bile bu kod çalışmalıdır
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen başlangıç değerini giriniz...");
        int başlangic = scan.nextInt();
        System.out.println("Lütfen bitiş değerini girininz...");
        int bitis = scan.nextInt();
        if (başlangic < bitis) {
            for (int i = başlangic; i <= bitis; i++) {
                if (i % 9 == 0) {
                    System.out.print(i + " ");

                }
            }
        } else {
            for (int i = başlangic; i >= bitis; i--) {
                if (i % 9 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}