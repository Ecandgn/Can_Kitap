package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C06_AsalSayiKontrolu {
    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
kontrol edin ve sonucu yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bit tamsayı gürün...");
        int sayi = scan.nextInt();
        int flag = 20;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                System.out.println("Verilen sayı" + i +" ye bölünüyor sayı asal sayı değil");
                flag = 10;
break;
                // break komutu loop'u derhal bitirir
            }
        }
        if (flag == 20){
            System.out.println("Sayı asal sayı");
        }

    }
}
