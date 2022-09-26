import model.ImmutablePerson;

import java.util.*;

public class App {
    public static void main(String[] args) {
        String firstName = "Facundo";
        String lastName = "Perez";

        List<String> emails = new LinkedList<>();
        emails.add("facundoperezschneider@gmail.com");

        ImmutablePerson facundo = new ImmutablePerson(firstName, lastName, emails);

        //Se demuestra la inmutabilidad del objeto, una propiedad de la programacion funcional
        System.out.println(facundo);
        badIntentionedFunction(facundo);
        System.out.println(facundo);
    }

    private static void badIntentionedFunction(ImmutablePerson person) {
        List<String> emails = person.getEmails();
        emails.clear();
        emails.add("imnotthebadguy@gmail.com");
    }
}
