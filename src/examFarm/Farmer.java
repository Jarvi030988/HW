package examFarm;

public class Farmer {
    public int numOfResources;

    public Farmer() {
        this.numOfResources = numOfResources;
    }

    public void canGiveFood() {

        return;
    }

    public void takeResourses(FarmAnimals[] farmAnimals) {
        for (int i = 0; i < farmAnimals.length; i++) {
            if (farmAnimals[i] instanceof CanGiveResourses) {    //instanceaf - приналежит классу
//                numOfResources += farmAnimals[i].numOfResources -1;//н,е, атрибуты,а, методы, переделываем,
                farmAnimals[i].setNumOfResources(farmAnimals[i].getNumOfResources() - 1);
//                numOfResources + farmAnimals[i].numOfResources = farmer.numOfResources;
                this.numOfResources += 1;
                System.out.println("Фермер собрал ресурсы со всех животных фермы");
            }
        }
    }

    public void feedTheAnimal(FarmAnimals farmAnimal) {
        if (farmAnimal instanceof CanGiveResourses) {
            if (farmAnimal.getHealth() >= farmAnimal.getHealth0()) {
                farmAnimal.setNumOfResources(farmAnimal.getNumOfResources() + 1);
                System.out.println("Фермерского животного накормили" + farmAnimal.getName());
                return;
            }
            farmAnimal.setHealth(farmAnimal.getHealth() + 1);
            farmAnimal.setNumOfResources(farmAnimal.getNumOfResources() + 1);
            System.out.println("Фермерского животного накормили" + farmAnimal.getName());
        /*farmAnimal.health += 1;
        farmAnimal.numOfResources +=1;*/
        }
    }

    public void awayTheAnimal(WildAnimals wildAnimal) {

        System.out.println("Уходи дикое животное" + wildAnimal.getName());
        wildAnimal.setStrikes(wildAnimal.getStrikes() - 1);
//        wildAnimal.strikes -= 1;
        if (wildAnimal.getStrikes() <= 0) {
            wildAnimal.setComeBack(false);
            System.out.println("Дикое животное" + wildAnimal.getName() + "больше не придет");
        }
    }
}


//методы takeRes
//for
// if (животные HomeAnimals[]


