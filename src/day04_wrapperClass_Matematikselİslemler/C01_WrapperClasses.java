package day04_wrapperClass_Matematikselİslemler;

public class C01_WrapperClasses {
    public static void main(String[] args) {



        int sayi = 20;
        String str = "Java Candır";

        System.out.println(str.toUpperCase());
        /*
        Wrapper class’lar primitive data turlerini iceren class’lardir. Bu class’lardan olusturulan
objeler primitive data turleri ile kullanabilirler.
         */
// Primitave data hazır metod yok.
        char chr1 = 'a';
        Character chr2 = 'b';
        System.out.println(chr2.charValue()); //b
        System.out.println(Character.isLowerCase(chr1));  //true
        System.out.println(Character.isDigit(chr1)); //false

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

    }
}
