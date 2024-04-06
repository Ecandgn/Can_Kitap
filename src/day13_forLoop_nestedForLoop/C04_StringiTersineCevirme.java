package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C04_StringiTersineCevirme {
    public static void main(String[] args) {
        /*
        (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
kaydedin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin girin...");
        String metin = scan.nextLine();

        String tersMetin = "";
        for (int i = metin.length()-1; i >= 0; i--) {
            tersMetin += metin.charAt(i);
        }
        System.out.println(tersMetin);
    }
}
