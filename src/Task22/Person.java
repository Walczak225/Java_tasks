package Task22;

import java.util.ArrayList;

public class Person {
    protected String name;
    protected String surname;
    protected int age;
    protected String email;
    private String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";


    public Person(String name, String email, int age, String surname) {
        validateName(name);
        this.name = name;
        this.surname = surname;
        validateAge(age);
        this.age = age;
        validateEmail(email);
        this.email = email;
    }

    private void validateName(String name) throws IllegalArgumentException {
        if(name == null || name.length() < 2) throw new IllegalArgumentException("Invalid Input");
    }
    private void validateAge(int age) throws IllegalArgumentException {
        if(age < 18) throw new IllegalArgumentException("Invalid Input");
    }
    private void validateEmail(String email) throws IllegalArgumentException {
        if(email == null || !email.matches(regex)) throw new IllegalArgumentException("Invalid Input");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String toString() {
        return name + " " + surname + " (" + email + ")";
    }
}
