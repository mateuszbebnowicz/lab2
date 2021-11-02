package pl.javastudia.utilities;

import pl.javastudia.People;
import java.util.Random;

public class RandomPeopleMaker extends PeopleMaker {

    Random random = new Random();

    public RandomPeopleMaker() {
        super();
    }

    @Override
    public People makeNewPeople() {
        String make = getNames()[random.nextInt(getNames().length)];
        String model = getSurnames()[random.nextInt(getNames().length)];

        return new People(make, model);
    }
}