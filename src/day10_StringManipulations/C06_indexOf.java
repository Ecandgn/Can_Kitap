package day10_StringManipulations;

import java.util.Scanner;

public class C06_indexOf {
    public static void main(String[] args) {
        String str = "Ali topu at, at Ali at";
       /*
       indexOf metodu hem string hemde Char kabul eder
        */
        System.out.println(str.indexOf("ts")); // -1 // hatalıv ise -1 döner.
        System.out.println(str.indexOf("pu at")); //6
        System.out.println(str.indexOf("Ali", 4)); // 16
        System.out.println(str.indexOf(' ')); //3



        /*
        kullanıcıdan bir metin isteyip girilen metndeki 2. a nın indexi ini yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz... ");
        String metin = scan.nextLine();
        int index = metin.indexOf('a');

        System.out.println(metin.indexOf('a', index + 1));


    }
}
