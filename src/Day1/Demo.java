package Day1;

public class Demo {

    int x = 10; //this can be used anywhere (Global Variable) (Instance Variable)
    static int z = 100; // static variable

    public void addNumber(){
        //static int d = 10; //not allowed
        int a = 10; //local variable
        int b = 20;
        System.out.print(a + b);
    }

    public void subNumber(){
        int y = 5;
        System.out.print(x - y);

    }

    public static void main(String[]args){

    }
}
