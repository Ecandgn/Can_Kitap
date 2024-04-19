package day21_MultiDimensionalArrays;

public class C03_InnerArraylerinIlkElemanlariniTopla {
    public static void main(String[] args) {
        /*
        Verilen 2 katlı bir array de her bir inner arraydeki 0. index'de bulunan sayilarin toplayıp
        sonucu yazdıran bir method oluşturun
         */
    int [][] ecd={{3,6},{1,6,9},{8,0,2,1},{4}};
ilkElemanlarinToplami(ecd);
    }
    public static void ilkElemanlarinToplami(int[][] arr){
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i][0];
        }
        System.out.println("İlk elemanlarin toplami: "+toplam);
    }

}
