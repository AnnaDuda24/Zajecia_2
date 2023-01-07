package Zajęcia_2;

public class Loops {
    public static void main(String[] args) {

/*        int x = 5;
        { //początek bloku

            int y = 10;
            y = x + y;

        } //koniec bloku*/

/*      int x = 2;
      if (x > 2) {
          System.out.println("Jest większe od 2");
      } else if (x < 2){
          System.out.println("Nie jest większe od 2");
      } else {
            System.out.println("Jest równe 2");
      }*/

        //Instrukcja warunkowa SWITCH
        //Działa na typach:
        //byte i Byte
        //short i Short
        //int i Integer
        //char i Character
        //enum
        //String

        char grade = 'E';

        switch (grade) {
            case 'A':
                System.out.println("Wspaniale!");
                break;
            case 'B':
                System.out.println("Dobrze!");
                break;
            case 'D':
                System.out.println("Mogło być lepiej!");
                break;
            default: //jeżeli żadna opcja z powyższych to:
                System.out.println("Rozważ oszukiwanie!");
        }


    }
}