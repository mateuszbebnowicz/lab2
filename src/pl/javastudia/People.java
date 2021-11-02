package pl.javastudia;

import java.util.Objects;

public class People {

    private String name;
    private String surname;
    private int age;

    public People(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return name.equals(people.name) && surname.equals(people.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
