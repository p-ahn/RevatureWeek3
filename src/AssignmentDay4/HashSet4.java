package AssignmentDay4;

import java.util.HashSet;

//4. Write a Java program to empty an hash set.
public class HashSet4 {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Lexus");
        cars.add("Benz");
        cars.add("Audi");
        cars.add("Toyota");
        cars.add("BMW");

        System.out.println(cars);
        System.out.println("");
        cars.removeAll(cars);
        System.out.println(cars);


    }
}
