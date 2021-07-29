package Day4;

import java.util.HashMap;

//3. Write a Java program to copy all of the mappings from the specified map to another map.
public class Question16 {
    public static void main(String[] args) {
        HashMap<Integer, String> copy = new HashMap<Integer, String>();
        HashMap<Integer, String> copy1 = new HashMap<Integer, String>();

        copy.put(1, "A");
        copy.put(2, "B");
        copy.put(3, "C");

        System.out.println(copy);

        copy1.put(4, "D");
        copy1.put(5, "E");
        copy1.put(6, "F");
        System.out.println(copy1);

        copy1.putAll(copy);
        System.out.println(copy1);


    }
}
