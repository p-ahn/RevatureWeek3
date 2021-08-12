package menu;

import dao.*;
import display.CustomersMainMenu;
import pojo.Account;
import pojo.Customer;
import pojo.Transaction;

import java.sql.SQLException;
import static menu.Main.in;
import static menu.Main.menuLog;

public class LinkedCustomerMainMenu {


    public static void customerMenu() throws SQLException {
        CustomersMainMenu menu = new CustomersMainMenu();

        Customer customer = new Customer();
        CustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();

        Transaction transaction;
        TransactionDAO transactionDAO = TransactionDAOFactory.getTransactionDAO();

        AccountDAO accountDAO = AccountDAOFactory.getAccountDAO();
        Account account;


        java.util.Date date;


        boolean finished = false;
        int input;

        menuLog.info("LinkedCustomerMainMenu");
        do {
            menu.display();
            System.out.println(">> ");
            input = in.nextInt();
            switch (input) {

                case 1:
                    menuLog.info("Deposit money");
                    System.out.println("Select Account Number? ");
                    int accountNumber = in.nextInt();

                    System.out.println("Deposit amount: ");
                    double depositAmt = in.nextDouble();

                    date = new java.util.Date();



                    transaction = new Transaction();
                    transaction.setAccountNumber(accountNumber);
                    transaction.setAmount(depositAmt);
                    transaction.setTransactionType("Deposit");



                    accountDAO.depositToAccount(accountNumber, depositAmt);
                    transactionDAO.addTransaction(transaction);
                    break;

                case 2:
                    menuLog.info("Withdraw money");
                    System.out.println("Account name: ");
                    String accountName = in.next();

                    System.out.println("Account number: ");
                    accountNumber = in.nextInt();

                    System.out.println("Amount: ");
                    double withdrawAmt = in.nextDouble();

                    date = new java.util.Date();


                    account = new Account();
                    account.setAccountName(accountName);
                    account.setAccountNumber(accountNumber);


                    transaction = new Transaction();
                    transaction.setAmount(withdrawAmt);
                    transaction.setAccountNumber(accountNumber);
                    transaction.setTransactionType("Withdraw");

                    Account account1 = accountDAO.accountByNumber(accountNumber);
                    if (withdrawAmt < account1.getBalance()) {
                        account.setWithdrawAmt(withdrawAmt);
                        accountDAO.withdrawFromAccount(accountNumber, withdrawAmt);
                        transactionDAO.addTransaction(transaction);
                    } else {
                        System.out.println("The withdraw of $" + withdrawAmt + " will result in a negative balance");
                    }

                    break;


                case 3:
                    menuLog.info("Transfer funds");
                    System.out.println("Account Name: ");
                    accountName = in.next();

                    System.out.println("Account Number: ");
                    accountNumber = in.nextInt();

                    System.out.println("Amount to transfer: ");
                    withdrawAmt = in.nextDouble();

                    System.out.println("Account number for Transfer ");
                    int tAccountNumber = in.nextInt();

                    System.out.println("Account Name: ");
                    String tAccountName = in.next();

                    System.out.println("Deposit amount: ");
                    double tDepositAmt = in.nextDouble();

                    account = new Account();
                    account.setAccountNumber(accountNumber);
                    account.setAccountName(accountName);
                    account.setWithdrawAmt(withdrawAmt);
                    account.setTransferStatus("pending");
                    accountDAO.setTransferStatus(account);


                    Account taccount = new Account();
                    taccount.setBalance(tDepositAmt);
                    taccount.setAccountName(tAccountName);
                    taccount.setAccountNumber(tAccountNumber);
                    taccount.setTransferStatus("pending");
                    accountDAO.setTransferStatus(taccount);

                    if (taccount.getTransferStatus().equals(account.getTransferStatus())) {
                        accountDAO.withdrawFromAccount(accountNumber, withdrawAmt);
                        accountDAO.depositToAccount(tAccountNumber, tDepositAmt);

                        date = new java.util.Date();


                        transaction = new Transaction();
                        transaction.setAccountNumber(accountNumber);
                        transaction.setAmount(withdrawAmt);
                        transaction.setTransactionType("Transfer");

                        transactionDAO.addTransaction(transaction);


                        date = new java.util.Date();


                        transaction = new Transaction();
                        transaction.setAccountNumber(tAccountNumber);
                        transaction.setAmount(tDepositAmt);
                        transaction.setTransactionType("Transfer");

                        transactionDAO.addTransaction(transaction);


                        account.setTransferStatus("complete");
                        taccount.setTransferStatus("complete");
                        accountDAO.setTransferStatus(account);
                        accountDAO.setTransferStatus(taccount);
                    } else {
                        System.out.println("Transfer failed please try again");
                        date = new java.util.Date();


                        transaction = new Transaction();
                        transaction.setAccountNumber(accountNumber);
                        transaction.setAccountNumber(accountNumber);
                        transaction.setTransactionType("Failed Transfer");
                    }

                    break;



                case 4:
                    menuLog.info("Bank Creation Service");

                    System.out.println("Name of account: ");
                    accountName = in.next().toLowerCase();

                    System.out.println("Opening deposit amount: ");
                    double openingBal = in.nextDouble();

                    System.out.println("Customer ID: ");
                    int customerID = in.nextInt();

                    double interestRate;
                    if (accountName.equals("savings")) {
                        System.out.println("your interest rate is: 0.5APY");
                        interestRate = 0.5;
                    } else {
                        interestRate = 0;
                    }

                    double balance = openingBal;

                    String accStatus;
                    if (openingBal > 50) {
                        accStatus = "approved";
                    } else {
                        accStatus = "pending";
                    }

                    date = new java.util.Date();


                    account = new Account();
                    account.setCustomerID(customerID);
                    account.setOpeningBalance(openingBal);
                    account.setBalance(balance);
                    account.setAccountStatus(accStatus.toLowerCase());
                    account.setAccountName(accountName);
                    account.setInterest(interestRate);

                    accountDAO.addAccount(account);

                    Account a = accountDAO.accountByCustomerId(customerID);

                    System.out.println("Account number given: " + a.getAccountNumber());


                    Account account2;
                    account2 = accountDAO.accountByCustomerId(customerID);

                    transaction = new Transaction();
                    transaction.setAccountNumber(account2.getAccountNumber());
                    transaction.setTransactionType("New " + accountName + "'s" + " Account");


                    break;
                ///view your balance
                case 5:
                    menuLog.info("Viewing balance");
                    System.out.println("Account number: ");
                    accountNumber = in.nextInt();
                    account = accountDAO.accountByNumber(accountNumber);
                    System.out.println("Your balance is: " + account.getBalance());
                    break;

                //go back to main menu
                case 0:
                    menuLog.info("Logging out");
                    LinkedMainMenu mainMenu = new LinkedMainMenu();
                    finished = true;
                    mainMenu.mainMenu();
                    break;


            }
        } while (!finished);
    }
}