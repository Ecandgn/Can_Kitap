package day14_methodOluşturmaVeKullanma;

import java.util.Scanner;

public class C06_isimDuzenle {
    public static void main(String[] args) {
        /*
        Kullanicidan main method icinde ayri ayri isim ve soyismini alin
Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
isim bosluk soyisim seklinde bize donduren bir method olusturun
input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz...");
        String isim = scan.nextLine();
        System.out.println("Soy isminiz giriniz");
        String soyisim = scan.nextLine();
        // metin bize bir string döndürdüğü için ya dönen stringi hemen yazdırırız
        System.out.println(isimiDuzenle(isim, soyisim));
        // yada daha sonra kullanılmak üzere kaydedririz.
        String duzenlenenIsim = isimiDuzenle(isim, soyisim);

    }

    public static String isimiDuzenle(String isim, String soyisim) {
        String duzenlenmisİsim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " "
                + soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        return duzenlenmisİsim;
    }
}
