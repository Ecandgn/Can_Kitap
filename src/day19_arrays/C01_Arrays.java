package day19_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] arr = new int[4];  //[0, 0, 0, 0] standart yazılım bir virgül bir boşluk
        // array'ın 2.indekdeki elemnti yazdırın

        System.out.println(arr[2]);
        System.out.println(Arrays.toString(arr));
        //1. indekse 5 değerini atayın

        arr[1] = 5;
        //tüm array'ı yazdırmak istersek

        System.out.println(arr); //

        System.out.println(Arrays.toString(arr));//tüm array yazdırıldı burada

        //arrayın içinde kaç elelman olduğunu yazdırın (lenght)
        System.out.println(arr.length); //4

        //tüm elemanları yanlarında bir boşluk bırakarak yazdırın
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); //burda yazdırılan Arry değil arryın içeriğidir

        }

    }
}
