package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        System.out.println("minute = " + minute);
    }
}
