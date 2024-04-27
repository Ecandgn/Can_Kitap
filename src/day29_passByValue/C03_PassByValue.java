package day29_passByValue;

public class C03_PassByValue {
    static  int sayi=50;
    public static void main(String[] args) {
        int sayi =10;
        // data türü yaparak deklarasyon sadece bir defa yapılabilinir.
        sayi =30;
        System.out.println(sayi);
method1();
method2(15);
    }
    public static void  method1(){
        int sayi =40;
        System.out.println(sayi);
    }
    public static void  method2(int sayi){
        sayi=20;
        System.out.println(sayi);
    }
}
