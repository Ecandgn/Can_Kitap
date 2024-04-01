package day09switchStatement_StringManipulasions;

import java.util.Scanner;

public class C02_HaftaIcıHaftaSonuAyrımı {
    public static void main(String[] args) {
        /*
        Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin
         */
        System.out.println("Gün numarasını girin (1-7 arasında bir tamsayı giriniz)...");
        Scanner scan = new Scanner(System.in);
        int gunNo = scan.nextInt();
        switch (gunNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta İçi;");
                break;
            case 6:
            case 7:
                System.out.println("Hafta Sonu;");
                break;
            default:
                System.out.println("Hatalı Giriş");
        }

    }
}
