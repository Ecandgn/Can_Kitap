package day21_MultiDimensionalArrays;

public class C04_SonElementlerinToplami {
    public static void main(String[] args) {
        /*
        Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
toplaminini yazdiran bir method olusturun.
         */
        int[][] ecd = {{3, 6}, {1, 6, 9}, {8, 0, 2, 1},{1,5}, {4}};
        sonelementlertopl(ecd);

    }

    public static void sonelementlertopl(int[][] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i][arr[i].length - 1];

        }
        System.out.println("Son elemntlerin toplmi: " + toplam);
    }
}
