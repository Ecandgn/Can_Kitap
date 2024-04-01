package day12_stringMAnipulations_fotloop;

public class C05_ForLoop {
    public static void main(String[] args) {
        // iki basamaklı pozitif tamsayıların toplamını yazdırın
        int toplam = 0;

        for (int i = 10; i < 100; i++) {

            toplam += i;
        }
        System.out.println("Toplam=" + toplam);

    /*
    10 ile 50 arasındaki 9 ile bölünebilen sayıların toplayın
     */
        toplam = 0;

        for (int i = 10; i <= 50; i++) {
            if (i % 9 == 0) {
                toplam += i;

            }
        }
        System.out.println("9 ile bölüne bilen sayıların toplamı..." + toplam);
        System.out.println("-----------");
/*
iki basamaklı pozitif ve negatif sayıların toplamını yazdırın
 */
        toplam = 0;
        for (int i = -99; i < 100; i++) {
            if (!(i >= -9 && i < 10)) {
                toplam += i;
            }
        }
        System.out.println("iki basamaklı sayıların toplamı=" + toplam);

    }
}
