package day30_passByValue;

import java.util.Locale;

public class C05_StringPool {
    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "Ali";
        String str3 = new String("Ali");
        String str4 = "A" + "li";
        String str5 = "A";
        String str6 = "Li";
        String str7 = str5 + str6;
        String str8 = "a";
        String str9 = str8.toUpperCase(Locale.ROOT).concat(str6);

        /*
        equels() sadece metne odaklanır.
        metin aynı ise true metinde farklılık varsa false verir
       == ise hem metne hemde referansa bakar
       referans farklı ise metin aynı olsa da false verir.
         */

        System.out.println(str1.endsWith(str2));//True
        System.out.println(str1.endsWith(str3));//True
        System.out.println(str1.endsWith(str4));
        System.out.println(str1.endsWith(str7));
        System.out.println(str1.endsWith(str9));
        System.out.println(str1.endsWith("Ali"));//True

        System.out.println("==============");

        System.out.println(str1 == str2); //True
        System.out.println(str1 == str3);
        System.out.println(str1 == str4);
        System.out.println(str1 == str4); //True
        System.out.println(str1 == str7);//false
        System.out.println(str1 == str9);//false
        System.out.println(str1 == "Ali"); //True


    }
}
