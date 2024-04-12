package day17_scope;

public class C02_LocalVariables {
    /*
    1-Local variable'larda bir kod bloğunun içinde oluşturulur
    ve scoper'u içerisinde oluşturulduğu kod bloğudur. başka bir yerde kullanılmaz.
    2- Local vcariable lar değer atamadan deklare edilebilinir ama değer atamadan kullanılamaz
    3- Local variable'lar static olarak tanımlanamazlar.
    4- bit loop'un içinde kullanılan variable, loop'un dışında kullanılmaz
     */
    public static void main(String[] args) {
        int sayi;
        String s;
        // int c= 2*sayi; sayi değeri atanmadığı için kullnılamaz
        //static int d = 20; // Modifer stativ kullanılmaz
sayi=10;
        for (int i = 0; i < sayi; i++) {
            System.out.println(sayi);
            sayi--;
        }
    }
}
