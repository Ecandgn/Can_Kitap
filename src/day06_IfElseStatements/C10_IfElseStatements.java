package day06_IfElseStatements;

import java.util.Scanner;

public class C10_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
olarak yazdirin, yoksa girilen harfi yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Karakter Girin...");
        char girilenkarakter = scan.nextLine().charAt(0);
        System.out.println(Character.isLowerCase(girilenkarakter)); // (Girilen harfin küçük olduğu kontrol edildi)
        System.out.println(Character.toLowerCase(girilenkarakter)); // Girilen Harfi küçük harf yaptı
        System.out.println(girilenkarakter); // Atama işlemi yapmaz toLowerCase ve toUpperCase
        System.out.println(Character.isUpperCase(girilenkarakter)); // (Girilen Harfin Büyük harf olduğu kontrol edildi)
        System.out.println(Character.toUpperCase(girilenkarakter)); // Girilen harfi büyük harf yaptı


        if (Character.isLowerCase(girilenkarakter)) {
            System.out.println(Character.toUpperCase(girilenkarakter));
        } else
            System.out.println(girilenkarakter);

    }


}

