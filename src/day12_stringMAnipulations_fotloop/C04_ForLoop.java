package day12_stringMAnipulations_fotloop;

public class C04_ForLoop {
    public static void main(String[] args) {
        /*
        34 den başlayop 3 er 3er artarak 100 e kadar sayıları yazdırın.
        */
        for (int i = 34; i <= 100; i += 3) {
            System.out.print(i+ " ");
        }
        System.out.println();

        /*
        iki basamaklı sayılardan 7 ile bölünebilenleri yazdırın
         */

        for (int i = 10; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }

        }
    }
}
