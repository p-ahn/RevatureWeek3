package Day2;

class Student {
    public int rollNumber;
    public String name;
    static public String schoolName = "ABC School";
}

public class Demo1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.rollNumber = 1;
        student1.name = "Mark";

        Student student2 = new Student();
        student2.rollNumber = 2;
        student2.name = "John";

        System.out.println(student1.name + " " +student1.rollNumber);
        System.out.println(student2.name + " " +student2.rollNumber);
    }
}
