package day06_IfElseStatements;

import java.util.Scanner;

public class C11_IfElseStatements {
    public static void main(String[] args) {
         /*
         Kullanıcıdan bir sayı isteyiniz
         sayı 100 den küçük ise "tebrikler kazandınız" yazdırın
         sayı 100!den küçük değilse
         "Malesef bu defa olmadı" yazdırın
          */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir sayı Girin...");
        double sayi = scan.nextDouble();

        if (sayi < 100) {
            System.out.println("tebrikler kazandınız");
        } else {
            System.out.println("Malasef bu sefer olmadı");
        }
// İf badisi ilk noktalı virgüle kadar alır

    }
}
