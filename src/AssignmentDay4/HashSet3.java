package AssignmentDay4;

import java.util.HashSet;

//3. Write a Java program to get the number of elements in a hash set.
public class HashSet3 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers.size());
    }
}
