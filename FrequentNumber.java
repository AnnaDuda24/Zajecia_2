package Zajęcia_2;

public class FrequentNumber {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 4, 4, 4, 7, 4, 7, 1};
        int[] counters = new int[10];

        for (int i = 0; i < arr.length; i++) {
            counters[arr[i]]++;
        }

        int mostFrequent = 0;
        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequent]) {
                mostFrequent = i;

            }
        }
        System.out.print("Najczęściej występującą cyfrą jest " + mostFrequent);
        System.out.print(". Wystąpiła " + counters[mostFrequent] + " razy.");
    }
}
