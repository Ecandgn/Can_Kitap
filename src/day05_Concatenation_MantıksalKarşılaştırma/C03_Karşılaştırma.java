package day05_Concatenation_MantıksalKarşılaştırma;

public class C03_Karşılaştırma {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(2 * a + 4 == 14); //false

        System.out.println(a + 4 == 2 * a - 1); //9==9 true

        int b = 3;
        System.out.println(b = 3 * a - 7);
        System.out.println(b == 2 * a + 8); // false
        System.out.println(b != 2 * a + 8); // true
        System.out.println(2 * a != b + 2);

        System.out.println(2 * a > b - 3); //true
        System.out.println(!(a + 7 > b + 8)); //başa yazılan ! mantıksal değeri tersine çevirir
        System.out.println(!true); // False
        a = 10;
        b = 5;
        System.out.println(a <= b); // false
        System.out.println(a >= b); // True
        System.out.println(!(a >= b)); // False


    }
}
