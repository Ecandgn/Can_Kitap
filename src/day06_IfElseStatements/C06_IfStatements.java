package day06_IfElseStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir harf alın
        girilen harf küçük ise "Küçük"
        büyük harf ise "Büyük yazdırın"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Harf Girin =");
        char harf = scan.nextLine().charAt(0);
        if (harf >= 'a' && harf <= 'z') {
            System.out.println("Küçük");
        }
        if (harf >= 'A' && harf <= 'Z') {
            System.out.println("Büyük");
        }
    }
}
