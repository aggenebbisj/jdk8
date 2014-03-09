package nr0.examples;

import java.util.function.Predicate;

public class Shadowing {

    int i = 9;
    Predicate<Integer> isEven = i -> i % 2 == 0;
    
    public static void main(String... args) {
        final boolean isEven = new Shadowing().isEven.test(2);
        System.out.println(isEven);
    }

}
