package day39_inheritance_overriding;

public class C05_Child extends C04_Parent {
    public void method1() {
        // child class'da overriding method olusturmak icin
        // method ismi ve signature'i ayni olmalidir
    }

    public void method2(int sayi) {

    }

    @Override
    public int method3() {
        // overriding method'u intelliJ'e olusturtdugumuzda
        // @Override notasyonu kullanir
        // Bu notasyonun gorevi, parent class'daki overridden method'u takip edip
        // override etmeye mani olacak bir degisiklik olursa
        // CTE vermektir
        return 6;
    }

    public String method4() {
        // signature = method ismi + parametrelerin data turleri
        // access modifier method signature'ina dahil degildir
        // ama overridding icin access modifier'lar da onemlidir

        // overridding'de child class'daki method'un
        // access modifier'i parent class'dakinden
        // daha kisitlayici OLAMAZ
        return "Java";
    }

    private void method5() {
        // parent class da olsa
        //private access modifier i olan class üyleri
        // başka classlardan görülemeyeceği için
        //private method lar override edilemez
    }

    public static void method6() {
        // static methodlar da overriede edilemez
    }

    public void method71() {
        // overriedden method  is final
        // final olarak işaretlenen bir method
        //override edilemez
    }

    public void

    int method8() {
        //return type da signutere dahil değildir
        // ama overridding de önemlidir.
        //  parent class daki methodun return type
        //private data türleri void ise
        //overridding method un return type ı aynı olmalıdır.
        return 8;
    }

    public String method9() {
        /* eğer return type non-primitive ise
        chil class daki return type
        ya parent daki return type ile aynı olmalı
        yada parent daki return type in child i olabilir
        */
        return "Java";
    }

    public String method9() {
        // Eger return type non-primitive ise
        // child class'daki return type
        // ya parent'daki return type ile ayni olmali
        // ya da parent'daki return type'in child'i olabilir
        // Bu iliskiye co-variant data turu denir

        return "Java";
    }

    public void method10() {
        super.method10();
        // bizim mudahalemiz olmazsa
        // overridden method ve overridding method'dan
        // sadece biri calisir
        // Eger iki method'un da calismasini istersek
        // child class'daki method'da
        // parent class'daki method'u cagirabiliriz
    }


}
