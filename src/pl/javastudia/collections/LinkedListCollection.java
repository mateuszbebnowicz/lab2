package pl.javastudia.collections;

import pl.javastudia.People;
import java.util.*;

public class LinkedListCollection extends CollectionDemo {
    private List<People> data;
    private Random random = new Random();

    public LinkedListCollection() {
        super("LinkedList");
        data = new java.util.LinkedList<>();
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
