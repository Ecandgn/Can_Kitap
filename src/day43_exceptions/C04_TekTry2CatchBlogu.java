package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_TekTry2CatchBlogu {
    public static void main(String[] args) {
        String str = "Java gun geçtikçe guzelleşir ";
        //Kullanıcıdan pozitif bir tam sayı alın
        //ve bu tamsayıyı index olarak kabul edin
        //str da o index deki harfi yazdırın


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz.");

        try {
            int index = scan.nextInt();
            System.out.println(str.charAt(index));
        } catch (InputMismatchException e) {
            System.out.println("Pozitif tam sayı girmelisin...");
        } catch (StringIndexOutOfBoundsException e){
        System.out.println("Girdiğiniz sayı metnin sınırları dışında ");
    }
}
}
