package Day4;
//12. Write a Java program to extract a portion of a array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question12 {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");

        System.out.println(numbers);

        List<String> subList = numbers.subList(0, 1);
        System.out.println("");
        System.out.println(subList);
    }
}
