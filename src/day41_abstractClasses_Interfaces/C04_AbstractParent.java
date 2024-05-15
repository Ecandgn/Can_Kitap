package day41_abstractClasses_Interfaces;

public abstract class C04_AbstractParent extends C03_AbstractGrandParent {
// bir class abstract yapıldığında
    //child classlaarı bazı methodları uyarlamaya
    //zorunlu kılmak için oluşturulur
    //bir abstract class parent i olan abstract claslardaki
    //abstract methodları kendisine uyarlamak zorunda değildir.
    //isterse kendisine uyarlamadan yeni conceret veyqa abstravt methodlar ekleyebilir

    public void method1() {
        System.out.println("Parent method1");

    }

    public abstract void method5();

    public int method6() {

        return 0;
    }

}
