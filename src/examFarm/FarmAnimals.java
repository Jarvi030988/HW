package examFarm;

public class FarmAnimals implements CanRunAway{
    public String name;
    public int weight;
    public int speed;
    public int health0 = 5;
    public int health = health0;
    public int numOfResources;

    public boolean eaten;

    public void wasEaten(){
        this.eaten = true;
    }

    @Override
    public void canRunAway() {
        System.out.println("Farm animal run away");
    }
}

