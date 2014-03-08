package nr2.declarative;

import java.util.*;

public class Sample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    // imperative
    int totalOfValuesDoubled = 0;
    for(int number : numbers) {
      totalOfValuesDoubled += number * 2;
    }
    System.out.println(totalOfValuesDoubled);
    
    // declarative
    System.out.println(
      numbers.stream()
             .mapToInt(number -> number * 2)
             .sum());
  }
}
