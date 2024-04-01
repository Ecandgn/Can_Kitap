package day06_IfElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {
        int a = 180;
        int b = 30;
        /*
        Eğer a b den büyükse " a b'den büyüktür" yazdırın
         */

        if (a > b) {
            System.out.println("a b'den büyüktür");
        }
//b çift ise " bu sayıların çarpımı çift olur"

        if (b % 2 == 0) {
            System.out.println("bu sayıların çarpımı çift olur");
        }
        // a 100 den büyükse "ilk sayı çok büyük " yazdırın

        if (a > 100) {
            System.out.println("İlk sayı çok büyük");
            int c = 10;
            int toplam = a * c;
            System.out.println(toplam);
        }
        //   System.out.println("Burada Toplam ifadesini yazmaz=" + toplam);
// bağımsız If cümleleri bağımsız kodun geriye kalanından bağımsız çalışır


        a = 10;
        b = 20;

        boolean sonuc = a > b; //False
        if (sonuc) {
            System.out.println("a b 'den büyük");
        }
        sonuc = a < 100; // True
        if (sonuc){
            System.out.println("a 100 den küçük");
        }
    sonuc=b>0;  // True
        if (sonuc){
            System.out.println("b 0 dan büyük");
        }
    }

}
