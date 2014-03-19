package nr0.examples;

import java.util.function.Function;
import java.util.function.Predicate;

public class Shadowing {

    int i = 9;
    Predicate<Integer> isEven = i -> i % 2 == 0;
    
    public static void main(String... args) {
        final boolean isEven = new Shadowing().isEven.test(2);
        System.out.println(isEven);
        
        String result = someMethod(s -> s.toUpperCase() + "!");
        System.out.println(result);

        result = someMethod(s -> s.substring(0, 3));
        System.out.println(result);
    }

    public static String someMethod(Function<String, String> function) {
        return function.apply("Hoi Remko");
    }
}
