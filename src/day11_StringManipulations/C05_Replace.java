package day11_StringManipulations;

import java.util.Scanner;

public class C05_Replace {
    public static void main(String[] args) {
        String str = "Java candır";

        System.out.println(str.replace('a', 'A')); //JAvA cAndır
        System.out.println(str.replace("candır", "güzeldir")); //Java güzeldir

        // a'ları yok edin
        System.out.println(str.replace("a", "")); //Jv cndır

        //b leri B yapın
        System.out.println(str.replace('b', 'B'));

        // can yerine Han Yapın
        System.out.println(str.replace("can", "Han")); // Java Handır

        // sadece ilk a yı A yapın
        System.out.println(str.replaceFirst("a", "A")); //JAva candır

        /* kullanıcıdan bir metin isteyin
        ve metinde geçen ilk space'i * yapın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz...");
        String cumle = scan.nextLine();
        System.out.println(cumle.replaceFirst("\\s", "*"));

        /*ilk bulduğu rakamı * yap
         */
        System.out.println(cumle.replaceFirst("\\d", "*"));

    }
}
