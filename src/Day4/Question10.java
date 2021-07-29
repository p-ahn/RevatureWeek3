package Day4;
//10. Write a Java program to shuffle elements in a array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Philip");
        names.add("Adri");
        names.add("Kat");

        System.out.println(names);

        Collections.shuffle(names);
        System.out.println("");
        System.out.println(names);


    }
}
