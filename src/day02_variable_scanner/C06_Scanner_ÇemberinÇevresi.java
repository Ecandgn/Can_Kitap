package day02_variable_scanner;

import java.util.Scanner;

public class C06_Scanner_ÇemberinÇevresi {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir çemberin yarıçapını alıp,
        çevresini ve alanını yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Çemberin yarıçapını girin = ");
        double yaricap = scan.nextDouble();
        System.out.println("Çemberin Çevresi =" + ((2 * yaricap)*3.14));
        System.out.println("Çemberin Çevresi =" + ((yaricap*yaricap)*3.14));

    }
}
