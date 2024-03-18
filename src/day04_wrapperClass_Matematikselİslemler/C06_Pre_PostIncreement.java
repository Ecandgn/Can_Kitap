package day04_wrapperClass_Matematikselİslemler;

public class C06_Pre_PostIncreement {
    public static void main(String[] args) {
        // a değerini oluşturun bir b veriable ına atayın
        // sonra a nın değerini 1 arttırın

        int a = 20;
        int b = a;
        a++;
        System.out.println("a: " + a + ",b : " + b); // a:21, b=20

        int d = 10;
        int e = d++;
        System.out.println("d =" + d); //11
        System.out.println("e =" + e); //10

        int c = 10;
        int s = ++c;
        System.out.println("c =" + c); //11
        System.out.println("s =" + s); //11

        int t = 10;
        System.out.println(t++); //10
        System.out.println(t); //11
        int l = 10;
        System.out.println(++l); //11


    }
}
