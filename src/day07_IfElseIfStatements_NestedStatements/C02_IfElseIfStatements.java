package day07_IfElseIfStatements_NestedStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir sayı alın
        sayı 0'dan küçükse "Negatif sayı" yazdırın
        negatif olmayan sayılardan
        tek basamaklı olanlar için "Rakam"
        iki basamaklı olanlar için "Sayı"
        Üç basamaklı olanlar için "Buyuk sayı" yazdırın
         */
        System.out.println("Lütfen bir tamsayı giriniz =");
        Scanner scan = new Scanner(System.in);
        double sayi = scan.nextDouble();
if (sayi<0){
    System.out.println("Negatif Sayı");
} else if (sayi<10) {
    System.out.println("Rakam");

} else if (sayi<100) {
    System.out.println("Sayı");

} else if (sayi<1000) {
    System.out.println("Büyük Sayı");

}

    }
}
