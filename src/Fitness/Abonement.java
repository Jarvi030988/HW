package Fitness;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Abonement {
    private int abonementType;
    //0-разовый
    //1-дневной
    //2-полный
    private LocalDate dateStartAbonement;
    private LocalDate dateEndAbonement;
    private LocalDateTime timeEnter;
    public Person person;

    public Abonement(int abonementType, LocalDate dateStartAbonement, LocalDate dateEndAbonement, Person person) {
        this.abonementType = abonementType;
        this.dateStartAbonement = dateStartAbonement;
        this.dateEndAbonement = dateEndAbonement;
        this.person = person;
    }

    public LocalDateTime getTimeEnter() {
        return timeEnter;
    }

    public void setTimeEnter(LocalDateTime timeEnter) {
        this.timeEnter = timeEnter;
    }

    public void setAbonementType(int abonementType) {
        this.abonementType = abonementType;
    }
    public void setDateStartAbonement(LocalDate dateStartAbonement) {
        this.dateStartAbonement = dateStartAbonement;
    }

    public void setDateEndAbonement(LocalDate dateEndAbonement) {
        this.dateEndAbonement = dateEndAbonement;
    }

    public int getAbonementType() {
        return abonementType;
    }

    public LocalDate getDateStartAbonement() {
        return dateStartAbonement;
    }

    public LocalDate getDateEndAbonement() {
        return dateEndAbonement;
    }
}
