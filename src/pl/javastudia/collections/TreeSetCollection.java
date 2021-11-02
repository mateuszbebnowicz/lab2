package pl.javastudia.collections;

import pl.javastudia.People;
import java.util.*;

public class TreeSetCollection extends CollectionDemo {
    private Set<People> data;
    private Random random = new Random();

    public TreeSetCollection() {
        super("TreeSet");
        data = new TreeSet<>();
    }

    @Override
    public void addToCollection(People[] people) {
        for(var people1 : people) {
            data.add(people1);
        }
    }

    @Override
    public void removeFromCollection() {
        int deleter = random.nextInt(data.size());
        System.out.println("Deleted " + (deleter + 1) + " person");
        data.remove(deleter);
    }

    @Override
    public void displayCollection() {
        for(var people : data) {
            System.out.println(people);
        }
    }
}
