package Day3;

public class Demo2 {
    public static void main(String[] args) {

        String str = "Hello";
        str.concat("World"); // we are using concat() method to append the string at the end
        System.out.println(str);  // will print Hello only bcoz strings are immutable object

        String str1 = "Hello";
        str1 = str1.concat("World");

        String str2 = "Testing 1";
        str2 = str2.concat("Testing 2");
        System.out.println(str1 + "\n" + str2);

    }
}
