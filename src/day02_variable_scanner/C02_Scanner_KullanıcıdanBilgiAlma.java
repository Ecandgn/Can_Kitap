package day02_variable_scanner;

import java.util.Scanner;

public class C02_Scanner_KullanıcıdanBilgiAlma {
    public static void main(String[] args) {
        //Kullanıcıdan ismini alıp tamamını büyük harfle yazdırın.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen İsminizi Girin....");

        String kullaniciIsmı = scanner.nextLine();

        //İsim istediği için String oluşturuldu
        /*
        scanner.nextLine()  ==> Tüm satırı alır
        next() ==> İlk Space kadar olan kısmı alır.
         */

        System.out.println("Girilen İsmin Büyük Harfle Yazılışı:  " + kullaniciIsmı.toUpperCase());


    }
}
