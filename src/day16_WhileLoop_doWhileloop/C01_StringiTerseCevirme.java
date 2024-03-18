package day16_WhileLoop_doWhileloop;

import java.util.Scanner;

public class C01_StringiTerseCevirme {
    public static void main(String[] args) {
/*
oru 1- Kullanicidan baslangic ve bitis harflerini alip, o harfleri ve
aralarindaki harfleri yazdirin.
 */


        System.out.println("başlangıç harfi girin=");
        Scanner scan = new Scanner(System.in);
        char baslangıc = scan.next().charAt(0);
        System.out.println("Bitiş Harfini Giriniz=");
        char bitis = scan.next().charAt(0);
        do {
            System.out.print(baslangıc + " ");
            baslangıc++;

        } while (baslangıc < bitis);


    }
}
