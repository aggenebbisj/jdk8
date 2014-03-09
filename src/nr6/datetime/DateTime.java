package nr6.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;

public class DateTime {

    public static void main(String... args) {
        
        LocalDateTime dateTime = Year.of(2014)
                .atMonth(Month.MARCH)
                .atDay(25)
                .atTime(14, 15);
        System.out.println(dateTime);
        
        // start of day
        ZoneId eur_Ams = ZoneId.of("Europe/Amsterdam");
        System.out.println(
            LocalDate.now()
                     .atStartOfDay()
                     .atZone(eur_Ams)
        );
        
        // duration - over 6 uur
        LocalDateTime overZesUur = LocalDateTime.now().plus(Duration.ofHours(6));
        System.out.printf("Over zes uur: %s\n", overZesUur);
        
        // 10 days later
        LocalDate tenDaysLater = LocalDate.now().plus(Period.ofDays(10));
        System.out.printf("10 dagen later: %s\n", tenDaysLater);        
    }
    
}
