package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C11_NestedForLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan satır sayısı alıp aşağıdaki şekli oluşturun
        1
        12
        123
        1234
        12345
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Satır Sayısını Giriniz...");
        int satir = scan.nextInt();
        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }

    }
}
