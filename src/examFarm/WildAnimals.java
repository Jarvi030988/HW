package examFarm;

public class WildAnimals implements CanCatch{
    public String name;
    public int weight;
    public int speed;
    public int power;

    @Override
    public void canCatchAndEat() {
        System.out.println("Wild animal catch farm animal");

    }
}
