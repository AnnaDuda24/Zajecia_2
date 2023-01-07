package Zajęcia_2;

public class Matrix {
    public static void main(String[] args) {

        int n = 2;
        System.out.println("n = " + n + " matrix");
        System.out.println("------------");


        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%3s",i + j + " "); //%3s - stała szerokość odstępów
            }
            System.out.println();
        }
    }

}
