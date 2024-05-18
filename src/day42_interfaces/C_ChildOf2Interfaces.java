package day42_interfaces;

public class C_ChildOf2Interfaces implements B_ParentInterface02 {

    // parent i olan tum abstract yapılardaki
    //concrete olmayan method ları
    //implement etmek zorundadır.

    public void method1() {

    }

    public String method2() {
        return null;
    }

    public String method3() {
        // bir class birden fazla parent edinirse
        // (bir classve/veya istediği kadar interface)
        // ve bu parentlardaki aynı isimde olan methodlar varsa
        //-parent class lardaki aynı isimde olan methodların
        //return typeları aynı ise sorun olmaz
        //-return type ları farklı ise iki parent i da mutlu etme şansı olmadığından
        //ya parentlerden birinden vazgeçmelisiniz
        //ya da parenlarda değişiklik yapmalısınız.

        // parent edinilen interface lerde değişiklik yapmak
        // o interface i daha önce implement eden pek çok class da
        //değişikliklere sebep olacağından
        //ZORUNLU kalmadıkça tercih edilmez
        //yani iki parentten birini seçmeliyiz.
        return null;
    }

    public int method4() {
        return 8;
    }

}
