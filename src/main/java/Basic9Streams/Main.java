package Basic9Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<String> namesStream = Stream.of("John", " Marry", "George", "Paul", "Alice", "Ann");

        namesStream.filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        System.out.println("---------------------------------------");

        List<String> namesList = Arrays.asList("John", " Marry", "George", "Paul", "Alice", "Ann");

        namesList.stream()
                .filter(e -> e.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        namesList
                .stream()
                .filter(name -> {
                    System.out.println("Filtering name: " + name);
                    return true;
                });

        System.out.println("***************************************");

        namesList
                .stream()
                .filter(name -> {
                    System.out.println("Filtering name: " + name);
                    return true;
                })
                .forEach(name -> System.out.println("Now name is printed: " + name));

        System.out.println("///////////////////////////////////////");

        Stream<Integer> numbers = Stream.of(1, 2, 3).filter(number -> number < 1);
        numbers.forEach(System.out::println);
        System.out.println("--------");
        //Na strumieniu można wykonać tylko jedną operację terminującą/kończącą. Inaczej rzuci wyjątkiem
        //numbers.forEach(System.out :: println);

        System.out.println("---------------------------------------");

        Person person1 = new Person("Piotr", "Zietek", "Zgierz", 28, 793522944);
        Person person2 = new Person("Adam", "Malysz", "Wisla", 42, 123456789);
        Person person3 = new Person("Kasia", "Kowalska", "Warszawa", 14, 111222333);

List<Person> allPerson = Arrays.asList(person1, person2, person3);
allPerson
        .stream()
        .filter(person -> person.getAge() >= 18)
        .forEach(person -> System.out.println("Person: " + person.getName() + " is adult."));

        System.out.println("***************************************");

        //List<Person> allPerson = Arrays.asList(person1, person2, person3);
        allPerson
                .stream()
                .filter(person -> person.getAge() >= 18)
                .map(person -> person.getName())
                .forEach(name -> System.out.println("Person: " + name + " is adult."));

        System.out.println("---------------------------------------");

        allPerson
                .stream()
                .skip(1)
                .forEach(person -> System.out.println("Hello, " + person.getName()));

        System.out.println("*******");

        allPerson
                .stream()
                .limit(2)
                .forEach(person -> System.out.println("Hello, " + person.getName()));


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        allPerson
                .stream()
                .map(Person::getName)
                //sortuje alfabetycznie
                .sorted()
                .forEach(name -> System.out.println("Hello, " + name));

        System.out.println("---------");

        allPerson
                .stream()
                .map(Person::getName)
                //sortuje alfabetycznie odwrotnie
                .sorted(Comparator.reverseOrder())
                .forEach(name -> System.out.println("Hello, " + name));

        System.out.println("------------");

        allPerson
                .stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .forEach(person -> System.out.println("Hello, " + person.getName()));

        System.out.println("-----------");

        allPerson
                .stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .forEach(person -> System.out.println("Hello, " + person.getName()));


        System.out.println("Hello World");


    }
}
