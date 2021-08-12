package display;

public class EmployeeMainMenu implements StartMenu {
    @Override
    public void display() {
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("1. Approve or Reject an Account");
        System.out.println("2. View Customer's Accounts");
        System.out.println("3. View all transactions");
        System.out.println("0. Logout");
        System.out.println("------------------------------------");
    }
}

