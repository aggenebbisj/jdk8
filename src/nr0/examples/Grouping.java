package nr0.examples;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {

    static class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("{%s, %d}", name, age);
        }

    }

    public static void main(String... args) {
        Stream<Person> people = Stream.of(new Person("Remko", 31), new Person("Brigitte", 31), new Person("Manon", 23), new Person("Matthijs", 30));
        

//        Map<String, List<Person>> peopleByName = people.collect(Collectors.groupingBy(p -> p.getName()));
//        System.out.println(peopleByName);
//        final Map<Integer, List<Person>> peopleByAge = people.collect(Collectors.groupingBy(Person::getAge));
//        System.out.println(peopleByAge);
//        final String peopleSeparated = people.map(Person::getName).collect(Collectors.joining(", "));
//        System.out.println(peopleSeparated);
//        final Map<Integer, Long> numberOfPeoplePerAge = people.collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
//        System.out.println(numberOfPeoplePerAge);
//        final Map<Integer, Map<String, List<Person>>> peopleByAgeAndName = 
//                people.collect(
//                        groupingBy(Person::getAge, 
//                                groupingBy(p -> p.getName().substring(0, 1))
//                                
//                        )
//                );
//        System.out.println(peopleByAgeAndName);
        
        final DoubleBinaryOperator averageAge = (age1, age2) -> { System.out.printf("age1 {%f}, age2 {%f}, avg = {%f}\n", age1, age2, (age1+age2)/2); return (age1 + age2) / 2; };
        
        double average = people.mapToDouble(Person::getAge)                
                               .reduce(0, averageAge);
        System.out.println(average);
    }

}
