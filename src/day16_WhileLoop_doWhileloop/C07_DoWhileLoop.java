package day16_WhileLoop_doWhileloop;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir pozitif sayi isteyin, sayının tam kare olup olmadığını
bulunuz, tamkare ise true değilse false yazdırınız.
Ornek : input : 16, output: 4
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz...");
        int sayi = scan.nextInt();

        int karekok = 1;
        boolean takaremi = false;

        while (karekok * karekok <= sayi) {
            if (karekok * karekok == sayi) {
                takaremi = true;
            }
            karekok++;
        }
        System.out.println(takaremi);
    }
}
