package CalculatorApp;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double a, b, result;
        int choice;

        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("---------------------------");
            System.out.println("Select Option:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit Program");
            System.out.println("---------------------------");
            choice = scan.nextInt();

            switch (choice) {
                case 1:

                    System.out.println("Enter Two Numbers: ");
                    a = scan.nextDouble();
                    b = scan.nextDouble();
                    result = a + b;
                    System.out.println("Total= " + result);
                    break;
                case 2:
                    System.out.println("Enter Two Numbers: ");
                    a = scan.nextDouble();
                    b = scan.nextDouble();
                    result = a - b;
                    System.out.println("Total= " + result);
                    break;
                case 3:
                    System.out.println("Enter Two Numbers: ");
                    a = scan.nextDouble();
                    b = scan.nextDouble();
                    result = a * b;
                    System.out.println("Total= " + result);
                    break;

                case 4:
                    System.out.println("Enter Two Numbers: ");
                    a = scan.nextDouble();
                    b = scan.nextDouble();
                    result = a / b;
                    System.out.println("Total= " + result);
                    break;
                case 5:
                    System.out.println("Exiting Program");
                    System.exit(0);
                    break;
                default:
            }

        } while(choice !=5);
    }
}