package Fitness;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class main {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate endDate = currentDate.plusYears(1);
        Person pers1 = new Person("Masha", "Ivanova",1980);
        Abonement abon1 = new Abonement(1, currentDate, endDate, pers1);

    }
}
