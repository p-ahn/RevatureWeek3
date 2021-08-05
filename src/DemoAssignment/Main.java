package DemoAssignment;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        EmployeeDAO dao = EmployeeDAOFactory.getEmployeeDao();
        int options = 0;

        do {
            System.out.println("---------------------");
            System.out.println("Select Option:");
            System.out.println("---------------------");
            System.out.println("1 - Add Employee");
            System.out.println("2 - Update Employee");
            System.out.println("3 - Delete Employee");
            System.out.println("4 - Read Employee");
            System.out.println("5 - Read Employee by ID");
            System.out.println("6 - Exit");
            System.out.println("---------------------");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your option:");
            options = scanner.nextInt();

            switch (options) {
                case 1: {
                    System.out.println("Enter Name: ");
                    String name = scanner.next();
                    System.out.println("Enter Email: ");
                    String email = scanner.next();
                    Employee employee = new Employee();
                    employee.setName(name);
                    employee.setEmail(email);
                    dao.addEmployee(employee);
                    break;
                }

                case 2: {
                    System.out.println("Enter Name: ");
                    String name = scanner.next();
                    System.out.println("Enter email:");
                    String email = scanner.next();
                    System.out.println("Enter ID:");
                    int id = scanner.nextInt();
                    Employee employee = new Employee();
                    employee.setName(name);
                    employee.setEmail(email);
                    employee.setId(id);
                    dao.updateEmployee(employee);
                    break;


                }
                case 3: {
                    System.out.println("Enter ID:");
                    int id = scanner.nextInt();
                    dao.deleteEmployee(id);
                    break;


                }
                case 4: {
                    System.out.println("Listing Employees:");
                    List<Employee> employees = new ArrayList<>();
                    dao.getEmployees();
                    break;


                }
                case 5: {
                    System.out.println("Enter Id: ");
                    int id = scanner.nextInt();
                    Employee employee = dao.employeeById(id);
                    System.out.println(employee);
                    break;


                }
                case 6: {
                    System.out.println("");
                    System.out.println("-------------------");
                    System.out.println("Exiting Program");
                    System.out.println("-------------------");
                    System.exit(0);

                }
                default:
                    System.out.println("Select options between 1-6");


            }
        }
        while (options != 6);
    }
}
