package day09switchStatement_StringManipulasions;

import java.util.Locale;

public class C08_switchStatement_stringManipulations {
    public static void main(String[] args) {
        String str = "JavA Candır";
        // str büyük harf ile yazdırılırsa
        System.out.println(str.toUpperCase());
        //küçük harflerle yazdırma
        System.out.println(str.toLowerCase());

        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str); // Kalıcı oldu
        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // dil seçildi
    }
}
