package day41_abstractClasses_Interfaces;

public class C05_ConcereteChildClass extends C04_AbstractParent {

    @Override
    public int method2() {
        return 10;
    }

    @Override
    public void method5() {
        System.out.println("Child Method5");

    }
    /* Abstract silsileden sonra gelen İLK concrete class
    parent class larda concerete olmayan /concrete yapılmayan
    tüm abstract methodları uyarlamak zorundadır.
     */

}
