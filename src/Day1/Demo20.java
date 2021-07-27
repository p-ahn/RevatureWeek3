package Day1;

class Calculator{

    int a = 20;
    int b = 10;

    public Calculator(){
        System.out.println("Parameter less constructor");
    }

    public Calculator(int x, int y){
        this.a = x;
        this. b = y;
    }

    public void addNumbers(){
        System.out.println(a + b);
    }
}


public class Demo20 {
    public static void main(String[] args) {
        Calculator call = new Calculator();
        call.addNumbers();

        Calculator call2 = new Calculator();
        call2.addNumbers();
    }
}
