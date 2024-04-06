package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C09_NestedForLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan satır ve sutun sayısını alıp
        aşağıdaki tabloyu yapınız
    ************
    ************
    ************
    ************
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Satır sayısını giriniz...");
        int satir = scan.nextInt();

        System.out.println("Lutfen sutun sayısını giriniz");
        int sutun = scan.nextInt();
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=sutun ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
