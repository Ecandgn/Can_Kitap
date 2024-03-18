package day02_variable_scanner;

import java.util.Scanner;

public class C05_Scanner_DikdörtgenAlanıHesaplama {
    public static void main(String[] args) {
        //Kullanıcıdan bir dikdörtgenin 2 kenar uzunluğunu alıp
        // dikdörtgenin alanını yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdörtgenin Kenar uzunluklarını Girin = ");
        Double kenar1 = scan.nextDouble();
        Double kenar2 = scan.nextDouble();
        double alan = kenar1 * kenar2;
        System.out.println("Dikdörtgenin alanı=" + alan);


    }
}
