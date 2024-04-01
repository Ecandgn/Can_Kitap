package day09switchStatement_StringManipulasions;

public class C12_Substring {
    public static void main(String[] args) {
        String str = "Java Güzeldir";

        System.out.println(str.substring(0, 6)); //Java G
        System.out.println(str.substring(5, 8)); //Güz
        System.out.println(str.substring(str.length() - 6)); //zeldir
        /*
        Javanın genelinde başlangıç indeksleri dahil(İnclusive)
        bitiş index'leri hariç (excusive)'dir.
         */

        System.out.println(str.substring(5, 5));
        System.out.println(str.substring(str.length() - 3, str.length()));
        System.out.println(str.toUpperCase());
    }
}
