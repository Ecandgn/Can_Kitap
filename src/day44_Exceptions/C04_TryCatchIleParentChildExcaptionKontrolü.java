package day44_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_TryCatchIleParentChildExcaptionKontrolü {
    public static void main(String[] args) {

        // tektry multiple catch yapalım


        try {
            // deneme.txt dosyasındaki bilgilere ulaşalım
            String dosyaYolu = "src/day44_Exceptions/deneme.txt";
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            // dosyadaki yazıları konsıolda yazdırın

            int k = 0;
            while ((k = fileInputStream.read()) != (-1)) {

                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu hatalı");
        } catch (IOException e) {
            System.out.println("Dosya Input/Output sorunu var");
        }

        // tek try - kapsamlı tek catch
    }
}
