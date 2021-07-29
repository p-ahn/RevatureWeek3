package Day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo15 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name", "Mark");
        map.put("roll", 1000);
        map.put("email", "m@gmail.com");
        map.put("active", true);

        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            // converting to map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }


    }
}
