package day45_Iterator_ListIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_ListInterator {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>(Arrays.asList(4, 7, 9, 2, 5));
        System.out.println(liste);

        //index kullanmadan listedeki çift sayıları 2  .
        //tek sayıları 1 aarttırın

        ListIterator<Integer> lit = liste.listIterator();
        while (lit.hasNext()) {
            Integer sayi = lit.next();
            if (sayi % 2 == 0) {
                lit.set((sayi + 2));
            } else {
                lit.set(sayi + 1);
            }
        }
        System.out.println(liste);
        // listenin yeni halinde
        // elementleri sondan basa dogru yazdirin
        // bu satir itibariyle lit en sonda
        // bu gorev icin lit dogru yerde

        while (lit.hasPrevious()) {

            System.out.print(lit.previous() + " ");

        }

        System.out.println("\n" + liste); // [ 6, 8, 10, 4, 6]


        // listeyi sondan basa dogru tekrar yazdirin
        // yukaridaki gorevlerden sonra
        // lit en basa geldi
        // bizim elementleri sondan basa yazdirabilmemiz icin
        // lit'i yeniden en sona goturmeliyiz
        while (lit.hasNext()) {
            lit.next();
        }
        // yukaridaki while loop
        // lit'i en sona goturur
        // artik gorevi yapabiliriz

        while (lit.hasPrevious()) {

            System.out.print(lit.previous() + " ");

        }
    }
}
