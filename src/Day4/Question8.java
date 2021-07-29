package Day4;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
//8. Write a Java program to sort a given array list.
public class Question8 {
    public static void main(String[] args) {
        // Create a list and add some colors to the list
        List<String> names = new ArrayList<String>();
        names.add("Red");
        names.add("Green");
        names.add("Orange");
        names.add("White");
        names.add("Black");
        System.out.println("Before Sort: "+names);
        Collections.sort(names);
        System.out.println("After Sort: "+names);
    }
}

