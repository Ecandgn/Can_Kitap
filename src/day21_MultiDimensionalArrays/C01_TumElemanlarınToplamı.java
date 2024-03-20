package day21_MultiDimensionalArrays;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class C01_TumElemanlarınToplamı {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();
        ArrayList<String> denem = new ArrayList<>();
        ArrayList<String> denem1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String isim = "";

        while (!isim.equalsIgnoreCase("q")) {
            System.out.println("Listeye Eklemek İsim Girin....");
        isim =scanner.nextLine();
        if (!isim.equalsIgnoreCase("q")){

            isimler.add(isim);
        }
        }
        System.out.println("Girilen İsimler:"+isimler);
    }
}
