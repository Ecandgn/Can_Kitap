package day19_arrays;

public class C05_ElemanArama {
    public static void main(String[] args) {
        /*
        Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
kullanildigini yazdiran bir method olusturun.
         */
        int[] arr = {3, 5, 4, 85, 5, 44, 4, 54, 858, 574, 8, 7, 85, 7, 8};
        elemanVarmi(arr, 0);
    }

    public static void elemanVarmi(int[] arr, int aranansayi) {
        int bulunanAdet = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == aranansayi) {
                bulunanAdet++;
            }
        }
        if (bulunanAdet == 0) {
            System.out.println("Aranan eleman array'de yok");
        } else {
            System.out.println("Aranan sayi array'de" + bulunanAdet + " adet kullanılmıştır.");
        }


    }
}
