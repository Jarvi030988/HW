package examFarm;

public class Farmer {
    public int numOfResources = 5;


    public void canGiveFood() {
        return;
    }

    public void takeResourses(FarmAnimals[] farmAnimals) {
        for (int i = 0; i < farmAnimals.length; i++) {
            if (farmAnimals[i] instanceof CanGiveResourses) {
                numOfResources += farmAnimals[i].numOfResources;
            }
        }
    }
    public void feedTheAnimal(FarmAnimals farmAnimal) {
        if (farmAnimal.health >= farmAnimal.health0){
            return;
        }
        farmAnimal.health += 1;
    }
    public void awayTheAnimal(WildAnimals wildAnimal) {

        System.out.println("Go away animal");
        wildAnimal.strikes -= 1;
        if (wildAnimal.strikes <= 0){
            wildAnimal.comeBack = false;
        }
    }
    public void collectResources(Farm farm) {
        for (int i = 0; i < farm.farmAnimals.length; i++) {

            this.numOfResources = this.numOfResources + farm.farmAnimals[i].numOfResources;
            farm.farmAnimals[i].numOfResources = 0;
        }

    }

}




//методы takeRes
//for
// if (животные HomeAnimals[]


