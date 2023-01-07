package Zajęcia_2;

import java.util.StringTokenizer;

public class TokenTester {
    public static void main(String[] args) {
        StringTokenizer str1, str2;
        String quote1 = "GOOG 530,80 -9,98";

        //Rozbijanie ciągu znaków na poszczególne tokeny

        str1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " +str1.nextToken());
        System.out.println("Token 2: " +str1.nextToken());
        System.out.println("Token 3: " +str1.nextToken());

        //Jak widać powyżej, tokeny oddzielone spacjami rodzielane są automatycznie. A jeśli oddzielilibyśmy je innymi znakami?

        System.out.println();

        String quote2 = "RTH@75,00@0,22";
        str2 = new StringTokenizer(quote2, "@");
        System.out.println("Token 1: " +str2.nextToken());
        System.out.println("Token 2: " +str2.nextToken());
        System.out.println("Token 3: " +str2.nextToken());

    }
}
