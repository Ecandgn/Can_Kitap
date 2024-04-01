package day09switchStatement_StringManipulasions;

import java.util.Scanner;

public class C04_SwitchISTQB {
    /*
    Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
    ve girilen harfin karsiligini yazdirin.
    I : International
    S : Software
    T : Testing
    Q : Qualifications
    B: Board
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ISTQB kisaltmasindan harfin anlamini ogrenmek istediginizi giriniz...");
        char karakter = scan.nextLine().toUpperCase().charAt(0);
        switch (karakter) {

            case 'I':
                System.out.println("  I : International ");
                break;
            case 'S':
                System.out.println(" S : Software");
                break;
            case 'T':
                System.out.println("T : Testing ");
                break;
            case 'Q':
                System.out.println("Q : Qualifications ");
                break;
            case 'B':
                System.out.println("B: Board");
                break;
            default:
                System.out.println("Lütfen Kısaltmadaki Harflerden Birini Giriniz");
        }
    }
}
