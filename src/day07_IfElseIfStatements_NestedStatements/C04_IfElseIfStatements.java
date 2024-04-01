package day07_IfElseIfStatements_NestedStatements;

import java.util.Scanner;

public class C04_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
“istediginiz birim sisteme kayitli degil” yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafeyi KM olarak Giriniz...");
        double mesafe = scan.nextDouble();
        System.out.println("Çevirmek istediğiniz birimi girin...Metre--Santimetre");
        String birim = scan.next(); // scan.nextLine() yazılırsa satırı atlamış olabilir

        if (birim.equalsIgnoreCase("metre")) {
            System.out.println("Girilen Mesafe metre olarak:" + mesafe * 1000 + "metredir");

        } else if (birim.equalsIgnoreCase("santimetre")) {
            System.out.println("Girilen Mesafe Santimetre olarak :" + mesafe * 100000 + "santimetre");

        } else {
            System.out.println("İstediğiniz birim sisteme kayıtlı değil");
        }


    }
}
