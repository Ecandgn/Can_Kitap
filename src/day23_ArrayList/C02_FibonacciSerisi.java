package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_FibonacciSerisi {
    public static void main(String[] args) {
        /*Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
sayisini bir list olarak donduren bir method olusturun.
Fibonacci serisi : 0 1 1 2 3 5 8 13 21 34 55 89 144 233
                 */

        System.out.println(fibonacciSerisiOlusturma(-5));// []
        System.out.println(fibonacciSerisiOlusturma(0));// []
        System.out.println(fibonacciSerisiOlusturma(1));// [0]
        System.out.println(fibonacciSerisiOlusturma(2));
        System.out.println(fibonacciSerisiOlusturma(5));
        System.out.println(fibonacciSerisiOlusturma(15)); //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377]
        System.out.println(fibonacciSerisiOlusturma(10)); //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

    }

    public static List<Integer> fibonacciSerisiOlusturma(int sayiadeti) {
        List<Integer> fibonacciserisi = new ArrayList<>();
        if (sayiadeti <= 0) {
            System.out.println("Sayı adeti sıfırdan büyük olmalıdır.");

        } else if (sayiadeti == 1) {
            fibonacciserisi.add(0);

        } else if (sayiadeti == 2) {
            fibonacciserisi.add(1);
            fibonacciserisi.add(1);
        } else {
            fibonacciserisi.add(0);
            fibonacciserisi.add(1);
            for (int i = 2; i <sayiadeti ; i++) {
                fibonacciserisi.add(fibonacciserisi.get(i-2)+fibonacciserisi.get(i-1));
            }
        }

        return fibonacciserisi;


    }
}
