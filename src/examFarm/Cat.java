package examFarm;

public class Cat extends FarmAnimals {
    private int numOfResources = 0;
    public Cat(String name, int weight, int speed, int health0, int numOfResources) {
        super(name, weight, speed, health0, numOfResources);
        System.out.println("Бесполезное животное");
    }
}
