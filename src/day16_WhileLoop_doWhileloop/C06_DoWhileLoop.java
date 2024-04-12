package day16_WhileLoop_doWhileloop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan başlangıç ve bitiş harflerini alıp
        o harfleri ve aralarındaki harfleri yazdırın
        kullanıcı harf dışında bir karakter veya bir metin girerse uyarı verip yeniden harf girmesini isteyin
        kullanıcı harf girene kadar tekrar isteyin
         */
        Scanner scan = new Scanner(System.in);
        char baslangic = 'a';
        String baslangicstr;
        do {
            System.out.println("Başlangıç harfini giriniz...");
            baslangicstr = scan.nextLine();

            if (baslangicstr.length() == 1) {
                baslangic = baslangicstr.charAt(0);
            } else {
                System.out.println("Sadece 1 harf girmelisiniz...");
            }

        } while (baslangicstr.length() !=1);

        System.out.println("Lütfen bitiş harfini giriniz...");
        char bitis = scan.next().charAt(0);

        do {
            System.out.print(baslangic + " ");
            baslangic++;
        } while (bitis >= baslangic);

    }
}
