package nr0.examples;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

public class Capturing {

    Callable<String> helloCallable(String name) {
        String hello = "Hello"; // effectively final
        return () -> (hello + ", " + name);
    }

    public static void main(String... args) throws Exception {
        String message = new Capturing().helloCallable("Remko").call();
        System.out.println(message);
        
        final List<Integer> numbers = Arrays.asList(new Integer[]{1,2,3});
        int sum = 0;
        // numbers.forEach(e -> { sum += e.size(); }); // ERROR
    }

}
