package Day2;

public class Demo7 {
    public static void main(String[] args) {
        String message = "Hello World";

        System.out.println(message.indexOf('o'));  // 4
        System.out.println(message.indexOf('o', 5));  //7
        System.out.println(message.indexOf("l", 7));  // 2
    }
}