package day43_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_FarkliTryCatclerIleCozum {
    public static void main(String[] args) {
         /*
            Ayri ayri try catch kullandigimizda
            birinci try-catch'de exception yakalandiginda
            ikinci bundan haberdar olmuyor

            bunun cozumu icin ekstra flag kullanilabilir
         */

        String str = "Java gun geçtikçe guzelleşir ";
        //Kullanıcıdan pozitif bir tam sayı alın
        //ve bu tamsayıyı index olarak kabul edin
        //str da o index deki harfi yazdırın


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tam sayı giriniz.");

        int index = 0; //InputMissmatchException

        try {
            index = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Pozitif birtamsayı giriniz.");

        }

        try {
            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Girdiğiniz index sınırların dışında");
        }
    }
}
