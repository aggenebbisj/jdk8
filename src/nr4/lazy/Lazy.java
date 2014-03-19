package nr4.lazy;


import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Lazy {

    public static void main(String[] args) {
        Instant start = Instant.now();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        List<String> result = numbers.parallelStream()
                .map(Lazy::slowOp)
                .collect(Collectors.toList());
        System.out.println(result);
        Duration time = Duration.between(start, Instant.now());
        System.out.println(time.get(ChronoUnit.SECONDS) + " seconds");
    }

    public static String slowOp(Integer i) {
        System.out.println("Performing slow operation for " + i);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "" + i;
    }
}
