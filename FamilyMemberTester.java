package Zajęcia_2;

public class FamilyMemberTester {
    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        dad.name = "Karol";
        dad.age = 34;
        dad.surname = "Kowalski";

        //Zmiana nazwiska zmieni to pole dla całej klasy, nie tylko tego obiektu

        //Taki se sposób:
        System.out.println("Nazwisko rodu to: " + dad.surname);
        //Preferowany sposób:
        System.out.println("Nazwisko rodu to: " + FamilyMember.surname);

        FamilyMember mom = new FamilyMember();
        mom.name = "Dorota";
        mom.age = 30;
    }
}
