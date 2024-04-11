package day15_methodOverLoading;

public class C01_MethoodOverLoading {
    public static void main(String[] args) {

        String str = "Java Candır";
        System.out.println(str.substring(5)); //Candır
        System.out.println(str.substring(5, 8)); //Can

        //Bir clasda aynı isimde birden fazla method oluşturulmasına
        //method overloading denir
        toplama(3, 4);
        toplama(3,4,6);
        toplama(1,2.5);

    }
/*
Bir Class'ın içerisinde herşeyi aynı olan 2 method oluşturamazsınız
parametre isimleri, acces modifler'i veya static durumunu değiştirmek yeterli olmaz
bir class içinde aynı isimde birden fazla method oluşturabilmek için (overloading) methodların
SIGNATURE'ları farklı olmalıdır.
Method Signature : Method ismi + parametrelerin data turleri
 */

    public static void toplama(int a, int b) {
        System.out.println("İki integer toplamı : " + (a + b));
    }
    public static void toplama(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 int toplamı : " + (sayi1 + sayi2 + sayi3));
    }
    public static void toplama(double a, int b) {
        System.out.println("double ve int  toplamı : " + (a + b));
    }
    public static void toplama(double a, double b) {
        System.out.println("double ve double  toplamı : " + (a + b));
    }
}

