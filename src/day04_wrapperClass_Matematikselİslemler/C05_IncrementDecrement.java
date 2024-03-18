package day04_wrapperClass_Matematikselİslemler;

public class C05_IncrementDecrement {
    public static void main(String[] args) {
        int sayi = 15;
        sayi = sayi + 3;
        System.out.println(sayi);   // 18
        sayi += 5;
        System.out.println(sayi);   // 23
        sayi = +5;
        System.out.println(sayi);   // 5
        sayi++;
        System.out.println(sayi); // 6
        ++sayi;
        System.out.println(sayi); //7

        int artis = 30;
        sayi += artis;
        System.out.println(sayi); // 35
        sayi *= artis;
        System.out.println(sayi);   // 1050

        int say = 10;
        say++;
        System.out.println(say); //11

        --say;
        System.out.println(say); //10

        say = 10;
        System.out.println(--say);  //9

        say = 10;
        System.out.println(say++); //10
        System.out.println(say);    //11




    }
}
