package examFarm;

public class Wolf extends WildAnimals {

    public void eatFarmAnimal(FarmAnimals farmAnimals) {
        if (farmAnimals.speed > this.speed) {
            System.out.println("");
            return;
        }
        farmAnimals.wasEaten();
    }
}
