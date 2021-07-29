package Day4;
import java.util.ArrayList;
import java.util.List;

//5. Write a Java program to update specific array element by given element.
public class Question5 {
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
        // Update the third element with "Yellow"
        colors.set(2, "Yellow");
        // Print the list again
        System.out.println(colors);
    }
}

