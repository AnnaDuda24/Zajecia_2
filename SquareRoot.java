package Zajęcia_2;

import java.lang.Math;

class SquareRoot {
    public static void main(String[] args) {

        double number = Double.parseDouble(args[0]);

        double squareRoot = Math.sqrt(number);

        System.out.println("Pierwiastek kwadratowy z liczby " + number + " to " + squareRoot);

/*      Aby otworzyć program z wiersza poleceń piszemy:
        javac SquareRoot.java
        java SquareRoot NUMBER
        i zastępujemy NUMBER liczbą*/

    }
}
