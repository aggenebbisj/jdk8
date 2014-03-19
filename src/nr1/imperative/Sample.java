package nr1.imperative;

import static java.lang.System.out;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample {
  public static void main(String[] args) {
//    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//
//    // external iterator
//    for(int i = 0; i < numbers.size(); i++) {
//      System.out.println(i);
//    }
//
//    // external iterator, slightly better
//    for(int e : numbers) {
//      System.out.println(e);
//    }
//
//    // internal iterator, verbose with inner classes
//    numbers.forEach(new Consumer<Integer>() {
//      public void accept(Integer number) {
//        System.out.println(number);
//      }
//    });
//
//    // lambda notation, redundant type
//    numbers.forEach((Integer number) -> System.out.println(number));
//
//    // office space pattern
//    numbers.forEach(number -> System.out.println(number));
//
//    // method handle
//    numbers.forEach(System.out::println);

    Stream<String> words =
      Stream.of("stream", "of", "strings");

    // output: Stream.of("streams", "strings")
    Stream<String> longWords =
      words.filter(s -> s.length() > 4);

    // output: Stream.of(6, 7);
    Stream<Integer> lengths =
      longWords.map(s -> s.length());

    List<Integer> result =
      lengths.collect(Collectors.toList());

    System.out.println(result);

    Stream<String> chars = Stream.of("A","B","D","A","B");

      long count = chars.count();
      System.out.println(count);
//    System.out.println(chars.distinct().collect(Collectors.toList()));
//      Person person = null;
//      String street = "Unknown";
//      if (person != null
//          && person.getAddress() != null
//          && person.getAddress().getStreet() != null) {
//          street = person.getAddress().getStreet();
//      }

      Optional<Person> person = Optional.of(new Person());
      String street =
        person.map(Person::getAddress)
              .map(Address::getStreet)
              .orElse("Unknown");

      person.ifPresent(out::println);

      Set<String> s = chars.collect(
        HashSet::new,
        HashSet::add,
        HashSet::addAll
      );

      List<String> c = chars.collect(Collectors.toList());
  }
}

class Person {
    public Address getAddress() { return new Address(); };
}

class Address {
    public String getStreet() { return "street"; };
}