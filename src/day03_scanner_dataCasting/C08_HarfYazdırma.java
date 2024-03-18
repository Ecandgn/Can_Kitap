package day03_scanner_dataCasting;

import java.util.Scanner;

public class C08_HarfYazdırma {
    public static void main(String[] args) {
        //Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Harf Girin=");
        char ch = scan.next().charAt(0);
        int deger = ch;
        deger += 1;
        char chr1 = (char) deger;
        System.out.println("1 arttırılmış harf=" + chr1);
        deger += 1;
        char chr2 = (char) deger;
        System.out.println("2 arttırılmış harf=" + chr2);
        deger += 1;
        char chr3 = (char) deger;
        System.out.println("3 arttırılmış harf=" + chr3);

        System.out.println("--------Başka Bir Yöntem İle Yaparsak--------");
        /*
        Karakterler matematiksel işlemlerde ASCII tablosundaki değeri ile lullanılır
         */

        System.out.println("Girilen Karakterin bir sonraki Karakteri :"+(char)(ch+1));
        System.out.println("Girilen Karakterin iki sonraki Karakteri :"+(char)(ch+2));
        System.out.println("Girilen Karakterin üçüncü sonraki Karakteri :"+(char)(ch+3));
    }
}
