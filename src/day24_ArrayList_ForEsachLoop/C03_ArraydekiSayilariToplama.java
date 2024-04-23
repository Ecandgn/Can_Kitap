package day24_ArrayList_ForEsachLoop;

public class C03_ArraydekiSayilariToplama {
    public static void main(String[] args) {
        /*
        verilen int bir arraydeki
        tüm tek sayılari toplayip yazdırın
         */
        int[] sayilar = {3, 5, 6, 74, 85, 4};
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] % 2 != 0) {
                toplam += sayilar[i];
            }
        }
        System.out.println(toplam); //93

        toplam = 0;
        for (int each : sayilar) {
            if (each % 2 != 0) {
                toplam += each ;
            }
        }
        System.out.println(toplam); //93
    }

}
