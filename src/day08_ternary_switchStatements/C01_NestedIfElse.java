package day08_ternary_switchStatements;

import java.util.Scanner;

public class C01_NestedIfElse {
    public static void main(String[] args) {
         /*
                Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
alirsa %15, yoksa %10 indirim yapin
                 */

        Scanner scam = new Scanner(System.in);
        System.out.println("Aldığınız ürün adetini giriniz...");
        int urunAdedi = scam.nextInt();
        System.out.println("Aldığınız Ürünün indirimsiz fiyatını giriniz...");
        double indirimsizFiyat = scam.nextDouble();

        double toplamFiyat = urunAdedi + indirimsizFiyat;
        System.out.println("Müşteri Kartı var mı? E: Evet, H: Hayır");
        char kartVarMi = scam.next().toUpperCase().charAt(0);

        //Müşteri Kartı Ana değişken olsun

        if (kartVarMi == 'E') {
            if (urunAdedi > 10) {
                System.out.println("%20 indirimli toplam fiyat:" + toplamFiyat * 80 / 100);

            } else if (urunAdedi > 0) {
                System.out.println("%15 indirimli toplam fiyat:" + toplamFiyat * 85 / 100);
            } else {
                System.out.println("ürün sayısı olarak pozitif bir sayı girmelisiniz");
            }
        } else if (kartVarMi == 'H') {
            if (urunAdedi > 10) {
                System.out.println("%15 indirimli toplam fiyat:" + toplamFiyat * 85 / 100);

            } else if (urunAdedi > 0) {
                System.out.println("%10 indirimli toplam fiyat:" + toplamFiyat * 90 / 100);
            } else {
                System.out.println("ürün sayısı olarak pozitif bir sayı girmelisiniz");
            }
        } else {
            System.out.println("Kartınız varmı sorusuna 'E' veya 'H' girmelisiniz...");
        }


    }
}
