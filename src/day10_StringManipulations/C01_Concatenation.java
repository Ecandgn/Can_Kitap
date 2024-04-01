package day10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {
        System.out.println("Ja"+"va"+5+4+true );

String s1="Ja";
String s2="va";
        System.out.println(       s1+s2  );
        System.out.println(s1.concat(s2));
        // System.out.println(s1.concat(1)); yazdırmaz çünkü concat method'unda mutlaka string kullanılmalıdır.
    }
}
