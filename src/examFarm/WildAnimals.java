package examFarm;

public class WildAnimals implements CanCatch {
    public String name;
    public int weight;
    public int speed;
    public int power;
    public int strikes = 3;
    public boolean comeBack = true;

    public void eatFarmAnimal(FarmAnimals farmAnimal) {
        if (farmAnimal.speed > this.speed) {
            System.out.println("");
            return;

        }
        if (farmAnimal.health <= this.power){
            farmAnimal.wasEaten();
        }else{
            farmAnimal.health = farmAnimal.health - this.power;
        }
    }



    @Override
    public void canCatchAndEat() {
        System.out.println("Wild animal catch farm animal");

    }
}
