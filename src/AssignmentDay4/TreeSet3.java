package AssignmentDay4;

import java.util.TreeSet;

//3. Write a Java program to add all the elements of a specified tree set to another tree set.
public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<String> food = new TreeSet<>();
        TreeSet<String> food1 = new TreeSet<>();

        food.add("Steak");
        food.add("Chicken");
        food.add("Spaghetti");

        food1.add("Lamb");
        food1.add("Sushi");
        food1.add("Hamburger");

        System.out.println(food);
        System.out.println("");
        System.out.println(food1);
        System.out.println("");

        food.addAll(food1);
        System.out.println(food);
    }
}
