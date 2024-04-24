package day24_ArrayList_ForEachLoop;

import java.util.Scanner;

public class C06_foreachLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz : ");
        String cumle = scan.nextLine();
        String harf = "";
        while (harf.length() != 1) {
            System.out.println("Lütfen bir harf girin. ");
            harf = scan.nextLine();
        }
        int sayac = 0;
        String[] harfArray = cumle.split("");
        for (String eachHarf : harfArray) {
            if (eachHarf.equalsIgnoreCase(harf)) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println("Harf cümlede kullanılmamış....");
        } else {
            System.out.println("Verilen harf " + harf + "harfi cümlede " + sayac + "defa kullanılmıştır.");
        }

    }
}
