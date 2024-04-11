package day15_methodOverLoading;

public class C02_MethodOverLoading {
    public static void main(String[] args) {
/*
Bit class'da overloading varsa o method çağrıldığından java hangi methodun çalışacağına
        aşağıdaki 3 adımda karar verir
    */
        toplama('a', 'b'); //toplam char char
       //  toplama("Ali", 5);
        toplama(3.4f,6); // en az casting işlemi papacağını kullanır. yani double int methodunu kullanır.
    toplama(3.4f ,6);
    }

    public static void toplama(int a, int b) {
        System.out.println("İki integer toplamı : " + (a + b));
    }

    public static void toplama(double a, int b) {
        System.out.println("double ve int  toplamı : " + (a + b));
    }

    public static void toplama(double a, double b) {
        System.out.println("double ve double  toplamı : " + (a + b));
    }
}

