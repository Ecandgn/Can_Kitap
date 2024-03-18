package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_KullanıcıBilgileriniYazdırma {
    public static void main(String[] args) {
    /*Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.

        */

        Scanner scan = new Scanner(System.in);

        System.out.println("İsminiz=");
        String name = scan.nextLine();

        System.out.println("Soy isim=");
        String surname = scan.nextLine();

        System.out.println("yaşınızı Giriniz=");
        int age = scan.nextInt();

        System.out.println("İsminiz : " + name+"\nSoyİsminiz : " + surname+"\nYaşınız : "+age);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");


    }
}
