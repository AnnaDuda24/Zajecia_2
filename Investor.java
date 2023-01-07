package Zajęcia_2;

public class Investor {
    public static void main(String[] args) {
        float total = 14_000;
        System.out.println("Inwestycja początkowa: " + total + " zł");

        total = total + (total * .4F);
        //Dopisujemy "F" dlatego, że operujemy na typie 'float'
        // albo: total = total * 1.4F
        // albo: total *= 1.4F

        System.out.println("Po pierwszym roku: " + total + " zł");

        total = total - 1500F;
        System.out.println("Po drugim roku: " + total + "zł");

        total = total + (total * .12F);
        System.out.println("Po trzecim roku: " + total + " zł");

    }
}
