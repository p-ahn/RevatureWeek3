package display;

public class CustomersMainMenu implements StartMenu{
    @Override
    public void display() {
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("1. Deposit Funds");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Transfer Funds");
        System.out.println("4. Create a new account");
        System.out.println("5. View account balance");
        System.out.println("0. Logout");
        System.out.println("---------------------------");
    }
}

