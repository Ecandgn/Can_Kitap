package day29_passByValue;

public class C01_StaticBlocks {
    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method çalıştı");
        C01_StaticBlocks obj=new C01_StaticBlocks();
    }
    public static void method1(){
        System.out.println("method çalıştı");

    }
    static {
        System.out.println("Static bloc çalıştı");
    }
}
