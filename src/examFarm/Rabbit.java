package examFarm;


public class Rabbit extends FarmAnimals implements AnimalsForFood {

    public Rabbit(String name, int weight, int speed, int health0, int numOfResources) {
        super(name, weight, speed, health0, numOfResources);
    }
    @Override
    public void animalsForFood() {
    }
}
