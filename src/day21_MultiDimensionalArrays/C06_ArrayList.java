package day21_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C06_ArrayList {
    public static void main(String[] args) {
        /*
        Kullanıcıdan girmek istediği kadar isim alıp
        girilen isimleri kaydedin
        kullanıcı bitirmek için q'ya basmalıdır.
         */
        List<String> isimler = new ArrayList<>();
        ArrayList<String> deneme = new ArrayList<>();
        ArrayList<String> deneme1 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String isim = "";
        while (!isim.equalsIgnoreCase("q")) {
            System.out.println("Listeye Ekelemej için isim giriniz...\n bitirmek için q ya Basınız");
            isim = scan.nextLine();
            if (!isim.equalsIgnoreCase("q")) {
                isimler.add(isim);
            }

        }
        System.out.println("Girilen isimler :" + isimler);
    }
}
