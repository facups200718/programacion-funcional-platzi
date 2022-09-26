package model;

import java.util.*;

public final class ImmutablePerson {
    private String firstName;
    private String lastName;
    private List<String> emails;

    public ImmutablePerson(String firstName, String lastName, List<String> emails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emails = emails;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<String> getEmails() {
        LinkedList<String> mails = new LinkedList<>();
        for (String mail: emails) {
            mails.add(mail);
        }
        return mails;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emails=" + emails +
                '}';
    }
}
