package AssignmentDay4;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.TreeSet;

//2. Write a Java program to iterate through all elements in a tree set.
public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<String> name = new TreeSet<>();
        name.add("Philip");
        name.add("John");
        name.add("Kat");
        name.add("Adri");
        name.add("Shaun");

        System.out.println("All Names:");
        for (Iterator i = name.iterator(); i.hasNext();){
            System.out.println(i.next());


        }



    }
}
