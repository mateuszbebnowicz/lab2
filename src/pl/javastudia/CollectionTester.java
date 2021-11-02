package pl.javastudia;

import pl.javastudia.collections.*;
import pl.javastudia.collections.CollectionDemo;
import pl.javastudia.utilities.PeopleMaker;
import pl.javastudia.utilities.RandomPeopleMaker;

import java.util.Optional;
import java.util.Scanner;

public class CollectionTester {

    private People[] people;
    Scanner scanner = new Scanner(System.in);

    public void startCollections () {
        initializePeople();
        printPeople();
        choseCollection();
    }

    private void initializePeople() {
        people = new People[6];
        PeopleMaker peopleMaker = new RandomPeopleMaker();

        for(int i = 0; i < people.length; i++) {
            people[i] = peopleMaker.makeNewPeople();
        }
    }

    private void printPeople() {

        System.out.println("\nPeople made:");
        for(var people : people) {
            System.out.println("\t" + people.toString());
        }
    }

    private void choseCollection() {
        boolean shouldContinue = true;

        while(shouldContinue){
            System.out.println("\nWhich collection do you want to show?:" +
                    "\n\t1. ArrayList" +
                    "\n\t2. LinkedList" +
                    "\n\t3. HashSet" +
                    "\n\t4. TreeSet" +
                    "\n\t5. HashMap" +
                    "\n\t6. TreeMap" +
                    "\n\t0. End program");

            int userChoice = scanner.nextInt();
            Optional<CollectionDemo> chosenCollectionDemo = Optional.ofNullable(null);
            switch(userChoice) {
                case 1 : chosenCollectionDemo = Optional.of(new ArrayListCollection()); break;
                case 2 : chosenCollectionDemo = Optional.of(new LinkedListCollection()); break;
                case 3 : chosenCollectionDemo = Optional.of(new HashSetCollection()); break;
                case 4 : chosenCollectionDemo = Optional.of(new TreeSetCollection()); break;
                case 5 : chosenCollectionDemo = Optional.of(new HashMapCollection()); break;
                case 6 : chosenCollectionDemo = Optional.of(new TreeMapCollection()); break;
                case 0 : shouldContinue = false; break;
                default: System.out.println("?"); break;
            }
            chosenCollectionDemo.ifPresent((e) -> this.actionPerformer(e));
        }
    }

    private void actionPerformer(CollectionDemo chosenCollectionDemo) {
        boolean shouldContinue = true;

        chosenCollectionDemo.addToCollection(people);

        while(shouldContinue) {
            System.out.println("\nWhat do you want to do " + chosenCollectionDemo.getCollectionName() + "?" +
                    "\n\t1. Show collection" +
                    "\n\t2. Add objects " +
                    "\n\t3. Delate random object" +
                    "\n\t4. Go back to choosing collection");

            int userChoice = scanner.nextInt();

            switch(userChoice) {
                case 1: chosenCollectionDemo.displayCollection(); break;
                case 2: chosenCollectionDemo.addToCollection(people); break;
                case 3: chosenCollectionDemo.removeFromCollection(); break;
                case 4: shouldContinue = false; break;
            }
        }
    }
}
