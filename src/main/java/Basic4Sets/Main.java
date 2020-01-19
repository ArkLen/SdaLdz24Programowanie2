package Basic4Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Volkswagen", "Golf", "1VWBH7A33DC118080");
        Car car2 = new Car("Audi", "A3", "1FTSW21R08EC46917");
        Car car3 = new Car("Seat", "Leon", "1FTFW1CF6EKF51253");
        Car car4 = new Car("Audi", "A3", "1FMFU17538LA84228");
        Car car5 = new Car("Seat", "Ibiza", "1FTFW1CF6EKF51253");
        Car car6 = new Car("Volkswagen", "Passat", "1VWBH7A33DC118080");

        Set<Car> set = new HashSet<>();

        set.add(car1);
        set.add(car2);
        set.add(car3);
        set.add(car4);
        set.add(car5);
        set.add(car6);

        for (Car element : set) {
            System.out.println(element);

        }
    }
}

