package day20_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Split {
    public static void main(String[] args) {
        String str = "Ali topu at, at Ali at";
        System.out.println(Arrays.toString(str.split("at")));
        //[Ali topu , , ,  Ali ]

        System.out.println(Arrays.toString(str.split("Ali")));
        //[,  topu at, at ,  at]

        // str'daki kelime sayısını yazdırınız
        System.out.println(Arrays.toString(str.split(" ")));
        // [Ali, topu, at,, at, Ali, at]

        System.out.println("Kelime Sayısı: " + str.split(" ").length);
        // Kelime Sayısı: 6

        // str i karakterlerden ayırın
        System.out.println(Arrays.toString(str.split("")));
        //  [A, l, i,  , t, o, p, u,  , a, t, ,,  , a, t,  , A, l, i,  , a, t]
    }
}
