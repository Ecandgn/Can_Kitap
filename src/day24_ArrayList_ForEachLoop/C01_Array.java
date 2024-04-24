package day24_ArrayList_ForEsachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Array {
    public static void main(String[] args) {
        /*
        verilen String bir listedeki
        kullanılan toplam harf/karakter sayısını yazdırın
         */
        List<String> isimler =
                new ArrayList<>(Arrays.asList("Seren", "Eghbal", "Ilgar", "Joanna", "Ali Cabbar"));
        int toplamkarakterSayisi = 0;
        for (int i = 0; i < isimler.size(); i++) {
            toplamkarakterSayisi += isimler.get(i).length(); // i. elemntin uzunluğu geldi
        }
        System.out.println("Listede toplam " + toplamkarakterSayisi + " adet harf veya karakter kullanılmış");

    }

}
