package day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı Girin =");
        int a = scan.nextInt();
        if (a % 3 == 0) {
            System.out.println(+a+" \t Seçilen sayı 3 ile tam bölünür");
        }
        if (a % 5 == 0) {
            System.out.println(+a+"\t Seçilen sayı 5 ile tam bölünür");
        }
    }
}
