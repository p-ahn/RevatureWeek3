package Day3;

import java.util.Arrays;

public class Demo10 {
    public static void main(String[] args) {
        // mark@gmail.com
        // +91-99123456
        String message = "Hello, welcome to java";
        String[] result = message.split(",");
        String message1 = "My, name is Philip";
        String[] result1 = message1.split(",");
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));

    }
}