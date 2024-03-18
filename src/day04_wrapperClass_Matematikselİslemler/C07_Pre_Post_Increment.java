package day04_wrapperClass_Matematikselİslemler;

public class C07_Pre_Post_Increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a nın değeri =" + ++a); //11

        int b = a++;
        System.out.println("b nın değeri : " + b); //11
        System.out.println("a nın değeri : " + a); //12

        int c = b++ + a;
        System.out.println("c değeri ;" + c); //23
        System.out.println("b değeri ; " + b); //12
        System.out.println("a değeri : " + a); //12

        int s = 10;
        int e = ++s;
        System.out.println("s : " + s++ + ", e : " + e); //s : 11,e : 1
        System.out.println("s değeri : "+ s); //12

    }
}
