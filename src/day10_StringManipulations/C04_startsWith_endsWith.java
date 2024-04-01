package day10_StringManipulations;

public class C04_startsWith_endsWith {
    public static void main(String[] args) {
        String str = "Ali topu at, at Ali at";

        System.out.println(str.contains("Ali"));
        System.out.println(str.contains("top"));
        System.out.println(str.contains("at"));
        System.out.println("===============");
        // str Ali ile mi bitiyor?
        System.out.println(str.endsWith("Ali")); //false

        // str Ali ile başlıyor mu ?
        System.out.println(str.startsWith("Ali")); // true

        System.out.println(str.startsWith("A"));  //true
        System.out.println(str.startsWith("Ali topu at"));// true

        System.out.println("-------------------");
        System.out.println(str.endsWith("Ali topu at, at Ali at")); //True
        System.out.println(str.startsWith("Ali topu at, at Ali at")); //True

        System.out.println(str.endsWith("")); //True
        System.out.println(str.startsWith("")); //True

        System.out.println("*****************");
        // String str = "Ali topu at, at Ali at";
        System.out.println(str.startsWith("top")); //false
        System.out.println(str.startsWith("top", 4)); //true


    }
}
