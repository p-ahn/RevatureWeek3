package display;

public class UserMainMenu implements StartMenu {
    @Override
    public void display() {
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("1. Create customer account");
        System.out.println("2. Account Registration.");
        System.out.println("3. Login as Customer");
        System.out.println("4. Login as Employee");
        System.out.println("0. Exit Program");
        System.out.println("---------------------------------");
    }
}

