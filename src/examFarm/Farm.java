package examFarm;

import newSchool.Student;
import newSchool.Teacher;

//тут фермер, тут дом.животные, + цикл кто победит дом.животные, дикие живвотные или фермер
public class Farm {
    Farmer farmer;
    int numberOfFarmAnimals; // ***
    int numberOfWildAnimals; // ***
    FarmAnimals[] farmAnimals = new FarmAnimals[10];
    WildAnimals[] wildAnimals = new WildAnimals[3];

    public Farm() {
        Farmer farmer = new Farmer();
        this.farmer = farmer;
        this.farmAnimals = farmAnimals;
        this.wildAnimals = wildAnimals;
        this.numberOfFarmAnimals = 0; // ***
        this.numberOfFarmAnimals = 0; // ***
    }

    public void passDay() {

        this.farmer.numOfResources -= 2;
        if (this.farmer.numOfResources == 0){
            System.out.println("Игра закончена, ресурсов не осталось");
            return;
        }
        this.farmer.takeResourses(farmAnimals);
        System.out.println("На ферме начался новый день ");
    }


    //    public void addAnimals[]
    //    private Teacher[] teacherArray = {};
    public void addFarmAnimal(FarmAnimals animal) {
        if (this.numberOfFarmAnimals > 10){
            System.out.println("Превышен лимит животных");//***
            return;
        }
        for (int i = 0; i < farmAnimals.length; i++) {
            if (farmAnimals[i] == null) {
                farmAnimals[i] = animal;
                break;
            }
        }
        this.numberOfFarmAnimals+=1; //***
    }

    public void addWildAnimal(WildAnimals animal) {
        for (int i = 0; i < wildAnimals.length; i++) {
            if (wildAnimals[i] == null) {
                wildAnimals[i] = animal;
                break;
            }
        }
        this.numberOfWildAnimals +=1;//***
    }
}
//    public void addFarmAnimal(String type, String name, int weight, int speed, int health0, int numOfResources) {
//        int n = farmAnimals.length;
//        FarmAnimals[] newFarmAnimals = new FarmAnimals[n + 1];
//        for (int i = 0; i < n; i++) {
//            newFarmAnimals[i] = this.farmAnimals[i];
//        }
//        farmAnimals = newFarmAnimals;
//        if (type == "chicken"){
//            Chicken newAnimal = new Chicken(name, weight, speed, health0, numOfResources);
//            farmAnimals[n] = newAnimal;