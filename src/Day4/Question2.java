package Day4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

//2. Write a Java program to iterate through all elements in a array list.
public class Question2 {
    public static void main(String[] args) {
        ArrayList<String> first = new ArrayList<>();
        first.add("Philip");
        first.add("John");
        first.add("Kat");


        Iterator iterator = first.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String name : first) {
            System.out.println(name);

        }
    }
}
