package day16_WhileLoop_doWhileloop;

public class C08_PozitifTamsayi {
    public static void main(String[] args) {
        /*
        While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
yazdirin.
         */
        int sayi = 10;
        int toplam = 0;
        while (sayi < 100) {
            if (sayi % 7 == 0) {
                System.out.print(sayi + " ");
            }
            sayi++;
        }
    }
}
