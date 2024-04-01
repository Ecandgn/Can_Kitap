package day29_passByValue;

public class C02_StaticOlmayanBlok {
    C02_StaticOlmayanBlok(){
        System.out.println("Constructor Çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("Main method çalıştı");

        C02_StaticOlmayanBlok obj1= new C02_StaticOlmayanBlok();
        System.out.println("obj1 çalıştı");

        C02_StaticOlmayanBlok obj2=new C02_StaticOlmayanBlok();
        System.out.println("obj2 oluşturuldu");
    }
    {
        System.out.println("static olmayan blok çalıştı");
    }
}
