package TodoCode;

public class Persona {
    String name;
    String surname;
    int age;
    String email;

    // Constructor
    public Persona() {
    }

    public Persona(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public void setFullName(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }
}