package day16_WhileLoop_doWhileloop;

public class C05_WhileVeDoWhile {
    public static void main(String[] args) {
        int sayi = 20;
        while (sayi < 10) {
            System.out.println("Do-While Loop body'si çalıştı");
        }
        do {
            System.out.println("Do- wihle loop body'si bir defa çalışrı");
            sayi--;
        } while (sayi < 10);

        //ilk değer kontrol edilmeden önce//loop body'si bir kere çalıştı
        // bu durumda ilk değer uygum olmasa bile
        // Loop body'si 1 kere çalışmış olur
    }
}
