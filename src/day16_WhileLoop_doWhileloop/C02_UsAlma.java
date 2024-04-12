package day16_WhileLoop_doWhileloop;

public class C02_UsAlma {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
olusturun.
         */
   usAl(2,3);
    }

    public static void usAl(int sayi, int pozitifUs) {
        int sanuc = 1;
        int hesaplanacakUs=pozitifUs;
        while (pozitifUs > 0) {
            sanuc *= sayi;
            pozitifUs--;
        }
        System.out.println(sayi + " üzeri " + hesaplanacakUs + " = " + sanuc);
    }
}
