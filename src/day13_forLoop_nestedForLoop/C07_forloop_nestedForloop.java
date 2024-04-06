package day13_forLoop_nestedForLoop;

public class C07_forloop_nestedForloop {
    public static void main(String[] args) {
        // for loop ile  1 2 3 4 yazdırın

        for (int i = 1; i <= 4; i++) {
            System.out.print(1 * i + " ");

        }
        System.out.println("");
        //for loop ile 2 4 6 8 yazdırın

        for (int i = 1; i <= 4; i++) {
            System.out.print(2 * i + " ");
        }
        System.out.println("");
// for loop ile 3 6 9 12 yazdırın
        for (int i = 1; i <= 4; i++) {
            System.out.print(4 * i + " ");

        }
        System.out.println("Dikdörtgen içinde konsol çıktısı for loop kullanabiliriz");
        for (int i = 1; i <=3 ; i++) { // outer for loop satırları kontrol eder
            for (int j = 1; j <=4 ; j++) { // inner for loop her satırdaki sutunları kontrol eder

                System.out.print(i*j+" ");
            }
            System.out.println("");
        }

    }

}
