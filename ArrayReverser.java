package Zajęcia_2;

public class ArrayReverser {
    public static void main(String[] args) {
        // Podaj rozmiar tablicy:
        int size = 10;

        // Tworzenie tablicy
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i + 1;
        }

        // Wyświetlanie zawartości tablicy
        System.out.println("Zawartość tablicy:");
        displayArray(numbers);

        // Odwracanie zawartości tablicy
        int[] reversed = reverseArray(numbers);

        // Wyświetlanie zawartości odwróconej tablicy
        System.out.println("Zawartość odwróconej tablicy:");
        displayArray(reversed);
    }

    // Metoda służąca do wyświetlenia tablicy
    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Metoda służąca do odwrócenia tablicy
    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - i - 1];
        }
        return reversed;
    }
}