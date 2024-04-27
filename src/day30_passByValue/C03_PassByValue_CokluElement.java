package day30_passByValue;

import java.util.Arrays;

public class C03_PassByValue_CokluElement {
    public static void main(String[] args) {
        int[] arr = {6, 9, 2};

        // arr in tüm elementlerini bir azaltıp yazdıran bir method oluşturun.
        elemanlariAzalt(arr); // [5, 8, 1]
        // Method call den sonra arrayi yazdıralım
        System.out.println(Arrays.toString(arr)); // [5, 8, 1]
        // yeni bir method oluşturun
        // methodda uzunluğu 4 olan yeni bir array oluşturup arr deki elemanları yeni array e taşıyın
        //4.eleman olarak 3 atayın işlem bittikten sonra yeni arrayi arr'ye atayıp yazdırın
        elemanEkle(arr);
        System.out.println("Eleman ekle metodundan sonra arr: " + Arrays.toString(arr)); // [5, 8, 1]
    }

    public static void elemanEkle(int[] arr) {
        int[] yeniArr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i] = arr[i];
        }
        yeniArr[3] = 3;
        arr = yeniArr;
        System.out.println(Arrays.toString(arr));
    }

    public static void elemanlariAzalt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= 1;
        }
        System.out.println(Arrays.toString(arr));
    }

}
