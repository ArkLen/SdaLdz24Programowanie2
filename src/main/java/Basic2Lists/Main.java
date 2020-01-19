package Basic2Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> arrayList = new ArrayList<>();

        arrayList.add(new Person("Piotr", "Zietek", "Zgierz", 28, 793522944));
        arrayList.add(new Person("Adam", "Malysz", "Wisla", 42, 123456789));
        arrayList.add(new Person("Ala", "Makota", "Warszawa", 15, 111222333));
        arrayList.add(new Person("Julisz", "Slowacki", "Krakow", 40, 10203040));
        arrayList.add(new Person("Tomasz", "Kowalski", "Lodz", 12, 13342523));

        System.out.println(arrayList);

        System.out.println("-------------------------------------------------------------------");

        for (Person person : arrayList) {
            if (person.getAge() > 20) {
                System.out.println(person);
            }
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        for (Person person : arrayList) {
            if (person.getPhone() % 2 == 0) {
                System.out.println(person);
            }

        }

        System.out.println("------------------------------------------------------------------------");

        int suma = 0;
        for (Person person : arrayList) {
            suma = suma + person.getAge();


        }
        System.out.println(suma);


        System.out.println("***********************************************************************");

    List<Person> arrayLisyCopy = new ArrayList<>(arrayList);
        System.out.println(arrayLisyCopy);






    }


}
