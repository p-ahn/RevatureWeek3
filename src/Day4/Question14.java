package Day4;

import java.util.HashMap;
import java.util.Map;

//1. Write a Java program to associate the specified value with the specified key in a HashMap.
public class Question14 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "United States");
        map.put(2, "Canada");
        map.put(3, "China");
        map.put(4, "Uganda");

        for(Map.Entry x: map.entrySet()){
            System.out.println(x.getKey()+ " " + x.getValue());
        }

    }
}
