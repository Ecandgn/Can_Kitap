package day24_ArrayList_ForEsachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_OrtakElemanlar {
    public static void main(String[] args) {
        /*
        Verilen iki array’in elementlerini karsilastirip, ikisinde ortak olan elementleri
ayri bir liste olarak veren bir program yazin.
         */
        int[] array1 = {3, 6, 9, 5, 2, 1, 21, 5, 4, 2};
        int[] array2 = {3, 6, 19, 5, 12, 1, 21, 5, 14, 2};
        List<Integer> ortakElemanlistesi = new ArrayList<>();
        for (int each1 : array1) {
            for (int each2 : array2) {
                if (each1 == each2 && !ortakElemanlistesi.contains(each1)) {
                    ortakElemanlistesi.add(each1);

                }
            }
        }
        System.out.println("Ortak Eleman listesi : " + ortakElemanlistesi);
    }
}
