package day13_forLoop_nestedForLoop;

import java.util.Scanner;

public class C10_NestedForLoop {
    public static void main(String[] args) {
        /*
        Nested ile aşağıdaki şekli oluşturun
        *
        **
        ***
        ****
        *****
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
