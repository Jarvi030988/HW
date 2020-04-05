package FlightTask;

import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) {
      FlightTask sidneyTime = new FlightTask();
      LocalDateTime time1 = sidneyTime.getFlDateAndTime();


        System.out.println("Время вылета из Сиднея" + time1);
    }
}
