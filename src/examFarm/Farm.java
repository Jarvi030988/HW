package examFarm;

//тут фермер, тут дом.животные, + цикл кто победит дом.животные, дикие живвотные или фермер
public class Farm {
    Farmer farmer;

    FarmAnimals[] farmAnimals = new FarmAnimals[10];

    public void dayOnFarm() {
        farmer.numOfResources -= 2;
        farmer.takeResourses(farmAnimals);
    }
}