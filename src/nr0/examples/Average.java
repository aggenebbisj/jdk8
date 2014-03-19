package nr0.examples;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Average {

    static class Averager implements IntConsumer {

        private int total = 0;
        private int count = 0;

        public double average() {
            return count > 0 ? ((double) total) / count : 0;
        }

        public void accept(int i) {

            total += i;
            count++;
        }

        public void combine(Averager other) {
            total += other.total;
            count += other.count;
        }
    
    }

    public static void main(String... args) {
        
        IntStream numbers = IntStream.iterate(1, n -> n + 1);
        
        final Averager result = numbers.limit(50)
                .collect(Averager::new, Averager::accept, Averager::combine);
        
        System.out.println(result.average());
    }
    
}
