package Day3;

public class Demo9 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "HelloWorld";

        String str4 = str1 + str2;
        String str5 = str2 + str1;

        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);
        System.out.println(str5);
    }
}
