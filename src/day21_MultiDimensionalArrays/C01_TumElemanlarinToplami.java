package day21_MultiDimensionalArrays;

public class C01_TumElemanlarinToplami {
    public static void main(String[] args) {
      /*
      Verilen iki katlı integer bir array deki
      tüm sayilarin toplamını yazdıran bir method oluşturun
       */

        int[][] arr={{3,6},{1,6,9},{8,0,2,1},{4}};
        elemanlarinToplaminiYazdir(arr);
    }
    public static void elemanlarinToplaminiYazdir(int[][] arr){
        /*
        Eğer şart olmaksızın
        2 katlı arraydeki tüm elementlere ulaşmak isterseniz
        2 katlı nested bir loop oluşturmalıyız
         */
int toplam=0;
        for (int i = 0; i < arr.length; i++) { // outer arr'yi kontrol eder
            for (int j = 0; j < arr[i].length; j++) { // herbir inner array'i kontrol eder
                toplam+=arr[i][j];


            }

        }
        System.out.println("Verilen arraydeki elemntlerin toplamı: "+toplam);
    }
}
