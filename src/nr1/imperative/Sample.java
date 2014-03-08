package nr1.imperative;

import java.util.*;
import java.util.function.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    
    // external iterator
    for(int i = 0; i < numbers.size(); i++) {
      System.out.println(i);
    }
    
    // external iterator, slightly better
    for(int e : numbers) {
      System.out.println(e);
    }

    // internal iterator, verbose with inner classes
    numbers.forEach(new Consumer<Integer>() {
      public void accept(Integer number) {
        System.out.println(number);
      }
    });

    // lambda notation, redundant type
    numbers.forEach((Integer number) -> System.out.println(number));
    
    // office space pattern
    numbers.forEach(number -> System.out.println(number));
    
    // method handle
    numbers.forEach(System.out::println);
  }
}
