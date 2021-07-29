package Day4;

import java.util.ArrayList;

//3. Write a Java program to insert an element into the array list at the first position.
public class Question3 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Philip");
        name.add("Adri");
        name.add("Kat");

        System.out.println(name);

       name.add(0, "Hello");
        System.out.println(name);

    }
}
