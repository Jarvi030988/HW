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

}




//методы takeRes
//for
// if (животные HomeAnimals[]


