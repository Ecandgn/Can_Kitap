package day07_IfElseIfStatements_NestedStatements;

import java.util.Scanner;

public class C06_İndirim {
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

        if (kartVarMi == 'E' && urunAdedi > 10) {
            System.out.println("%20 indirimli toplam fiyat:" + toplamFiyat * 80 / 100);

        } else if (kartVarMi == 'E') {
            System.out.println("%15 lik indirimli toplam fiyat:" + toplamFiyat * 85 / 100);

        } else if (kartVarMi == 'H' && urunAdedi > 10) {
            System.out.println("%15 indirimli toplam fiyat :" + toplamFiyat * 85 / 100);

        } else if (kartVarMi == 'H') {
            System.out.println("%10 İndirimli toplam fiyat" + toplamFiyat * 90 / 100);

        } else {
            System.out.println("Bilgileri kontrol edip yeniden deneyiniz");
        }
    }

}
