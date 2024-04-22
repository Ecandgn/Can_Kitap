package day22_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_EnUzunKelime {
    /*
    verilen bir String listteki en uzun kelimeyi yazdırın
    en uzun kelimenin harf sayısına eşi birden fazla kelime varsa en
    sonuncusunu yazdırın.
     */
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>(Arrays.asList("Seher","Sümeyra","Meltem","Ramazan","Mustafa","abdurrahman"));
        System.out.println(isimler);
        String enuzun=isimler.get(0);
        for (int i = 0; i < isimler.size(); i++) {
            if (isimler.get(i).length() >= enuzun.length()) {
                enuzun= isimler.get(i);
            }
        }
        System.out.println(enuzun);
    }
}
