package day21_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ListMethodlari {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(99);
        sayilar.add(9);
        sayilar.add(10);
        System.out.println(sayilar);

        List<Integer> List = new ArrayList<>(Arrays.asList(4,5,6,9,9, 49, 41));
        System.out.println(List);
        //Listedeki eleman sayisini yazdırın
        System.out.println(List.size()); // 7

        //listede eleman olarak 7 var mı?
        System.out.println(List.contains(7)); // false


    }
}
