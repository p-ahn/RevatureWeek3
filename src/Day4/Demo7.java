package Day4;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo7 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");
        names.add("Philip");
        names.add("John");
        names.add("Ethan");


        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
