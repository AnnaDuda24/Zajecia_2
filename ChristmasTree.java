package Zajęcia_2;

import java.util.Random;
public class ChristmasTree {
    public static void main(String[] args) {

        int height = 18;

        if (args.length > 0) {
            height = Integer.parseInt(args[0]);
        }

        Random random = new Random();

        char[] characters = {'+', '.', '*', '~', '^', 'o'};

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print(characters[random.nextInt(characters.length)]);
            }

            System.out.println();
        }
    }
}