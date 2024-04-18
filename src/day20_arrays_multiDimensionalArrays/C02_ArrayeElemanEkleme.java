package day20_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class C02_ArrayeElemanEkleme {
    public static void main(String[] args) {
        /*
        Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
eski array’e yeni degeri atayin.
         */
        int[] sayilar = {3, 5, 7};
        int ekleneceksayi = 9;
        sayilar = arrayElemanEkle(sayilar, ekleneceksayi);
        System.out.println(Arrays.toString(sayilar));
// 1 eklenmiş hali
        sayilar = arrayElemanEkle(sayilar, 1);
        System.out.println(Arrays.toString(sayilar));
    }

    public static int[] arrayElemanEkle(int[] arr, int eklenecekSayi) {

        //vaar olan arraye yeni eleman eklemeliyiz
        int[] yeniArr = new int[arr.length + 1];
        //eski arraydeki elemanları aynı  indekslerle yeni arraye atayalım

        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i];
        }
        yeniArr[yeniArr.length - 1] = eklenecekSayi;

        return yeniArr;
    }
}
