package examFarm;

public class WildAnimals implements CanCatch {
    private String name;
    private int weight;
    private int speed;
    private int power;
    private int strikes = 3;
    private boolean comeBack = true;

    public WildAnimals(String name, int weight, int speed, int power) { //чтобы создавать объект с атрибутами (переменными)
        this.name = name;
        this.weight = weight;
        this.speed = speed;
        this.power = power;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 0) {
            this.weight = 1;
        } else {
            this.weight = weight;
        }
    }

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 1;
        } else {
            this.speed = speed;
        }
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if (power < 0) {
            this.power = 1;
        }
        this.power = power;
    }

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public boolean isComeBack() {
        return comeBack;
    }

    public void setComeBack(boolean comeBack) {
        this.comeBack = comeBack;
    }

    public void eatFarmAnimal(FarmAnimals farmAnimal) {
        if (farmAnimal.getSpeed() > this.speed) {
            System.out.println("Фермерское животное " + farmAnimal.getName() + "убежало от " + this.name);
            return;
        }
        if (farmAnimal.getHealth() <= this.power) {
            farmAnimal.wasEaten();
            System.out.println("Фермерское животное" + farmAnimal.getName() + "съедено");
        } else {
//            farmAnimal.health = farmAnimal.health - this.power;
            farmAnimal.setHealth(farmAnimal.getHealth() - this.power);

            System.out.println("Здоровье фермерского животного" + farmAnimal.getName() + "уменьшилось на " + String.valueOf(this.power));
        }
    }
    @Override
    public void canCatchAndEat() {

        return;
    }
}
