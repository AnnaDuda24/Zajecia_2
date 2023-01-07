package Zajęcia_2;

import java.awt.*;

public class RefTester {
    public static void main(String[] args) {

        String str1 = "jakiś tekst";

        //Sprawdzamy nazwę klasy:
        System.out.println(str1.getClass().getName());
        System.out.println(str1.getClass().getSimpleName());

        System.out.println();

        //Czy napis "Teksas" jest instancją klasy String?
        System.out.println("Teksas" instanceof String);

        System.out.println();

        //Czy "obj" jest instancją klasy Object?
        Object obj = new Object();
        System.out.println(obj instanceof Object);

        System.out.println();

        Point pt1, pt2;
        pt1 = new Point(100,100);
        pt2 = pt1; //mamy tylko jeden obiekt, mamy dwie referencje do tego samego obiektu

        pt1.x = 200;
        pt1.y = 200;

        System.out.println(pt1);
        System.out.println(pt2);







    }
}
