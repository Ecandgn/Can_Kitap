package day21_MultiDimensionalArrays;

public class C02_CiftSayilarinToplami {
    /*
    Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
method olusturun.
     */
    public static void main(String[] args) {
        int[][] arr={{3,6},{1,6,9},{8,0,2,1},{4}};
        ciftSayilarinTopla(arr);
    }
    public static void ciftSayilarinTopla(int[][] arr){
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    toplam+=arr[i][j];
                }
            }
        }
        System.out.println("Arraydeki Çift sayilarin toplami="+toplam);
    }
}
