package Zajęcia_2;

import java.util.Locale;

public class TextFormat {
    public static void main(String[] args) {
        int accountBalance = 15005;
        System.out.printf("Saldo: %,d zł%n",accountBalance);
        //d - liczba dziesiętna, n - nowa linia

        //%[flags][width][.precision]conversion-character
        //s - strings
        //d - decimal integers
        //f - floating points numbers
        //t - date/time
        // - new line
        //bB - booleans
        System.out.println();
        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.11f%n",pi);

        //Jeżeli zależy nam na pisowni z kropką jak w US:
        System.out.printf(new Locale("us"), "%.11f%n", pi);
    }
}
