package day20_arrays_multiDimensionalArrays;

import day19_arrays.C05_ElemanArama;

import java.util.Arrays;

public class C03_Sort {
    public static void main(String[] args) {
int[] sayilar={2,6,10,9,52,4,23,1,4};
        Arrays.sort(sayilar); //Doğal Sınırlama Yapar
        System.out.println(Arrays.toString(sayilar));

    String[] isimler={"Meltem", "Seren", "Ali", "Ahmet", "semih","Merve","Zam","Veli"}; //Harflere sırası ile bakarak sıralama yapar
    Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        C05_ElemanArama.elemanVarmi(sayilar,2); // aranan elmeanı başkaclasdan çağırma
    }
}
