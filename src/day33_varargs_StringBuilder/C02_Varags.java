package day33_varargs_StringBuilder;

public class C02_Varags {
    public static void main(String[] args) {

        method1("Ali");
        method1("ESAT", "can", "dogan");
        method1("a");
        method1("a", "b", "v", "f", "r", "h");


    }

    public static void method1(String s, String... t) {
        System.out.println(s.length() + t.length);
    }
}