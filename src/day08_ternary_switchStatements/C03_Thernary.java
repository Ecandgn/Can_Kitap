package day08_ternary_switchStatements;

import java.util.Scanner;

public class C03_Thernary {
    public static void main(String[] args) {
        /*
        verilen sayı 10 dan büyükse değerini 3 azaltın
        10 dan büyük değilse "Bu sayı çok küçük" yazdırın.
                 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı Girin Lütfen...");
        double sayi = scan.nextDouble();


        if (sayi > 10) {
            sayi -= 3;
        } else
            System.out.println("Bu sayı çok küçük");

       /*
          System.out.println(sayi > 10 ? sayi=sayi - 3 : "Bu sayı çok küçük"); // azaltılan sayı yazırdırmak istendiği için Thernary kullanılmaz.
        */

    }
}
