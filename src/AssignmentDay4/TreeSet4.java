package AssignmentDay4;

import java.util.Iterator;
import java.util.TreeSet;

//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
public class TreeSet4 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);

        Iterator x = numbers.descendingIterator();
        while (x.hasNext()) {
            System.out.println(x.next());
        }
    }
}

