package day19_arrays;

public class C04_TEkveCiftUzunluktakiKelimeleriSay {
    public static void main(String[] args) {
        /*
        verilen bir string arraydaki
        her bir kelimeyi kontrol edip
        array de kaç tane tek sayı uzunluğunda
        kaç tane çift sayı uzunluğunda kelime bulundupunu yazdıran bir method oluşturun.
         */
        String[] ismler = {"Meltem", "Seren", "Ali", "Ahmet", "Semih","Merve","Zam","Veli"};
        kelimeSayilariniYazdir(ismler);
    }

    public static void kelimeSayilariniYazdir(String[] arr) {
        int tekSayiAdeti = 0;
        int ciftSayiAdeti = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() % 2 == 0) {
                ciftSayiAdeti++;
            } else {
                tekSayiAdeti++;
            }
        }
        System.out.println("array'de \t" + tekSayiAdeti + " adet uzunluğu tek olan kelime\n" +
                ciftSayiAdeti+" adet uzunluğu çift sayı olan kelimeler var");
    }
}
