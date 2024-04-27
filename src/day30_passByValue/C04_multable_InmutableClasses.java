package day30_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_multable_InmutableClasses {
    public static void main(String[] args) {
        String str = "Java CAndır.";
        str.toUpperCase();
        System.out.println(str);
        System.out.println(str.substring(5));
        System.out.println(str);
        str.length();
        str.toLowerCase();
        str.replace("a", "c");
        System.out.println(str);

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(4);
        sayilar.add(7);
        System.out.println(sayilar);

        sayilar.add(1, 9);
        System.out.println(sayilar); // [4, 9, 7]
        sayilar.remove(0);
        System.out.println(sayilar); // [9, 7]


    }
}
