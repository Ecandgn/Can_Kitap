package day02_variable_scanner;

import java.util.Scanner;

public class C03_Scanner_SayininKaresiniAlma {
    public static void main(String[] args) {
        //Kullanıcıdan bir tam sayı isteyip karesini yazdırma
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Tam Sayı Giriniz :");
        int girilensayi = scan.nextInt();
        int karesi = girilensayi * girilensayi;
        System.out.println("Girilen Sayının Karesi :" + girilensayi * girilensayi);

        // System.out.println("Girilen Sayının Karesi :" + karesi);


    }
}
