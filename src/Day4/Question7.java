package Day4;
import java.util.ArrayList;
import java.util.List;
//7. Write a Java program to search an element in a array list.
public class Question7 {
    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        // Search the value Red
        if (colors.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }
}
