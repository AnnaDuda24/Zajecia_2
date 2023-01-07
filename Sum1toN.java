package Zajęcia_2;

import java.util.Scanner;

//Wypisz sumę liczb od 1 do n
public class Sum1toN {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner scanner = new Scanner(System.in); //in - chcę wprowadzać dane z klawiatury za pomocą konsoli
        int n = scanner.nextInt();
        int number = 1;
        int sum = 1;

        System.out.print("Suma 1");
        while (number <n ) {
            number++;
            sum += number;
            System.out.print(" + " + number);
        }
        System.out.println(" = " + sum);
    }
}
