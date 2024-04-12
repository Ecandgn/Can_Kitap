package day16_WhileLoop_doWhileloop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C03_SayınınRakamlarToplamı {
    public static void main(String[] args) {
        /*
        While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen rakamları toplancak pozitif tamsayıyı giriniz.");
        int sayi = scan.nextInt();

        int ensonrakam = 0;
        int rakamlartoplami = 0;
        int verilensayi=sayi;

        while (verilensayi > 0) {
            ensonrakam = verilensayi % 10;
            rakamlartoplami += ensonrakam;
            verilensayi /= 10;
        }
        System.out.println("Verilen " + sayi + " sayısının rakamlar toplamı : " + rakamlartoplami);
    }


}
