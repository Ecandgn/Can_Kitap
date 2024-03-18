package day02_variable_scanner;

import java.util.Scanner;

public class C04_IlkHarfiYazdırma {
    public static void main(String[] args) {
        //kullanıcıdan bir metin isteyip metnin sadece ilk harfini büyük olarak yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir metin Giriniz:");
        String metin=scan.nextLine();
        System.out.println(metin.toUpperCase().charAt(0));

    }
}
