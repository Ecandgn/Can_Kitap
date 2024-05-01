package day37_Inheritance;

public class C02_GParent {
    C02_GParent() {
        System.out.println("Gparent Parametresiz cons ");
    }


    C02_GParent(double c){
        this(); // yazdığımız clasda paremetresiz cons git diyor
        c= 5;
        System.out.println(c);
    }
}
