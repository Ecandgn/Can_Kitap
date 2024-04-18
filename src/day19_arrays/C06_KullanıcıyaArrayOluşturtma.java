package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullanıcıyaArrayOluşturtma {
    public static void main(String[] args) {
        /*
        Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
donduren bir method olusturun.
         */
        System.out.println(Arrays.toString(arrOlustur()));
    }
    public static int[]arrOlustur(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Arrayin kaç elemanlı olacağını giriniz....");
        int length= scan.nextInt();

        int[]arr=new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+". indeksindeki eleman için bir değer giriniz...");
            arr[i]=scan.nextInt();
        }
        return arr;
    }
}
