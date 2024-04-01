package day08_ternary_switchStatements;

import java.util.Scanner;

public class C05_Thernary {
    public static void main(String[] args) {
        /*
        Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
kucukse “Maalesef kaldin” yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütffen notunuz Giriniz =");
        double not = scan.nextDouble();
        System.out.println(not >= 50 ? "Sınıfı Geçtin" : "Malesef Kaldın");


    }
}
