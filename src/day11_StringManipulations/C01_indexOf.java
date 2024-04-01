package day11_StringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {
        String str = "Java cok zevkli";

        // metnin kaç karakter olduğunu yazdırın.
        System.out.println(str.length()); // 15

        // son karakteri yazdırın
        System.out.println(str.charAt(str.length() - 1)); //i

        // str da z harfi kullanılmış mı
        System.out.println(str.contains("z")); //True

        // str da ilk k'nın indeksini yazdırın
        System.out.println(str.indexOf('k')); // 7

        // str'da "cok kelimesini index'ini yazdırın
        System.out.println(str.indexOf("cok")); //5
// str da son kullanımının index'ini yazdırın
        System.out.println(str.lastIndexOf('k')); // 12 // sondan başlar aramaya

        // str sondan bir önceki kullanımının indexini yazdırın
        System.out.println(str.lastIndexOf("k", 11)); //7

        // str da kullanılan "cok kelimesinin indexi ni yazdırın"
        System.out.println(str.lastIndexOf("cok")); //5

        //str da kullanılan ilk x harfinin index ini yazdırın
        System.out.println(str.indexOf('x')); // olmadığı için -1 yazdırır



    }
}
