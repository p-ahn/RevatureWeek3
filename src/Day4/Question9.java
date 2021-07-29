package Day4;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

//9. Write a Java program to copy one array list into another.
public class Question9 {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<String>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        System.out.println("Numbers:" + numbers);

        List<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        System.out.println("Letters:" + letters);

        //copying letters to numbers

        Collections.copy(numbers, letters);
        System.out.println("");
        System.out.println("Numbers:" + numbers);
        System.out.println("Letters:" + letters);




    }
}
