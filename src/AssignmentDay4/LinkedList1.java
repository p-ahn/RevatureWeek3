package AssignmentDay4;

import java.util.LinkedList;

//1. Write a Java program to append the specified element to the end of a linked list.
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<>();
        name.add("Philip");
        name.add("John");
        name.add("Kat");
        name.add("Adri");
        name.add("Shaun");

        System.out.println(name);
        System.out.println("Adding element at last position:");
        name.addLast("Rose");
        System.out.println(name);
    }
}
