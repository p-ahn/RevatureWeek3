package Day4;
import java.util.ArrayList;

//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
public class Question1 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");
        colors.add("Black");


        System.out.println(colors);
    }
}
