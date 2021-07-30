package AssignmentDay4;

import java.util.Collections;
import java.util.HashSet;

//1. Write a Java program to append the specified element to the end of a hash set.
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> x = new HashSet<>();

        x.add(1);
        x.add(10);
        x.add(100);
        x.add(1000); //
        System.out.println(x);

        HashSet<Integer> y = new HashSet<>();
        y.add(20);
        y.add(200);
        y.addAll(x);
        System.out.println(y);


      

        }

    }



