package day22_ArrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ListRemoveMethodu {
    public static void main(String[] args) {
        List<String> harfler = new ArrayList<>(Arrays.asList("a", "r", "a", "t", "a", "s"));
        System.out.println(harfler); //[a, r, a, t, a, s]

        harfler.remove("a");
        System.out.println(harfler); //[r, a, t, a, s]

        /*
        remove(İstenilenObjeyiSilme) listede varsa siler ve liste değişir listede yoksa silmez ve liste de değişmez
        method çalıştığında asıl amcı olan silme işlemini yapar delil olarak da sildi ise true bulamadı ise false döndürür
         */
        harfler.remove("x");
        System.out.println(harfler);//[r, a, t, a, s]

        System.out.println(harfler.remove("s")); //true
        System.out.println(harfler.remove("y")); // false

        /*
        eğer remove(istenileİNDEX) kullanılırsa istenilen index deki eleman silinir ve
        bize sildiği elemanı döndürür.
         */
        System.out.println(harfler); // [r, a, t, a]
        System.out.println(harfler.remove(1)); // a
        System.out.println(harfler); // [r, t, a]

        List<String> karakter = new ArrayList<>(Arrays.asList("9", "a", "%", "i", "#"));

        /*
        karakterler listesinden, harfler listesinde olan tüm harfleri siler
        karakterler listesi değişirse true değişmezse false dondürür.
                 */
        System.out.println(karakter.removeAll(harfler)); //true
        System.out.println(karakter); //[9, %, i, #]
        System.out.println(karakter.removeAll(harfler)); // false hiç bir şey değişmedi o yüzden false
        /* listemiz sayılardan oluşuyor ise girilen sayinin index mi yoksa silinecek sayı mi olduğu net olarak bilmek için
        java girilen sayıyı INDEX olarak kabul edeceğini belirtir.

         */
        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2, 5, 7, 3, 5, 6));
        System.out.println(sayilar); // [2, 5, 7, 3, 5, 6]
        System.out.println(sayilar.remove(2)); // 7  index olan 2 yi baz alıp 7 yi siler
        System.out.println(sayilar); //[2, 5, 3, 5, 6]

        /*
        Eğer eleman olarak 6 yı silmek istiyorsak
        ve index i bilmiyorsak
        önce silinecek sayiyi non-primitave bir variable'a atamalıyız.
               */
        Integer silineceksayi = 6;
        System.out.println(sayilar.remove(silineceksayi)); //true
        System.out.println(sayilar); // [2, 5, 3, 5]


    }
}
