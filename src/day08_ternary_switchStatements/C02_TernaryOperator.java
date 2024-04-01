package day08_ternary_switchStatements;

public class C02_TernaryOperator {
    public static void main(String[] args) {

        /*
        Veerilen bir sayının çift mi tek mi olduğunu yazdırın
         */
        int sayı = 40;
/*
        if (sayı%2==0){
            System.out.println("Sayı çift");
        }else
            System.out.println("Sayı Tek.");
*/
        System.out.println(sayı % 2 == 0 ? "Sayı çift" : "Sayı Tek");

        //verilen sayı 0 dan büyükse pozitif değilse pozitif değil yazdırın


        System.out.println(sayı > 0 ? "Pozitif Sayı" : "Pozitif değil");

        /*
        Sayı 10 dan büyükse sayının değerini 2 azaltın
        sayı 10 dan büyük değilse sayının değerini 5 artırın
         */
        sayı = sayı > 10 ? sayı - 2 : sayı + 5;
        System.out.println("Sayının yeni değeri:"+sayı);

    }
}
