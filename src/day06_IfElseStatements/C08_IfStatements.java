package day06_IfElseStatements;

import java.util.Scanner;

public class C08_IfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen eskenar ise
            “Eskenar ucgen” yazdirin,
            degilse “Eşkenar Üçgen Değil” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir üçgenin kenar uzunluklarını girin");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        if (kenar1 == kenar2 && kenar2 == kenar3 && kenar2 > 0) {
            System.out.println("Eşkenar Üçgen");
        } else {
            System.out.println("Eşkenar Üçgen Değil");
        }


    }
}
