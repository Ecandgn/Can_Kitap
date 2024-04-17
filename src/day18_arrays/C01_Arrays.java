package day18_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        /* bir array iki şekilde oluşturabiliriz
        1- deklarasyon ve içindeki tüm elementler yazılabilir
         */
        String[] isimler = {"Mahmut", "Hasan", "Ilgar", "Sumeyra"};
        String harfler[] = {"a", "l", "d"};

        System.out.println(harfler[2]); // d


        // 2- deklerasyon ve array'ın eleman sayısı yazılıp array oluşturulabilir
        int[] sayilar = {3, 4, 5};
        System.out.println(sayilar[1]); // 4

        int[] arr = new int[5];
        System.out.println(arr[3]); //0

        arr[1] = 3;

        // isimler arrayinde Hasanı yazdırın
        System.out.println(isimler[1]);

        // harf arrayinin 1. index'indeki harfi yazdırın
        System.out.println(harfler[1]);

        // harfler arrayinin 2 .index indeki elemanı i yapınız
        System.out.println(harfler[2]); // d
        harfler[2] = "i"; // i
        System.out.println(harfler[2]);

        // içinde 5,8,1 sayılarının olduğu bşr array oluşturun
        int[] sayilar2 = {5, 8, 1}; //[5,8,1]
        int[]sayilar3=new int[3]; //[0,0,0]
        sayilar3[0]=5;
        sayilar3[1]=8;
        sayilar3[2]=1;
        System.out.println(sayilar3);
        System.out.println(Arrays.toString(sayilar2)); //[5, 8, 1]
        System.out.println(Arrays.toString(sayilar3)); //[5, 8, 1]
    }
}
