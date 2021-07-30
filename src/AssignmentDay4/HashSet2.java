package AssignmentDay4;

import java.util.HashSet;
import java.util.Iterator;

//2. Write a Java program to iterate through all elements in a hash list.
public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> x = new HashSet<>();
        x.add("Apple");
        x.add("Grape");
        x.add("Banana");
        x.add("Orange");
        x.add("Watermelon");
        System.out.println("All Fruits:");

        for(Iterator i = x.iterator(); i.hasNext();){
            System.out.println(i.next());
        }



    }
}
