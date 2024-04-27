package day28_staticKeyword;

public class C0_example {
    static int sayi=20;
    int yas=40;
    static String okul="ITU";

    public C0_example(int a, int b,String c){
        this.sayi=a;
        this.yas=b;
        this.okul=c;
    }
    public static void method1(C0_example dnm){
        System.out.println("Sayi : "+dnm.sayi+
                ", yas: "+dnm.yas+
                ", okul: "+dnm.okul);
    }

    public static void main(String[] args) {
        C0_example obj1=new C0_example(20,30,"ODTU");
        C0_example obj2=new C0_example(15,25,"Marmara");
        method1(obj1);
        method1(obj2);
    }
}
