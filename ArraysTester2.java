package Zajęcia_2;

import java.awt.*;

public class ArraysTester2 {

    public static void main(String[] args) {
        Point[] markups = {new Point(1,5), new Point(0,3), new Point(1,1)};
        String[] titles = {"Pan", "Pani", "Państwo", "Panna", "Doktor"};

        Point p = new Point(100,100);
        markups[0] = p;
        markups[1] = markups[0];
        markups[2] = markups[1];

        System.out.println(markups[0]);
        System.out.println(markups[1]);
        System.out.println(markups[2]);

        p.x = 200;
        System.out.println();

        System.out.println(markups[0]);
        System.out.println(markups[1]);
        System.out.println(markups[2]);
    }

}
