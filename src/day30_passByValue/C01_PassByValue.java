package day30_passByValue;

import java.util.Scanner;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        Main method’da verilen
fiyat degerine %10, %20 ve %30
indirim yaparak, indirimli fiyati bize
döndüren 3 method olusturun.
Main method’dan bu 3 method’u arka
arkaya cagirip, return edilen fiyatlari
yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen indirimsiz fiyatı giriniz : ");
        double fiyat = scan.nextDouble();
        System.out.println("%10 indirimli fiyat : "+yuzde10IndırımYap(fiyat));
        System.out.println("%10 indirimli fiyat method cağrıldıktan sonra fiyat : "+fiyat);
        System.out.println("%20 indirimli fiyat : "+yuzde20Indirimyap(fiyat));
        System.out.println("%20 indirimli fiyat method cağrıldıktan sonra fiyat : "+fiyat);
        System.out.println("30 indirimli fiyat : "+yuzde30Indirimyap(fiyat));
        System.out.println("%30 indirimli fiyat method cağrıldıktan sonra fiyat : "+fiyat);

        // fiyatta kalıcı olarak %30 indirim yapılırsa
        System.out.println("----------");
        fiyat=yuzde30Indirimyap(fiyat);
        System.out.println("%30 indirimli fiyat method çağrıldıktan sonra fiyar: "+fiyat);
    }
    public static double yuzde10IndırımYap(double fiyat) {
        fiyat = fiyat * 90 / 100;
        return fiyat;
    }
    public static double yuzde20Indirimyap(double fiyat) {
        fiyat = fiyat * 80 / 100;

        return fiyat;
    }
    public static double yuzde30Indirimyap(double fiyat) {
        fiyat = fiyat * 70 / 100;
        return fiyat;
    }

}
