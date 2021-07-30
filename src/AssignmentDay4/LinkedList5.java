package AssignmentDay4;

import java.util.LinkedList;

//5. Write a Java program to insert the specified element at the specified position in the linked list.
public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList<String> country = new LinkedList<>();
        country.add("United States");
        country.add("China");
        country.add("Canada");
        country.add("Uganda");
        country.add("Argentina");

        System.out.println(country);
        System.out.println("");
        country.add(5, "Japan");
        System.out.println(country);

    }
}
