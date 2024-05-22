package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_DahaKapsamliTekException {
    public static void main(String[] args) {
        String str = "Java gun geçtikçe guzelleşir ";
        //Kullanıcıdan pozitif bir tam sayı alın
        //ve bu tamsayıyı index olarak kabul edin
        //str da o index deki harfi yazdırın


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz.");

        try {
            int index = scan.nextInt();//  InputMismatchException

            System.out.println(str.charAt(index)); //StringIndexOutOfBoundsException

        } catch (Exception e) { //RunTimeException da olur
            // Exception ve RunTimeException daha kapsamli olduklarindan
            // hem InputMissmatchException'i hem de StringIndexOutOfBounds Exception'i yakalar
            // ama sorunun hangisinden kaynaklandigini bilemeyiz
            System.out.println("girilen deger sonuc yazdirmaya uygun degil");

        }

    }
}
