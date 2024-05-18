package day42_interfaces;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class F_ChildOfClassVeInterfaces extends E_ParentClass implements A_ParentInterface01, D_ParentInterface03 {


    @Override
    public int method3() {
        return 0;
    }

    @Override
    public String method4() {
        return null;
    }
    /*
    birden fazla parent edilen bir class
    parent abstraact yapılarda bulunan
    concete leştirilmemiş tüm abstractr methodları
    kendisine uyarlamak zorundadır.

    bu örnekte method1 ve method2
    parentClass da concrete olarak bulunduğundan
    implement etme zorunluluğu yoktur.
     */
    public static void main(String[] args) {
       // System.out.println(SAYI);
        System.out.println(A_ParentInterface01.SAYI);
        System.out.println(D_ParentInterface03.SAYI);
        System.out.println(E_ParentClass.SAYI);

       //  A_ParentInterface01.SAYI=45; atama yapılmaz
        //Interface lerdeki tüm variablar final olduğundan sonradan değer atanamaz

        E_ParentClass.SAYI=44;
        System.out.println(E_ParentClass.SAYI);
        /*
        Birden fazla parent da aynı isimde variable olursa
        parent ismi ile birlikte yazarak
        istediğimizi kullanabiliriz
         */
    }
}
