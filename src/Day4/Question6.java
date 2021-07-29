package Day4;
import java.util.ArrayList;
import java.util.List;
//6. Write a Java program to remove the third element from a array list.
public class Question6 {
    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        // Print the list
        System.out.println(colors);
        // Remove the third element from the list.
        colors.remove(2);
        // Print the list again
        System.out.println("After removing third element from the list:\n"+colors);
    }
}

