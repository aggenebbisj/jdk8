package nr6.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;


public class DateTime {

    public static void main(String... args) {

        Period period = Period.ofDays(1);
        System.out.println(period);
        long seconds = period.get(ChronoUnit.SECONDS);
        System.out.println(seconds);

        Year year = Year.of(2014);
        YearMonth yMonth = year.atMonth(Month.MARCH);
        LocalDate date = yMonth.atDay(25);

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
