package day10_StringManipulations;

public class C02_contains {
    public static void main(String[] args) {
        String str = "Ali topu at, at Ali at";
        System.out.println(str.contains("Ali")); // True
        System.out.println(str.contains("at"));  // True
        System.out.println(str.contains("ali")); //False
        System.out.println(str.contains("topu Ali")); //False
        System.out.println(str.contains("topu at")); // True
        System.out.println(str.contains("u a")); // True
        System.out.println(str.contains("topu") && str.contains("Alih")); //false
/*
Büyük küçük uymuna bakar benzer olanlar için True hatalı olanlar için false olarak yanıt döner.
 */

    }
}
