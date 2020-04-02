package examFarm;

import java.util.Random;

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
      /*  for (int i = 0; i < farm.wildAnimals.length ; i++) {
            System.out.println(farm.wildAnimals[i]);
        }
        for (int i = 0; i < farm.farmAnimals.length ; i++) {
            System.out.println(farm.farmAnimals[i]);
        }*/
        farm.passDay();

        Random random = new Random();
//        System.out.println(random.nextInt(3));
        int length = farm.numberOfFarmAnimals;//***

        int i1 = random.nextInt(length);

        int lenght1 = farm.numberOfWildAnimals;//***
        int i2 = random.nextInt(lenght1);

        farm.wildAnimals[i2].eatFarmAnimal(farm.farmAnimals[i1]);

        int lenght3 = farm.wildAnimals.length;
        int i3 = random.nextInt(lenght3);
        farm.farmer.awayTheAnimal(farm.wildAnimals[i3]);


        for (int i = 0; i < farm.farmAnimals.length; i++) {
            farm.farmer.feedTheAnimal(farm.farmAnimals[i]);
        }

        farm.farmer.takeResourses(farm.farmAnimals);


//    int length = v.length;


    }
}
