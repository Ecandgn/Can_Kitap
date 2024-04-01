package day11_StringManipulations;

public class C06_ReplaceAll {
    public static void main(String[] args) {
        /*
        verilen String deki tüm özel karakterleri
        sayıları ve yan yana birden fazla olan space'leri temizleyin
        örnek input: J10a6%v*a     C^7an@90dir
        outpu: Java Candır
         */
        String input = "J10a6%v*a     C^7a-n@90__dir";
        input = input.replaceAll("\\s+", " ");

        // tüm sayıları yok edelim
        input = input.replaceAll("\\d", "");
        input = input.replaceAll("\\s", "5");
        input = input.replaceAll("\\W", "");
        input = input.replaceAll("-", "");
        input = input.replaceAll("_", "");
        input = input.replaceAll("5", " ");


        System.out.println(input);

        /*
        \*yazılırsa * işeretini yazdırır.
         */
        System.out.println("\"JAVA\"");

    }
}
