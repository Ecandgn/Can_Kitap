package day17_scope;

public class C01_Scope {
    int a=20;
    static String b;

    public static void main(String[] args) {
        int sayi = 10;
        //System.out.println(sayi);
        //System.out.println(a);
        //System.out.println(b);
    }


    public static void method1() {
        //System.out.println(sayi);
    }

    public void method2() {

    }
}
