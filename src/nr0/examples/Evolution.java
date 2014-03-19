package nr0.examples;

import static java.lang.System.out;

import java.security.PrivilegedAction;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Evolution {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6});
        List<Integer> doubled =
          numbers.stream()
                 .map(i -> i * 2)
                 .collect(toList());
          new Date(2013, 12, 31);
//        // external iterator
//        for(int i = 0; i < numbers.size(); i++) {
//            System.out.println(i);
//        }
//
//        // external iterator, slightly better
//        for(int e : numbers) {
//            System.out.println(e);
//        }
//
//        // internal iterator, verbose with inner classes
//        numbers.forEach(new Consumer<Integer>() {
//            public void accept(Integer number) {
//                System.out.println(number);
//            }
//        });
//
//        // lambda notation, redundant type
//        numbers.forEach((Integer number) -> System.out.println(number));
//
//        // office space pattern
//        numbers.forEach(number -> System.out.println(number));
//
//        // method handle
//        numbers.forEach(System.out::println);
//
//        Supplier<String> option1 = () -> "done"; // Type?
//        Callable<String> option2 = () -> "done";
//        PrivilegedAction<String> option3 = () -> "done";
//
//        Supplier<Runnable> c = () -> () -> out.println("hi");
//        //Illegal: Object o = () -> out.println("hi");
//        Object o = (Runnable) () -> out.println("hi");
//
//        List<String> words = Arrays.asList(new String[] {"lambda", "java", "about time"});
//
//        Function<Integer, Integer> f1 = i -> i + 1;
//        f1.apply(1); // 2
//
//        int x = 5;
//        Function<Integer, Integer> f = i -> i + x;
//        f.apply(1); // 2
//
////        int x = 5;
////        Function<Integer, Integer> f = i -> i + ++x;
////        f.apply(1); // 2
//
//        Stream.of("stream", "of", "strings", "etc");
//
//        Optional<String> value = Optional.of("Bla");
//        Optional<String> empty = Optional.empty();
//
//        value.get();
//        value.orElse("something else");
//        value.ifPresent(v -> out.println(v));
//        value.isPresent();

            Stream.generate(() -> new Random().nextInt())
                  .limit(10)
                  .forEach(System.out::println);

        Stream.iterate(1, i -> i + 1)
              .limit(10)
              .forEach(System.out::println);

    }
}
