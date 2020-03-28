package examFarm;


public class Cow extends FarmAnimals implements CanRunAway, AnimalsForFood, CanGiveResourses {

    public Cow(String name, int weight, int speed, int health0, int numOfResources) {
        super(name, weight, speed, health0, numOfResources);
    }
    @Override
    public void canGiveResourses() {
    }

    @Override
    public void animalsForFood() {

    }
}
