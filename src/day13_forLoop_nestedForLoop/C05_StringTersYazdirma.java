package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C05_StringTersYazdirma {
    public static void main(String[] args) {
        /*
        (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin girin...");
        String metin = scan.nextLine();

        for (int i = metin.length() - 1; i >= 0; i--) {
            System.out.print(metin.charAt(i));
        }
    }
}


