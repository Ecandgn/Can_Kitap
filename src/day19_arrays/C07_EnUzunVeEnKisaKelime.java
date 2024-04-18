package day19_arrays;

public class C07_EnUzunVeEnKisaKelime {
    public static void main(String[] args) {
        /*
        Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
olusturun.
         */

        String[] isimler = {"Meltem", "Seren", "Emrah", "Ali", "Semih","Can","merve","Simay"};
enUzunveEnkısaKelime(isimler);
    }

    public static void enUzunveEnkısaKelime(String[] kelime) {
        String enuzunkelime = kelime[0];
        String enKisaKelime = kelime[0];
        for (int i = 0; i < kelime.length; i++) {
            if (kelime[i].length()>enuzunkelime.length()){
                enKisaKelime=kelime[i];
            }else if (kelime[i].length()<enKisaKelime.length()){
                enKisaKelime=kelime[i];
            }
        }
        System.out.println("En uzun kelime :"+enuzunkelime);
        System.out.println("En kısa kelime :"+enKisaKelime);
    }
}
