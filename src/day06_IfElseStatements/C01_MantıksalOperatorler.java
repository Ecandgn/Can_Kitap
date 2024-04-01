package day06_IfElseStatements;

public class C01_MantıksalOperatorler {
    public static void main(String[] args) {

/*
&& operatörü mükemmeliyetçidir.
tüm şartlar true ise sonuç true
şarlar dan bir tanesi  false ise sonuç false'dur.
 */

        /*
 OR || operatoru iyimserdir.
 tüm şartlar false ise sonuç false,
 şartlardan bir tanesi bile true ise sonuç true'dur.
 */

        int a = 10;
        int b = 15;
        System.out.println(a > b || b > 0); // True
        System.out.println(a <= b - 5 || a > b - 9); // True
        boolean c;
        System.out.println(c = 15 >= b || a < 0);  // True
        c = a >= b || 3 * a < 4 * b;
        System.out.println(c); // True

    }
}
