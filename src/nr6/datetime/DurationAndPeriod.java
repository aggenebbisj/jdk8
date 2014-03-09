package nr6.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DurationAndPeriod {

     public static void main(String... args) {                
        ZoneId eur_Ams = ZoneId.of("Europe/Amsterdam");
        
        Period periodOfOneDay = Period.ofDays(1);
        Duration durationOfOneDay = Duration.ofDays(1);
        
        // zomertijd
        ZonedDateTime mrt30 = LocalDateTime.of(2014, 3, 30, 0, 0).atZone(eur_Ams);        
        ZonedDateTime mrt31 = mrt30.plus(periodOfOneDay);
        
        long periodSeconds = mrt31.toInstant().getEpochSecond() 
                - mrt30.toInstant().getEpochSecond();
        
        System.out.println(durationOfOneDay.getSeconds());        
        System.out.println(periodSeconds);
    }
}
