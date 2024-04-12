package day16_WhileLoop_doWhileloop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C01_StringiTerseCevirme {
    public static void main(String[] args) {
/*
While loop kullanarak verilen bir String’i terse cevirip, bu halini bize
donduren bir method olusturun.
 */
        System.out.println(metniTerseCevir("Ali Topu Tut"));
        System.out.println(metniTerseCevir("Java Çalışmak Güzel"));

        System.out.println("Bir metin Girin... ");
        Scanner scan=new Scanner(System.in);
        String metin =scan.nextLine();
        System.out.println(metniTerseCevir(metin));
    }
    public static String metniTerseCevir(String metin){
        // Ali Topu Tut
        int index=metin.length()-1;
        String tersMetin="";
        while (index>=0){
            tersMetin +=metin.charAt(index);
            index--;
        }
        return tersMetin;
    }
}
