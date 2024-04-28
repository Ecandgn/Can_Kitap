package day32_dateTime_varargs;

public class C04_Varargs {

    public static void main(String[] args) {
         /* verlen farklı sayıları ilkki hariç geriye kalanları toplayıp
    ilk sayı ile bu toplamı çarpıp yazdıran bir method oluşturalım
     */

        islem(2);
        islem(2, 3, 4);
        islem(2, 3, 4, 5, 6, 7);
        islem(0, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    public static void islem(int ilkSayi, int... kalanSayilar) {
        int toplam = 0;
        for (int each : kalanSayilar) {
            toplam += each;
        }
        System.out.println("İşlem Sonucu:" + toplam + ilkSayi);
    }


}

