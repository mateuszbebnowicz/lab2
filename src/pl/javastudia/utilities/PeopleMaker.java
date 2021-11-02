package pl.javastudia.utilities;

import pl.javastudia.People;

public abstract class PeopleMaker {

    private final String[] name = {"Mateusz", "Pawel", "Krzysiek"};
    private final String[] surname = {"Kowalski", "Stefaniak", "Pytka"};

    public PeopleMaker() {

    }

    public String[] getNames() {
        return name;
    }

    public String[] getSurnames() {
        return surname;
    }

    abstract public People makeNewPeople();

}
