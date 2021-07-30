package AssignmentDay4;

import java.util.Iterator;
import java.util.LinkedList;

//2. Write a Java program to iterate through all elements in a linked list.
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Purple");

        System.out.println("All Colors:");
        for (Iterator i = colors.iterator(); i.hasNext();){
            System.out.println(i.next());
        }


    }
}
