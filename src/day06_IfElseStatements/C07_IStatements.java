package day06_IfElseStatements;

import java.util.Scanner;

public class C07_IStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan notunu alin  kullanıcı 0 ile 100 arasında olmayan bir not girerse
        "Geçersiz Not" yazdırın
        0 ile 100 arasında (Sınırlar Dahil) bir not girerse
        "Geçerli Not" yazdırın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Notu Giriniz =");
        double girilennot = scan.nextDouble();

        if (girilennot >= 0 && girilennot <= 100) {
            System.out.println("Geçerli Not");
        }
        if (girilennot < 0 || girilennot > 100) {

            System.out.println("Geçersiz Not");
        }
    }
}
