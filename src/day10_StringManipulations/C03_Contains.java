package day10_StringManipulations;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        /*Kullanıcıdan bir metin isteyin
        metin "ev" içeriyorsa "Home Sweet home",
        "is" içerisyorsa "çalışmak çok güzeldir" ,
        ikisinide içeriyorsa "Hayatta DEngeli Olmak Çok Güzel"
        ikisinide içermiyorsa "tembellik güzel değil" yazdıralım
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Metin Giriniz...");
        String metin = scan.nextLine();
        if (metin.contains("is") && metin.contains("ev")) {
            System.out.println("Hayatta Dengeli Olmak Çok Güzel");
        } else if (metin.contains("ev")) {
            System.out.println("Home Sweet Home");

        } else if (metin.contains("is")) {
            System.out.println("Çalışmak Çok Güzeldir");

        }else
            System.out.println("Tembellik güzel değildir.");


    }
}
