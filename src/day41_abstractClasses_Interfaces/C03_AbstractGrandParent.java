package day41_abstractClasses_Interfaces;

public abstract class C03_AbstractGrandParent {

    //abstract methodlar sadece abstract yapılar içinde bulunabilir
    //concerte class ların içinde abstract method olmaz

    public abstract void method1();

    public abstract int method2();

    public void method3() {
        System.out.println("GP method3");
    }

    public int method4() {
        return 2;
    }

}
