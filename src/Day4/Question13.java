package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//13. Write a Java program of swap two elements in an array list.
public class Question13 {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");

        for (String x : letters) {
            System.out.println(x);
        }
        Collections.swap(letters, 0, 2);
        System.out.println("");
        for (String y : letters) {

            System.out.println(y);

        }
    }
}
