package AssignmentDay4;

import java.util.TreeSet;

//1.Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Black");
        colors.add("Green");
        colors.add("Orange");
        System.out.println(colors);


    }
}
