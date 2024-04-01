package day06_IfElseStatements;

import java.util.Scanner;

public class C12_IfElseStatements {
    public static void main(String[] args) {

        /*
        Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
olup olmadigini yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Karakter Girin...");
        char karakter = scan.nextLine().charAt(0);

        if (Character.isLowerCase(karakter)) {
            System.out.println("Girilen Karakter Küçük Harf");
        } else
            System.out.println("Girilen Karakter Büyük Harf");

    }
}
