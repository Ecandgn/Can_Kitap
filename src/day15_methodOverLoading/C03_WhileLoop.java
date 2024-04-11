package day15_methodOverLoading;

public class C03_WhileLoop {
    public static void main(String[] args) {
        /*
        1 den 10 na kadar olan sayılar arasında bir boşluk bırakarak yan yana yazdırın.
         */
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("");
        // aynı soruyu while loop ile yapın
        int sayi=1;
        while (sayi<=10){
            System.out.print(sayi+" ");
            sayi++;
        }

    }
}
