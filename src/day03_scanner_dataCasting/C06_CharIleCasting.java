package day03_scanner_dataCasting;

public class C06_CharIleCasting {
    public static void main(String[] args) {

        char karakter = 'a';
        int sayi = karakter; // Karakterin ASCI tablosundaki değerini yazdırır '97'
        double db1 = karakter; // Karakterin ASCI tablosundaki değerini yazdırır
        char ch1 = 68; //ASCII karşılığı 'D'

        System.out.println("char=" + karakter + "\n İnt=" + sayi + "\n Double=" + db1 + "\n Karakter=" + ch1);

        System.out.println((double) 'E' / 'D');     //ASCI tablosundaki Değerler ile işlem yaptıı
        System.out.println('E' / 'D');
        System.out.println('a' / 'b');

    }
}
