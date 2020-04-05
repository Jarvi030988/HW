package Fitness;

public class Logger {
    Abonement abonement;
    Fitness fitness;
    public Logger(Abonement abonement, Fitness fitness) {
    }
    public void showStats(){
        System.out.println("Имя" + abonement.person.personName);
        System.out.println("Фамилия" + abonement.person.personSurname);
        System.out.println("Вид занятия"+ abonement.person.status);
        System.out.println("Дата и время посещения" +abonement.getTimeEnter());
    }
    //Реализовать возможность вывода информации о посетителях:
    //сначала посетителях тренажерного зала, потом бассейна, потом групповых занятий.
    //Выводить имя и фамилию посетителей в отсортированном порядке (сначала фамилия, потом им
    public void showStatsOverall(){
        System.out.println("Pool");
        for (int i = 0; i < fitness.abInPool.length; i++) {
            Abonement ab = fitness.abInPool[i];
            System.out.println("Фамилия" + ab.person.personSurname + ", Имя" +ab.person.personName +", Дата/Время входа"
                    +ab.getTimeEnter());

        }
        System.out.println("Gym");
        for (int i = 0; i < fitness.abInGym.length; i++) {
            Abonement ab = fitness.abInGym[i];
            System.out.println("Фамилия" + ab.person.personSurname + ", Имя" +ab.person.personName +", Дата/Время входа"
                    +ab.getTimeEnter());

        }
        System.out.println("Group");
        for (int i = 0; i < fitness.abInGroup.length; i++) {
            Abonement ab = fitness.abInGroup[i];
            System.out.println("Фамилия" + ab.person.personSurname + ", Имя" +ab.person.personName +", Дата/Время входа"
                    +ab.getTimeEnter());
        }
    }
}
