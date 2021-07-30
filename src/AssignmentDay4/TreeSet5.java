package AssignmentDay4;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

//5. Write a Java program to get the first and last elements in a tree set
public class TreeSet5 {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Watermelon");
        fruits.add("DragonFruit");

        System.out.println(fruits);

        Object x = fruits.first();
        System.out.println("First: "  + x);

        Object y = fruits.last();
        System.out.println("Last: "  + y);

    }
}
