package day41_abstractClasses_Interfaces;

public class C02_javaCar extends C01_AbstractCar {
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public void sanzuman() {
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
