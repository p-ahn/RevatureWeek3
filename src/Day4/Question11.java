package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//11. Write a Java program to reverse elements in a array list.
public class Question11 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Purple");

        System.out.println(colors);

        Collections.reverse(colors);
        System.out.println("");
        System.out.println(colors);
    }
}
