package day41_abstractClasses_Interfaces;

public abstract class C01_AbstractCar {
    /*
    Bu class'ı car üretmek isteyen tüm markaların
    kendilerine uyarlaması gereken methodları belirlemek için oluşturduk
    -motoru mecbur yapalım
     */

    public abstract void motor(); // soyut methodun bady si olmaz

    // sunroof mecbur değiliz isteğe bağlı
    public void sunroof() {
        // chil class ları kendisine uyarlama konusuda
        // serbest bırakmak istediğimiz methodları
        // conceret (abstract olmayan) method olarak oluştururuz
    }

    // yakıt zorunlu olmalıdır.
    public abstract void yakit(); // bu bir method ama kural belirleyen bir methoddur sonuç üreten bir method değildir.
    // yani abstract method lar concret methodlar gibi
    //bir işlem yapmak üzere değil
    // child class ları uyarlamaya mecbur etmek için kullanılır
    //standart olan yazılar gibidir.
    // örneğin yakıt methodu "Bir aracın car olabilmesi için yakıt methodu olması zorunludur."
    // anlamına gelir

    // geri görüş kamerasi zorunlu değil
    public void gerigoruskamerasi(){

    }
    // sanziman duz vites otomatik vites zorunlu
    public abstract void sanzuman();

}
