package Day4;

import java.util.ArrayList;

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
public class Question4 {
        public static void main(String[] args) {
            ArrayList<String> name = new ArrayList<>();
            name.add("Philip");
            name.add("Adri");
            name.add("Kat");

            System.out.println(name);

            System.out.println(name.get(2));

        }
    }


