package day20_arrays_multiDimensionalArrays;

public class C01Arrays {
    public static void main(String[] args) {
        /*
        Verilen bir arrayde
        verilen min ve max değerler dahil olarak
        min ve max değerler arasındaki sayılari yazdıran bir method olusturun
         */
        int[] sayilar ={23, 45, 12, 78, 54, 1, 98};
        araliktakiSayilarıYazdir(sayilar,10,40);
        araliktakiSayilarıYazdir(sayilar,15,66);
        araliktakiSayilarıYazdir(sayilar,19,41);
    }

    public static void araliktakiSayilarıYazdir(int[] arr, int minDeger, int maxDeger) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= minDeger && arr[i] <= maxDeger)
                System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
