package day11_StringManipulations;

import java.util.Scanner;

public class C02_Soru {
    public static void main(String[] args) {
        /*
Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
- String aranan metni icermiyor
- Aranan metin String’de sadece 1 kere kullanilmis
- Aranan metin String’de sadece 1’den fazla kullanilmis
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle girim....");
        String cumle = scan.nextLine();

        System.out.println("Lütfen Aradığınız metni girin...");
        String metin = scan.nextLine();

        int ilkindex = cumle.indexOf(metin);
        int lastIndex = cumle.lastIndexOf(metin);

        if (ilkindex == -1) {
            System.out.println("Aradığınız metin cümlede yok");
        } else if (ilkindex == lastIndex) {
            System.out.println("aradığınız metin cümlede sadece 1 kere kullanılmıştır.");
        } else {
            System.out.println("Aradığınız metin cümlede birden fazla kullanılmıştır.");

        }


    }
}
