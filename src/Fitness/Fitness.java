package Fitness;

import javax.swing.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Fitness {
    Abonement[] abInPool = new Abonement[20];
    Abonement[] abInGym = new Abonement[20];
    Abonement[] abInGroup = new Abonement[20];
    int countInPool = 0;
    int countInGym = 0;
    int countInGroup = 0;

    //    Разовый. По разовому абонементу клиенты могут посещать бассейн и тренажерный зал с 8 до 22 часов.
//    Дневной. По данному абонементу клиенты могут посещать тренажерный зал и групповые занятия (но не бассейн) с 8 до 16 часов.
//    Полный. По данному абонементу клиенты могут посещать тренажерный зал, бассейн и групповые занятия с 8 до 22 часов.

    //    Когда клиент приходит в фитнес клуб, он сообщает желаемую зону и показывает абонемент.
//    Необходимо проверить может ли данный посетитель пройти в желаемую зону и пропустить его,
//если возможность существует; если посетитель не может пройти, необходимо сообщить ему причину.
//
//Посетитель не может пройти, если время абонемента не соответсвует текущему времени,
//если он пытается пройти в зону, которая не разрешена по его абонементу,
//если в зоне нет свободных мест.
    public String  canEnter(Abonement abonement, String type) {
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalTime first = LocalTime.of(8, 0, 0);
        LocalTime last = LocalTime.of(22, 0, 0);
        LocalTime middle = LocalTime.of(16, 0, 0);
        if (abonement.getAbonementType() == 0) {
            if (currentTime.isAfter(first) && currentTime.isBefore(last)) {
            } else {
                return "Придите в свое время";
            }
        }
        if (abonement.getAbonementType() == 1) {
            if (currentTime.isAfter(first) && currentTime.isBefore(middle)) {
            } else {
                return "Придите в свое время";
            }
        }
        if (abonement.getAbonementType() == 2) {
            if (currentTime.isAfter(first) && currentTime.isBefore(last)) {
            } else {
                return "Придите в свое время";
            }
        }
        if (type == "pool"){
            if (abonement.getAbonementType() == 0 || abonement.getAbonementType() == 2){
                if (countInPool>=20){
                    return "Нет мест";
                }
                abInPool[countInPool] = abonement;
                countInPool += 1;
                abonement.person.status = "pool";
            }
            else
            {
                return "Вы не можете посещать эту зону. ";
            }
        }
        if (type == "gym") {
            if (countInGym>=20){
                return "Нет мест";
            }
            abInGym[countInGym] = abonement;
            countInGym += 1;
            abonement.person.status = "gym";
        }

        if (type == "group") {
            if (abonement.getAbonementType() == 1 || abonement.getAbonementType() == 2) {
                if (countInGroup >= 20) {
                    return "Нет мест";
                }
                abInGroup[countInGroup] = abonement;
                countInGroup += 1;
                abonement.person.status = "group";
            } else {
                return "Вы не можете посещать эту зону. ";
            }
        }
        abonement.setTimeEnter(currentDateTime);
        return "OK";
    }
    public void closeTheGym(){
        abInPool =  new Abonement[20];
        abInGym =   new Abonement[20];
        abInGroup = new Abonement[20];
        countInPool = 0;
        countInGym = 0;
        countInGroup = 0;
    }
}
