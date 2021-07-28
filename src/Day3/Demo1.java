package Day3;

public class Demo1 {
    public static void main(String[] args) {

        String s1 = "Hello"; // creating string using java string literal
        char ch[] = { 'H', 'e', 'l', 'l', 'o' };

        String s2 = new String(ch);  // converting char array to string
        String s3 = new String("World"); // creating java string by using new keyword
        String s4 = new String(ch);
        String s5 = new String("Testing 1");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

    }
}
