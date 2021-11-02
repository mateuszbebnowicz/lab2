package pl.javastudia.collections;

import pl.javastudia.People;
import java.util.*;

public class HashMapCollection extends CollectionDemo {
    private Map<Integer, People> data;
    private Random random = new Random();
    private int value = 0;

    public HashMapCollection() {
        super("HashMap");
        data = new HashMap<>();
    }

    @Override
    public void addToCollection(People[] people) {
        for(var people1 : people) {
            data.put(value, people1);
            value++;
        }
    }

    @Override
    public void removeFromCollection() {
        var keys = data.keySet();
        int randomKeyIndex = random.nextInt(keys.size());
        Integer randomKey = (Integer) (keys.toArray()[randomKeyIndex]);
        System.out.println(String.format("Removable object: key[%d], person[%s]", randomKey.intValue(),
                data.get(randomKey).toString()));
        data.remove(randomKey);
    }

    @Override
    public void displayCollection() {
        for(var personKey : data.keySet()) {
            System.out.println("Key: " + personKey + " Person: " + data.get(personKey));
        }
    }
}
