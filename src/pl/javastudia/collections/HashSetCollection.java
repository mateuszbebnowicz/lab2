package pl.javastudia.collections;

import pl.javastudia.People;
import java.util.*;

public class HashSetCollection extends CollectionDemo {
    private Set<People> data;
    private Random random = new Random();

    public HashSetCollection() {
        super("HashSet");
        data = new HashSet<>();
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
        System.out.println("Removed " + (deleter + 1) + " person");
        data.remove(deleter);
    }

    @Override
    public void displayCollection() {
        for(var people : data) {
            System.out.println(people);;
        }
    }
}
