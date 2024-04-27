package day29_passByValue;

public class C01_StaticBlocks {
    /*
    static bloklar tüm methodlar ve kod bloklarıından önce çalışır
    (Main method dan bile önce çalışır)
    class çalışmaya başlamadan yapılması gereken
     herhangi bir işlem varsa static bloc'lar kullanılabilinir.
     - eğer birden fazla static blok varsa üstteki daha önce çalışır
     */
    C01_StaticBlocks(){

        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method çalıştı");
        C01_StaticBlocks obj=new C01_StaticBlocks();
    }
    public static void method1(){
        System.out.println("method1 çalıştı");

    }
    static {
        System.out.println("Static bloc çalıştı");
    }
    static {
        System.out.println("Static blok1 çalıştı");
    }
}
