package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01IstenmeyenleriSil {
    public static void main(String[] args) {
        /*
        Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
kismini list olarak bize donduren bir method olusturun
         */
        List<String> isimler = new ArrayList<>(Arrays.asList("Seher", "Seren", "Meltem", "Bekir", "Sait", "Hasan"));
        String istenmeyenharf = "e";
        System.out.println(isimler);
        System.out.println(istenmeyenHarfleriSil(isimler,istenmeyenharf));
    }

    public static List<String> istenmeyenHarfleriSil(List<String> isimler, String istenmeyenharf) {
        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).contains(istenmeyenharf)) {
                isimler.remove(i);
                i--; // azaltmaz isek aradan kaçan olur çünkü silinen element bir yana kayar
            }
        }
        return isimler;
    }
}


