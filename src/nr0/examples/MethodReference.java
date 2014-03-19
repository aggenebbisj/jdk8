package nr0.examples;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.function.BiFunction;

public class MethodReference {

    public static void main(String[] args) {
        Person remko = new Person("Remko");
        Person martijn = new Person("Martijn");
        boolean r = foo(remko.getName(),
                        "R",
                        String::startsWith);
        System.out.println(r);
    }

    public static boolean foo(
            String s1,
            String s2,
            BiFunction<String, String, Boolean> f) {
      return f.apply(s1, s2);
    }
}

class Person {

    String name;
    LocalDate birthday;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }
}