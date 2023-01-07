package Zajęcia_2;

import java.math.BigInteger;

public class Loops3 {
    public static void main(String[] args) {

/*        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);*/

/*            //Pętla nieskończona:

            for (;;) {
                System.out.println("pętla nieskończona");
            }*/

/*        //Wszystkie cyfry
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", i);
        }

        System.out.println();

        //Silnia
        int number = 5;
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.printf("%d! = %s%n", number, factorial);

        //Wartość poszczególnych bitów w bajcie
        //126 64 32 16 8 4 2 1
        // 0   0  0  0 0 0 0 0
        System.out.println();
        for (int i = 1, sum = 1; i < 128; i = i * 2, sum += i) {
            System.out.printf("i = %d, sum = %d%n", i, sum);

        }*/

        //Pętla WHILE

/*        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i++;
        }*/

        //Pętla DO WHILE

/*        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 100);*/

/*        for (int i = 1; i < 10; i++) {

            if (i % 2 == 1){
                continue;
            }

            System.out.print(i);
            System.out.print(" ");

        }*/

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.println(i + " " + j);
            }

        }
    }
}
