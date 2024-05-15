package day41_abstractClasses_Interfaces;

public class C02_javaCar extends C01_AbstractCar {
    @Override
    public void motor() {
        System.out.println("Java car Motor");

    }

    @Override
    public void yakit() {
        System.out.println("Java car yakit");

    }

    @Override
    public void sanzuman() {
        System.out.println("Java car sanzuman");
        // parent abstract class daki
        // abstract methodları child class'a
        //imlement (uyarlama)etmek zorundayız
    }

    public void sunroof() {
        // parent class daki concerete methodlar ise
        //child calss lar tarafından implement edilmek zorunda değildir.
        // child class isterse parent class daki concerte method u direk kullanır
        //isterse @override edip kendisine uyarlar

    }
}
