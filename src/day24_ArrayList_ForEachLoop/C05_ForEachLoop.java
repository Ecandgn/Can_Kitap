package day24_ArrayList_ForEsachLoop;

public class C05_ForEachLoop {
    public static void main(String[] args) {
        /*
        verilen int array’deki her elementin karelerini alip, karelerinin toplamini
yazdiran bir method olusturun.
         */
        int[] arr = {3, 2, 4, 1};
        karelerintoplami(arr);
    }

    public static void karelerintoplami(int sayilar[]) {
        int toplam = 0;
        for (int each : sayilar) {
            toplam += each * each;
        }
        System.out.println("Arraydeki sayıların kareleri toplamı: " + toplam);
    }
}
