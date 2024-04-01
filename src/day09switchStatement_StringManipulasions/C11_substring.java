package day09switchStatement_StringManipulasions;

public class C11_substring {
    public static void main(String[] args) {
        String str = "Java Güzeldir";

        System.out.println(str.substring(2)); // va Güzeldir
        System.out.println(str.substring(0)); //Java Güzeldir
        System.out.println(str.substring(str.length()-1)); // r
        System.out.println(str.length()); // 13
        System.out.println(str.substring(13)); //boş satır
        // System.out.println(str.substring(-3));

        System.out.println(str.substring(str.length()-3)); //Sondan 3 harf yazdırılırsa **dir
    }
}
