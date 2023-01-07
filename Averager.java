package Zajęcia_2;

public class Averager {
    public static void main(String[] arguments) {
        int sum = 0;

        if (arguments.length > 0) {
            for (int i = 0; i < arguments.length; i++) {
                sum += Integer.parseInt(arguments[i]);
            }
            System.out.println("Suma wynosi: " + sum);
            System.out.println("Średnia wynosi: " + (float) sum / arguments.length);
        }
    }
}
