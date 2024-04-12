package day16_WhileLoop_doWhileloop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
istediginde 0'a basmasini soyleyin
Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
bunlarin toplaminin kac oldugunu yazdirin
Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
negatif sayiyi sayi adedine ve toplama eklemeyin
         */
        Scanner scan = new Scanner(System.in);
        int sayi;
        int sayiToplami = 0;
        int sayiadeti = 10;
        do {
            System.out.print("Lütfen toplanmak uzere pozitif tamsayilar girin bitirmek istediginde 0 (Sıfır) 'a basiniz : ");
            sayi = scan.nextInt();
            if (sayi > 0) {
                sayiadeti++;
                sayiToplami += sayi;
            } else if (sayi < 0) {
                System.out.println(" Negatif sayi kullanamazsiniz ");
            }
        }while (sayi !=0);
        System.out.println("Girilen pozitif Tamsayı adeti : " + sayiadeti + "\nPozitif tamsayıların toplamı : " + sayiToplami);
    }

}