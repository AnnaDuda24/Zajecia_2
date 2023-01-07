package Zajęcia_2;

import java.math.BigInteger;
public class Chessboard {
    public static void main (String []args) {
        int n = 1;
        BigInteger sum = new BigInteger(""+1);
        while(n <= 64) {
            sum = sum.add(sum);
            n++;
        }
        System.out.println("Suma wszystkich ziaren na szachownicy to: " + sum);
    }
}

