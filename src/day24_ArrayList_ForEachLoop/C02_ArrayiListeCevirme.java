package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayiListeCevirme {
    public static void main(String[] args) {
        Integer sayilar[] = {3, 5, 2, 6, 7, 3, 4, 5, 6};
        // bu aray i List'e çevirin

        //1- Loop ile array deki tüm elementleri List'e ekleyebiliriz
        List<Integer> sayiList1 = new ArrayList<>();
        for (int i = 0; i < sayilar.length; i++) {
            sayiList1.add(sayilar[i]);
        }
        System.out.println(sayiList1); // [3, 5, 2, 6, 7, 3, 4, 5, 6]
        sayiList1.add(9);
        sayiList1.remove(0);
        System.out.println(sayiList1);  //  [5, 2, 6, 7, 3, 4, 5, 6, 9]

        // 2 AsList()
        /*
        varolan bir array i tek bir satırla aslist() kullanrak listeye çevirebiliriz
        ANCAK bu çevirme işlemi ile oluşturulan listede 2 major yan etki olur
        -asList() ile dönüştürülen listeye arra'de olduğu gibi ekleme veya silme işlemiyapılamaz

        -asList ile dönüştürülen liste ve kaynak olarak kullanılan array
        etkileşime devam eder
        arrayde yaptığınız değişiklikler listeye de yansır
        aynı şekilde listede yaptığımız değişiklikler array 'e de işlenir
         */
        List<Integer> sayilarList2 = Arrays.asList(sayilar);
        System.out.println("aslist ile dönüştürülen liste : " + sayilarList2);
       // sayilarList2.add(9); //UnsupportedOperationException
       // sayilarList2.remove(0); //UnsupportedOperationException

        sayilar[0]=123;
        sayilar[1]=321;
        System.out.println("Array'e yapılan atamadan sonra array : "+Arrays.toString(sayilar));
        System.out.println("Array'e yapılan atamadan sonra liste : "+sayilarList2);
    }
}
