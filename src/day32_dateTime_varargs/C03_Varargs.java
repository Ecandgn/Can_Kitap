package day32_dateTime_varargs;

public class C03_Varargs {
    public static void main(String[] args) {
        /*
        varargs sadece parametre olarak kullanılır  vr array altyapısı kullanılır
         */

        topla(3, 5);
        topla(3, 5, 7);
        topla(3, 5, 7, 2);
        topla(5);
        topla(1, 2, 3, 4, 5, 6, 7, 8, 9);
        topla(1, 2, 3, 4, 5, 6, 7);
    }

    public static void topla(int... sayilar) {
        int toplam = 0;
        for (int each : sayilar) {

        }
    }

    public static void topla(int a, int b) {
        System.out.println(a + b);
    }

    public static void topla(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void topla(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
}
