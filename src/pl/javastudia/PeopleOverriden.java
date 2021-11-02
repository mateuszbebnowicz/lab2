package pl.javastudia;

public class PeopleOverriden extends People {

    public PeopleOverriden(String name, String surname) {
        super(name, surname);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
