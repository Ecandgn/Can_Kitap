package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C02_Faktoriyel {
    public static void main(String[] args) {
        /*
        Kullanicidan 14’den kucuk bir sayi alip, bu sayinin faktoryel degerini
hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("14 den küçük bir sayı girin...");
        int sayi = scan.nextInt();
        int faktoriyel = 1;
        System.out.print(sayi + "!=");
        for (int i = sayi; i >= 1; i--) {

            faktoriyel *= i;
            if (i != 1) {
                System.out.print(i + " * ");
            } else {
                System.out.println(i + " ");
            }

        }
        System.out.println("= " + faktoriyel);

    }
}
