package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_PozitifTamBolenlerinListesi {
    public static void main(String[] args) {
        /*
        Verilen pozitif bir tamsayiyi, tam bolebilen tum pozitif tamsayilari bir liste
olarak bize donduren bir method olusturun.
         */

        System.out.println(   pozitifBolen(20) );
        System.out.println(   pozitifBolen(99) );
        System.out.println(   pozitifBolen(240) );
    }

    public static List<Integer> pozitifBolen(int sayi) {
        List<Integer> pozitifbolenlerlistesi = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                pozitifbolenlerlistesi.add(i);
            }
        }

        return pozitifbolenlerlistesi;


    }
}
