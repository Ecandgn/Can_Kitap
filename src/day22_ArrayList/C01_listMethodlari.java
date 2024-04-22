package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_listMethodlari {

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(99);
        sayilar.add(9);
        sayilar.add(10);
        System.out.println(sayilar); //[99, 9, 10]

        List<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,9, 41));
        System.out.println(list); //[4, 5, 6, 9, 41]

        sayilar.add(1,541);
        System.out.println(sayilar); //[99, 541, 9, 10]
        sayilar.addAll(list);
        System.out.println(sayilar); // [99, 541, 9, 10, 4, 5, 6, 9, 41]

        sayilar.addAll(2,list);
        System.out.println(sayilar); // [99, 541, 4, 5, 6, 9, 41, 9, 10, 4, 5, 6, 9, 41]
    }
}
