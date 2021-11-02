package pl.javastudia.collections;

import pl.javastudia.People;
import java.util.*;

public class ArrayListCollection extends CollectionDemo {
    private List<People> data;
    private Random random = new Random();

    public ArrayListCollection() {
        super("ArrayList");
        data = new ArrayList<>();
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
        for(var people1 : data) {
            System.out.println(people1);
        }
    }
}
