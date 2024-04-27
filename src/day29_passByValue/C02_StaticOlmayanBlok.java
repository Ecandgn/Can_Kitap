package day29_passByValue;

public class C02_StaticOlmayanBlok {
    /*
    static olmayan bloklar constructor dan önce çalışırı
    ve (varsa) obje oluşturulmadan önce yapılması gereken ayarları yapar
     */
    C02_StaticOlmayanBlok() {
        System.out.println("Constructor Çalıştı");
    }

    C02_StaticOlmayanBlok(int sayi) {
        System.out.println("Parametreli constructor çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("Main method çalıştı");

        C02_StaticOlmayanBlok obj1 = new C02_StaticOlmayanBlok();
        System.out.println("obj1 oluşturuldu");


        C02_StaticOlmayanBlok obj2 = new C02_StaticOlmayanBlok(5);
        System.out.println("obj2 oluşturuldu");
    }

    {
        System.out.println("static olmayan blok çalıştı");
    }
}
