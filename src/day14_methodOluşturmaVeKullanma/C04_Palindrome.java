package day14_methodOluşturmaVeKullanma;

public class C04_Palindrome {
    public static void main(String[] args) {
        /*verilen metin polidrom ise tru
        polidrom değilse false donduren bir method oluşturun
         */

        System.out.println(isPalidrome("Ey edip adanada pide ye"));
        System.out.println(isPalidrome("Sanane"));
    }

    public static boolean isPalidrome(String metin) {
        String tersMetin = "";
        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);

        }
        if (metin.equalsIgnoreCase(tersMetin)) {
            return true;
        } else {
            return false;
        }

    }

}
