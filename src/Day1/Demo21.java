package Day1;

class Car{
    public String name;
    public String color;
    public int price;
    public String engineType;

    public Car(String name, String color, int price, String engineType){
        this.name = name;
        this.color = color;
        this.price = price;
        this.engineType = engineType;
    }
    public Car(Car carObj){
        this.name = carObj.name;
        this.color = carObj.color;
        this.price = carObj.price;
        this.engineType = carObj.engineType;
    }
}

public class Demo21 {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "White", 10000, "Petrol");
        Car car2 = new Car(car1);

    }
}
