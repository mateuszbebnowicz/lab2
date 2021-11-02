package pl.javastudia.collections;

import pl.javastudia.People;

public abstract class CollectionDemo {
    private final String collectionName;

    public CollectionDemo(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    abstract public void addToCollection(People[] people);
    abstract public void removeFromCollection();
    abstract public void displayCollection();
}
