package day41_abstractClasses_Interfaces;

public class C06_ConcreteGrandChild extends C05_ConcereteChildClass {
    //parent class olan C05 de
    //bütün abstract methodlar concrete leştiği için
    //C06 nın hiç bir mecburiueti kalmaz
    // normal inheritance kuralları çerçevesinde
    //method ları kullanılır

    public void method3() {
        System.out.println("GC method3");
    }

    public int method6() {
        return 20;
    }

    public static void main(String[] args) {


        C06_ConcreteGrandChild gc1 = new C06_ConcreteGrandChild();
        //data türü ve cons aynı C06 ya git ilk bulduğunu kullan

        gc1.method1();
        System.out.println(gc1.method2());

        gc1.method3();
        System.out.println(gc1.method4());
        gc1.method5();
        System.out.println(gc1.method6());


        C04_AbstractParent gc2 = new C06_ConcreteGrandChild();
        // data türü ve cons farklı
        // C04 e git bulursan C06 ya kadar güncel ara

        gc2.method1();
        System.out.println(gc2.method2());
        gc2.method3();
        System.out.println(gc2.method4());
        gc2.method5();
        System.out.println(gc2.method6());


        C05_ConcereteChildClass cc1 = new C05_ConcereteChildClass();
        // data türü ve cons aynı
        // C05 e git ilk bulduğunu kullan

        cc1.method1();
        System.out.println(cc1.method2());
        cc1.method3();
        System.out.println(cc1.method4());
        cc1.method5();
        System.out.println(cc1.method6());


        C03_AbstractGrandParent cc2 = new C05_ConcereteChildClass();
        // data türü ve cons farklı
        // C03 e git  ilk bulduğunu kullan

        cc2.method1();
        System.out.println(cc2.method2());
        cc2.method3();
        System.out.println(cc2.method4());
        // cc2.method5(); // CTE C03 de yok
        // System.out.println(cc2.method6()); // CTE C03 de yok









    }

}
