package day12_stringMAnipulations_fotloop;

public class C01_StringdenSayıToplama {
    /*
    Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
input1 : “15.30 €” , input2 : “11.40 €”
output : 26.70 €
     */

    public static void main(String[] args) {
        String fiyatstr1 = "15.30 €";
        String fiyatstr2 = "11.40 €";
        System.out.println(fiyatstr1 + fiyatstr2);

        fiyatstr1 = fiyatstr1.replaceAll("\\D", "");
        fiyatstr2 = fiyatstr2.replaceAll("\\D", "");
        System.out.println(fiyatstr1 + fiyatstr2);

        System.out.println("Verilen Fiyatların Toplamı..." + (Double.parseDouble(fiyatstr1)
                + Double.parseDouble(fiyatstr2)) / 100 + "€");

    }


}
