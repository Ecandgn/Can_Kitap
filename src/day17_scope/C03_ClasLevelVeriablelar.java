package day17_scope;

public class C03_ClasLevelVeriablelar {
   /*
   1- class level variable'ları scope'u BUTUN CLASS'dır. ancak
   class level variable'larda method içerisinde direk kullanılıp
    kullanılmaması static keyword'u etkilidir.(statiğe üye ise heryerde kullanılabilinir)
   2-Variable static olarak işaretlenmişse her yerde  direk kullanılabilir
   ama variable static değilse(Instance) static methodlarda kullanılamaz
    3- static keybord'u methodlar içinde kullanılır
    static methodlar bünyelerine static olmayan variable ve methodları kabul etmazler
    4- class level variablerde değer atanmadan oluşturulabilir ve kullanılabilir
    eğer biz değer atamadan variable kullanılırsa java variable a DEFAULT değer ataması yapar
    boolen ==>false
    char==>''(Hiçlik)
    byte,short,int,long,float,double==>0
    non-primitave için==>null
    */

    int sayi1;
    int sayi2 = 20;
    static String str1;
    static String str2 = "Java";

    public static void main(String[] args) { // methodlarda variable gibi static ise static methodda kullanılabilinir
      //  System.out.println(sayi1);
      //  System.out.println(sayi2);
        System.out.println(str1);
        System.out.println(str2);
        method1();
      //  method2();
    }

    public static void method1() {
    //    System.out.println(sayi1);
    //    System.out.println(sayi2);
        System.out.println(str1);
        System.out.println(str2);
    //    method2();
    }

    public void method2() {
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(str1);
        System.out.println(str2);
        method1();
    }
}