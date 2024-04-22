package day22_ArrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_TekrarsızHaleGetirme {
    public static void main(String[] args) {
        /*
        Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
elemanlardan sadece 1 tane yapip bize dondurecek bir method olusturun.
         */

        int[] arr = {3, 5, 3, 2, 6, 32, 32, 1, 2, 3, 6, 3, 5};
        arr =uniqueHaleGetir(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] uniqueHaleGetir(int[] arr) {
        List<Integer> unique = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!(unique.contains(arr[i]))) {
                unique.add(arr[i]);
            }
        }
        int[] yeniArr = new int[unique.size()];
        for (int i = 0; i < yeniArr.length; i++) {
            yeniArr[i] = unique.get(i);
        }
        arr=yeniArr;
        return arr;
    }
}
