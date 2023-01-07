package Zajęcia_2;

import java.awt.*;

public class ArraysTester {
    public static void main(String[] args) {
        String[] requests;
        Point[] points;
        float[] donations;

        int[] tmp = new int[99];
        tmp[0] = 1;
        tmp[1] = 5;
        tmp[2] = 7;
        //tmp[100] = 100 - kompilator wyłapie to jako błąd, bo zakres tablicy to 0-98
        System.out.println(tmp[1]);
        System.out.println("Ilość elementów tablicy: " + tmp.length);

        int[] n = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(n[5]);
    }
}
