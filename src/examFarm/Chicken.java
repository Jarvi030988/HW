package examFarm;


public class Chicken extends FarmAnimals implements CanRunAway, CanGiveResourses, AnimalsForFood {
    private int numOfResources = 5;

    public Chicken(String name, int weight, int speed, int health0, int numOfResources) {
        super(name, weight, speed, health0, numOfResources);
    }

    @Override
    public void canGiveResourses() {
        return;
    }

    @Override
    public void animalsForFood() {
        return;
    }
}

