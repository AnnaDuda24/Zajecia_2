package Zajęcia_2;

public class EqualsTester {
    public static void main(String[] args) {

        String str1, str2;
        str1 = "Ale to się rozrasta!";
        str2 = str1;
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));

        System.out.println("------------------------");

        str2 = new String(str1);
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));

        System.out.println("Ta sama wartość? " + (str1.equals(str2)));
        //metoda 'equals' służy do porównywania ciągów znaków. w tym przypadku nie używamy "=="
    }
}
