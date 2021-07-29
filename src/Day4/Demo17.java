package Day4;

import java.util.Hashtable;
import java.util.Map;

public class Demo17 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Philip");
        hashtable.put(2, "Kat");
        hashtable.put(3, "John");
        hashtable.put(4, "Adri");

        for(Map.Entry entry: hashtable.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
            System.out.println(entry.getValue()+" : "+entry.getKey());
            System.out.println(entry.getClass()+" :"+entry.getValue());
            System.out.println("");
        }


    }
}
