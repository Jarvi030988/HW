package examFarm;

public class FarmAnimals implements CanRunAway {
    private String name;
    private int weight;
    private int speed;
    private int health;
    private int health0;
    private int numOfResources;

    public FarmAnimals(String name, int weight, int speed, int health0, int numOfResources) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.health0 = health0;
        this.health = health0;
        this.numOfResources = numOfResources;
    }

    public boolean isEaten() {

        return eaten;
    }

    public void setNumOfResources(int numOfResources) {

        this.numOfResources = numOfResources;
    }

    public boolean eaten;

    public void wasEaten() {

        this.eaten = true;
        System.out.println("Животное" + FarmAnimals.this.name + "съедено");
    }

    @Override
    public void canRunAway() {
        return;
//        System.out.println("Farm animal run away");
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 0) {
            this.weight = 1;
        }
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed <= 0) {
            this.speed = 1;
            this.speed = speed;
        }
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getNumOfResources() {
        return numOfResources;
    }

    public int getHealth0() {

        return health0;
    }

    public void setHealth0(int health0) {
        if (health0 >= 0) {
            this.health0 = health0;
        }
    }
}


