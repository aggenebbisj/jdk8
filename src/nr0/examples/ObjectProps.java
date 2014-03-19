package nr0.examples;

import java.util.function.Predicate;

public class ObjectProps {
    public static void main(String... args) throws Exception {
        Predicate<Integer> greaterThan2 = i -> {
            return i > 2;
        };
    
        Predicate<Integer> greaterThanTwo = i -> {
            return i > 2;
        };

System.out.println(greaterThan2.equals(greaterThanTwo));
    }
}
