package day04_wrapperClass_Matematikselİslemler;

import java.util.ArrayList;
import java.util.List;

public class C07_Pre_Post_Increment {
    public static void main(String[] args) {
        int[] arr = {3, 3, 6, 4, 7, 8, 5, 2, 4, 6, 9, 87, 5,};

        List<Integer> benzerizList = new ArrayList<>();
        for (int each : arr
        ) {
            if (!benzerizList.contains(each)) {
                benzerizList.add(each);
            }
        }
        System.out.println(benzerizList);
        arr = new int[benzerizList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = benzerizList.get(i);

        }
        System.out.println(benzerizList);
    }

}
