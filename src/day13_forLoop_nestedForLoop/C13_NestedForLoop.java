package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C13_NestedForLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan satır sayısı alın
      aşağıdaki şekli yazdırın
        *******
        *******
        *******
        *******
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Satır Sayısını Giriniz...");
        int satir = scan.nextInt();


        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
