package day09switchStatement_StringManipulasions;

import java.util.Scanner;

public class C06_MevsimYazma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ay numarasını Girin...");
        int ayno = scan.nextInt();
        switch (ayno) {
            case 3:
            case 4:
            case 5:

                System.out.println("İlkbahar");
                break;
            case 6:
            case 7:
            case 8:

                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Kış");
                break;

            default:
                System.out.println("Ay numarası hatalı...");
        }
    }
}
