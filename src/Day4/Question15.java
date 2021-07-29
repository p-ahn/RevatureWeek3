package Day4;

import java.util.HashMap;

//2. Write a Java program to count the number of key-value (size) mappings in a map.
public class Question15 {
    public static void main(String[] args) {
        HashMap<Integer, String> size = new HashMap<>();
        size.put(1, "Small");
        size.put(2, "Medium");
        size.put(3, "Large");
        size.put(4, "ExtraLarge");

        System.out.println(size.size());

    }
}
