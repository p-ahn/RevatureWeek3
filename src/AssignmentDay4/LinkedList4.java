package AssignmentDay4;

import java.util.Iterator;
import java.util.LinkedList;

//4. Write a Java program to iterate a linked list in reverse order.
public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<String> pets = new LinkedList<>();
        pets.add("Dog");
        pets.add("Cat");
        pets.add("Hamster");
        pets.add("Snake");
        pets.add("Turtle");

        Iterator x = pets.descendingIterator();

        while(x.hasNext()){
            System.out.println(x.next());
        }

    }
}
