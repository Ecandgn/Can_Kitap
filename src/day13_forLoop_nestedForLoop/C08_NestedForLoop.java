package day13_forLoop_nestedForLoop;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        /*
        Nested for loop kullanarak aşağıdaki tabloyu yazdırın
        2 3 4 5 6
        3 4 5 6 7
        4 5 6 7 8
        5 6 7 8 9

         */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((i + j + " "));
            }
            System.out.println("");
        }
    }
}
