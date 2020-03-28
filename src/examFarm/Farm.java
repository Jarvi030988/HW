package examFarm;

import newSchool.Student;
import newSchool.Teacher;

//тут фермер, тут дом.животные, + цикл кто победит дом.животные, дикие живвотные или фермер
public class Farm {
    Farmer farmer;

    FarmAnimals[] farmAnimals = new FarmAnimals[10];
    WildAnimals[] wildAnimals = new WildAnimals[3];


    public void Farm() {
        this.farmer = farmer;
        this.farmAnimals = farmAnimals;
    }

    public void passDay() {
        farmer.numOfResources -= 2;
        if (farmer.numOfResources == 0){
            System.out.println("Игра закончена, ресурсов не осталось");
            return;
        }
        farmer.takeResourses(farmAnimals);
        System.out.println("На ферме начался новый день ");
    }


    //    public void addAnimals[]
    //    private Teacher[] teacherArray = {};
    public void addFarmAnimal(FarmAnimals animal) {
        for (int i = 0; i < farmAnimals.length; i++) {
            if (farmAnimals[i] == null) {
                farmAnimals[i] = animal;
                break;
            }
        }
    }

    public void addWildAnimal(WildAnimals animal) {
        for (int i = 0; i < wildAnimals.length; i++) {
            if (wildAnimals[i] == null) {
                wildAnimals[i] = animal;
                break;
            }
        }
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