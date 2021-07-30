package AssignmentDay4;
//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> letters = new LinkedList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");

        Iterator x = letters.listIterator(3);

        while (x.hasNext()){
            System.out.println(x.next());
        }


    }
}
