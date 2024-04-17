package day19_arrays;

import java.util.Arrays;

public class C02_ElementleriToplama {
    public static void main(String[] args) { // yazdıran dediği için void kullanıldı
        //verilen bir int array'daki tum elemntleri toplayıp yazdıracak bir method oluşturun

        int[] sayilar = {3, 4, 5, 6};
        elementToplamiYazdir(sayilar);
        int[] yeniArry = {3, 4, 5, 6, 8};
        sayilar = yeniArry; //Var olan bir arrye yeni bir element eklemeye çalışııy
        System.out.println("Sayılar arry=" + Arrays.toString(sayilar));
        elementToplamiYazdir(sayilar);
    }

    public static void elementToplamiYazdir(int[] arr) {

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];


        }
        System.out.println("Verilen arraydeki elementlerin toplamı=" + toplam);
    }

}
