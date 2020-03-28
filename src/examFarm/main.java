package examFarm;

public class main {
    public static void main(String[] args) {
        Farm farm = new Farm();

        Chicken chicken = new Chicken("Оля", 3,5, 5, 1);
        Cow cow = new Cow("Корова", 250,2, 5, 250);
        Rabbit rabbit = new Rabbit("Кролик", 6, 1, 2, 6);
        Cat cat = new Cat("Кошка", 2,7, 9, 0);

        farm.addFarmAnimal(chicken);
        farm.addFarmAnimal(cow);
        farm.addFarmAnimal(rabbit);
        farm.addFarmAnimal(cat);

        Bear bear = new Bear("Михаил", 32, 5, 32);
        Fox fox = new Fox("Лисица", 10, 6, 10);
        Wolf wolf = new Wolf("Волк", 12, 7, 10);

        farm.addWildAnimal(bear);
        farm.addWildAnimal(fox);
        farm.addWildAnimal(wolf);

        farm.passDay();


    }
}
