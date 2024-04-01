package day12_stringMAnipulations_fotloop;

import java.util.Scanner;

public class C03_UzunlukKontrol {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir metin giriniz...");
        String metin = scan.nextLine();
        if (metin.length() % 2 == 0) {
            System.out.println(metin.substring(0, metin.length() / 2) + ":)" +
                    metin.substring(metin.length() / 2));
        } else {
            System.out.println(metin.substring(0, metin.length() / 2) + ":(" +
                    metin.substring(metin.length() / 2));
        }

    }
}
