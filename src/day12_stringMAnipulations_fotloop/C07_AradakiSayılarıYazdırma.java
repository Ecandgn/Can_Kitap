package day12_stringMAnipulations_fotloop;

import java.util.Scanner;

public class C07_AradakiSayılarıYazdırma {
    public static void main(String[] args) {
        /*
        kullanıcıdan başlangıç ve bitiş değerini alıp sınırlar dahilinde
        başlangıçtan bitiş değerine kadar 7 ile bölünebilem sayıları yazdırın
        bitiş değeri başlangıçtan uzak ise hata mesajı yazın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen başlangıç değerini giriniz...");
        int başlangic = scan.nextInt();
        System.out.println("Lütfen bitiş değerini girininz...");
        int bitis = scan.nextInt();

        if (bitis < başlangic) {
            System.out.println("Başlanıgıç değeri bitiş değerinden Küçük olamaz");
        } else {
            for (int i = başlangic; i <= bitis; i++) {
                if (i % 7 == 0) {
                    System.out.println(i + " ");
                }
            }
        }


    }
}
