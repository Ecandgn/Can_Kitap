package day28_staticKeyword;

public class C0_Deneme {
    static int sayi = 20;
    int yas = 40;

    public C0_Deneme() {
        sayi++;
        yas = 10;
    }

    public static int method1() {
        return 2 * sayi;
    }

    public static void main(String[] args) {
        C0_Deneme obj1 = new C0_Deneme();
        C0_Deneme obj2 = new C0_Deneme();
        int sonuc = obj2.method1();
        System.out.println(obj2.yas + "," + obj2.sayi+","+sonuc);
    }
}
