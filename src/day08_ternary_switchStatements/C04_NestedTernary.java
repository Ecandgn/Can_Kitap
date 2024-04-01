package day08_ternary_switchStatements;

public class C04_NestedTernary {
    public static void main(String[] args) {

        /*
          verilen sayi için aşağıdaki uygun olanalanı yazdırın
          sayı pozitif
          sayı negatif
          0 pazotif veya negatif değil
         */

        int sayi = 0;
        if (sayi > 0) {
            System.out.println("Sayı Pozitif");
        } else if (sayi < 0) {
            System.out.println("Sayı negatif");

        } else {
            System.out.println("0 pozitif ve negatif değildir.");
        }
/*
        System.out.println(sayi > 0 ? "Sayı Pozitif" : "Sayı 0 veya negatif olabilir");
        System.out.println(sayi > 0 ? "Sayı Pozitif" : sayi== 0 ? "0pozitif veya negatif değildir.": "Sayı negatif");
tek satırda da yazılabilinir
*/
    }
}
