package day16_WhileLoop_doWhileloop;

import java.util.Scanner;

public class C09_PozitifTamToplami {
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
        int toplam = 0;
        int flag = 0;
        int sayi = 10;
        while (sayi != 0) {
            System.out.print("Lütfen toplanmak uzere pozitif tamsayilar girin bitirmek istediginde 0 (Sıfır) 'a basiniz : ");
            sayi = scan.nextInt();
            if (sayi > 0) {
                flag++;
                toplam += sayi;
            } else if (sayi < 0) {
                System.out.println(" Negatif sayi kullanamazsiniz ");
            }
        }
        System.out.println("Girilen pozitif Tamsayı adeti : " + flag + "\nPozitif tamsayıların toplamı : " + toplam);
        }

    }


