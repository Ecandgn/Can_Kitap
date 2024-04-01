package day12_stringMAnipulations_fotloop;

import java.util.Scanner;

public class C02_SifreKontrol {
    public static void main(String[] args) {
        /*
        Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
basariyla kaydedildi" yazdirin
- ilk harf kucuk harf olmali
- son karakter rakam olmali
- sifre bosluk icermemeli
- uzunlugu en az 10 karakter olmali
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz...");
        String sifre = scan.nextLine();
        int flag = 15;
        /*....*/
        char ilkharf = sifre.charAt(0);
        if (!Character.isLowerCase(ilkharf)) {
            System.out.println("İlk karakter küçük harf olmalı");
            flag = 25;
        }
        char sonharf = sifre.charAt(sifre.length() - 1);
        if (!(sonharf >= '0' && sonharf <= '9')) {
            System.out.println("son karakter rakam olmali");
            flag = 25;
        }
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            flag = 25;

        }
        if (sifre.length() < 10) {
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag = 25;
        }
        if (flag == 15) {
            System.out.println("Şifre Başarılı bir şekilde kaydedildi...");
        } else {
            System.out.println("Lütfen Hataları Düzelterek Yeniden Şifre Giriniz");
        }
    }
}
