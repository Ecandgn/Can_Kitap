package day03_scanner_dataCasting;

public class C05_intIleişlem {
    public static void main(String[] args) {
        int sayi1 = 24;
        int sayi2 = 8;
        int sayi3 = 10;
        double db1 = 24;

        //java data türü büyük olana göre işlem yapar

        System.out.println(sayi1 / sayi2);     // 3
        System.out.println(sayi1 / sayi3);     //2
        System.out.println(db1 / sayi2);       //3.0
        System.out.println(db1 / sayi3);       //2.4

        sayi1 = 27;
        sayi2 = 4;
        System.out.println(sayi1 / sayi2);  //6

        double sonuc = sayi1 / sayi2;
        System.out.println(sonuc);      // 6.0

        sonuc = (double) sayi1 / sayi2;
        System.out.println(sonuc);      // 6.75


    }
}
