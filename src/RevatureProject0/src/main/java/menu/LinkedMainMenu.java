package menu;

import dao.CustomerDAO;
import dao.CustomerDAOFactory;
import dao.UserDAO;
import dao.UserDAOFactory;
import display.UserMainMenu;
import pojo.Customer;
import pojo.User;

import java.sql.SQLException;

import static menu.Main.menuLog;
import static menu.Main.in;


public class LinkedMainMenu {
    public void mainMenu() throws SQLException {
        boolean finished = false;
        Customer customer = new Customer();
        CustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();
        User user = new User();
        UserDAO userDAO = UserDAOFactory.getUserDAO();
        UserMainMenu mainMenu = new UserMainMenu();
        menuLog.debug("Hello you have reached a menu");

        do {
            mainMenu.display();
            System.out.print("Select Option:");
            int input = in.nextInt();
            switch (input) {
                //become a customer.
                case 1:
                    menuLog.info("New Customer Account");
                    //Create Customer ACC
                    System.out.println("First Name: ");
                    String firstName = in.next();

                    System.out.println("Last Name: ");
                    String lastName = in.next();
                    in.nextLine(); //consumes a line so address's scanner doesn't skip


                    System.out.println("State: ");
                    String state = in.next();
                    in.nextLine();


                    System.out.println("SSN: ");
                    String ssn = in.nextLine();



                    //set customer object
                    customer.setFirstName(firstName);
                    customer.setLastName(lastName);
                    customer.setState(state);
                    customer.setSsn(ssn);

                    //add customer to db
                    customerDAO.addCustomer(customer);

                    System.out.println("Top Secret Info Keep Safe or Die");
                    System.out.println(customer);
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    menuLog.info("Create a new Account");
                    System.out.println("Enter Username: ");
                    String username = in.nextLine();
                    in.nextLine();

                    System.out.println("Enter Password: ");
                    String x = in.next();

                    user.setUsername(username);
                    user.setPassword(x);
                    user.setUserType("customer");
                    userDAO.createUser(user);

                    System.out.println("Top Secret Information keep safe or die");
                    System.out.println(user);
                    break;
                //log-in for customer
                case 3:
                    System.out.println("---------------------------------");
                    menuLog.info("Customer Login");
                    System.out.println("Enter Username: ");
                    username = in.next();

                    System.out.println("Enter Password: ");
                    x = in.next();

                    userDAO.authenticateCustomerLogin(username, x);
                    break;

                //login for employee
                case 4:
                    //EmpMenu.employeeMenu();
                    System.out.println("-------------------------");
                    menuLog.info("Employee Login");
                    System.out.println("Enter Username: ");
                    username = in.next();

                    System.out.println("Enter Password: ");
                    x = in.next();

                    userDAO.authenticateEmployeeLogin(username, x);
                    break;
                //quit
                case 0:
                    menuLog.info("Quitting");
                    System.out.println("Thanks for using banking app see ya next time!");
                    finished = true;
                    break;
            }
        } while (!finished);
    }

}