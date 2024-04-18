package day20_arrays_multiDimensionalArrays;

import day19_arrays.C05_ElemanArama;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class C04_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 6, 10, 9, 52, 4, 23, 1, 4};
        C05_ElemanArama.elemanVarmi(arr,5); // aranan array de 5 kullanılmamış

        // binarySearch bir arraydeki elemanların varlığını sorgulamak için kullanılır
        System.out.println(Arrays.binarySearch(arr,3)); //-2
        System.out.println(Arrays.binarySearch(arr,4)); //-2
        System.out.println(Arrays.binarySearch(arr,2)); //0
/*
binarySearch(), aranan elemanın ilk kullanıldığı index i verir
ama binarySearch() sort edilmiş arrayde sağlıklı çalışır
 */
Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,6)); // 4
        System.out.println(Arrays.binarySearch(arr,4)); //2
        System.out.println(Arrays.binarySearch(arr,2)); //1
        System.out.println(Arrays.binarySearch(arr,32));
        /*
        array'de olan elemanların index'ini
        olmayan elemanların ise - işareti ile
        olsalardı kaçıncı sırada olacaklarını döndürürler
         */
    }

}
