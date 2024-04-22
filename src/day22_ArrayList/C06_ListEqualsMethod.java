package day22_ArrayList;

import java.util.*;

public class C06_ListEqualsMethod {
    public static void main(String[] args) {
        List<Integer> sayilar1=new ArrayList<>(Arrays.asList(2,6,9));
        List<Integer> sayilar2=new ArrayList<>(Arrays.asList(6,9,2));

        System.out.println(sayilar1.equals(sayilar2)); // false

        Collections.sort(sayilar1);
        Collections.sort(sayilar2);

        System.out.println(sayilar1.equals(sayilar2)); // true


    }
}
