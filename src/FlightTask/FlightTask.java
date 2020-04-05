package FlightTask;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;


public class FlightTask {
    public LocalDateTime getFlDateAndTime() {
        LocalDateTime sidneyTime = LocalDateTime.of(2020, Month.JUNE, 16, 19, 00);
        return sidneyTime;

    }
}

