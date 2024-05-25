package day45_Iterator_ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_NicinIteratorKullanilir {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(5, 9, 2, 4));
        System.out.println(sayilar);


        // sayilar listesindeki tüm elementleri 2 artırıp
        //yeni haliyle listeyi kaydedin

        for (int i = 0; i < sayilar.size(); i++) {
            int eskiDeger = sayilar.get(i);
            sayilar.set(i, eskiDeger + 2);
        }
        System.out.println(sayilar);

        // javada her zaman index kullanamayabiliriz
        //Index kullanmadan sayılar listesindeki tüm elementleri silin
        //

        Iterator iter = sayilar.iterator();
        System.out.println(iter.hasNext()); // yanında eleman var mı TRUE/FALSE

        Integer sayi = (Integer) iter.next();
        if (sayi != 0) {
            iter.remove(); // 7 yi siler
        }
        System.out.println(iter.hasNext());
        sayi = (Integer) iter.next();
        if (sayi % 2 != 0) {
            iter.remove();//11 siler
        }
        System.out.println(sayilar);
        sayilar.add(15);
        sayilar.add(22);
        sayilar.add(43);

        System.out.println(sayilar);

        iter = sayilar.iterator();
        while (iter.hasNext()) {  // while (iter.hasNext() == true)
            sayi = (Integer) iter.next();
            if (sayi % 2 != 0) {
                iter.remove();
            }

        }
        System.out.println(sayilar);
    }
}
