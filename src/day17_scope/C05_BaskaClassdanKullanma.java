package day17_scope;

public class C05_BaskaClassdanKullanma {
    public static void main(String[] args) {
        /*
        Methodlar ve class level variable'lar
        başka class'lardan da kullanılabilir
        Static variable ve methodlara başka class dan uluşmak için
        classIsmi.classUyesiIsmi kullanılır
        bu şekilde kullanıma static yontem denir
        Instance variablerları başka class dan kullanmak için
        Instance variable in olduğu class dan bir obje oluşturulmalıdır.

         */
        System.out.println(C04_StaticVariablesVsInstanceVariables.bashekimIsmi);
        C04_StaticVariablesVsInstanceVariables personel=new C04_StaticVariablesVsInstanceVariables(); //Instance variable in olduğu class dan bir obje oluşturulmalıdır.
        System.out.println(personel.perAdresi);
        System.out.println(personel.bashekimIsmi); //static bir üyeye obje üzerinden ulaşmak isterseniz java otomatik olarak getirmez monuel olarak yazabiliriz.


     }
}
