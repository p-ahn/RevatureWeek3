package dao;

import pojo.Account;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {

    static PreparedStatement x;
    Connection connection = null;

    public AccountDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addAccount(Account account) throws SQLException {
        final String sql = "INSERT INTO accounts"
                + " (account_name,account_status,balance, opening_balance,   interest, transfer_status) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        x = connection.prepareStatement(sql);

        x.setString(1, account.getAccountName());
        x.setString(2, account.getAccountStatus());
        x.setInt(3, account.getCustomerID());
        x.setDouble(4, account.getBalance());
        x.setDouble(5, account.getOpeningBalance());
        x.setDouble(6, account.getInterest());
        x.setString(7, account.getTransferStatus());


        int count = x.executeUpdate();
        if (count > 0) {
            System.out.println("Account was successfully created!");
        } else {
            System.out.println("Have you tried turning it on and off again?");
        }
    }

    @Override
    public void setTransferStatus(Account account) throws SQLException {
        final String sql = "UPDATE accounts SET transfer_status = ? WHERE account_number = ?";
        x = connection.prepareStatement(sql);
        x.setString(1, account.getTransferStatus());
        x.setInt(2, account.getAccountNumber());
        x.executeUpdate();

    }

    @Override
    public List<Account> getTransferStatus(Account account1) throws SQLException {
        final String sql = "Select * from accounts where transfer_status = ? and account_number =?";
        x = connection.prepareStatement(sql);
        x.setString(1, "pending");
        x.setInt(2, account1.getAccountNumber());

        ResultSet rs  = x.executeQuery();
        List<Account> transferStatusList = new ArrayList<>();
        while(rs.next()){
            account1.setAccountNumber(rs.getInt("account_number"));
            account1.setAccountName(rs.getString("account_name"));
            account1.setAccountStatus(rs.getString("account_status"));
            account1.setCustomerID(rs.getInt("customer_id"));
            account1.setBalance(rs.getDouble("balance"));
            account1.setOpeningBalance(rs.getDouble("opening_balance"));
            account1.setInterest(rs.getDouble("interest"));
            account1.setTransferStatus(rs.getString("transfer_status"));
            transferStatusList.add(account1);
        }
        return transferStatusList;
    }


    @Override
    public void depositToAccount(int accountNumber, double amt) throws SQLException {
        final String sql = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
        x = connection.prepareStatement(sql);

        x.setDouble(1, amt);
        x.setInt(2, accountNumber);

        int count = x.executeUpdate();
        if (count > 0) {
            System.out.println("Successfully deposited");
        } else {
            System.out.println("Error: Please Try Again");
        }
    }

    @Override
    public void withdrawFromAccount(int accountNumber, double amt) throws SQLException {
        final String sqlUpdate = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
        x = connection.prepareStatement(sqlUpdate);
        AccountDAO accountDAO = AccountDAOFactory.getAccountDAO();

        x.setDouble(1, amt);
        x.setInt(2, accountNumber);
        int count = x.executeUpdate();
        if (count > 0) {
            System.out.println(amt + " Withdrawn");
        } else {
            System.out.println("Error: Try again");
        }

    }

    @Override
    public List<Account> viewPendingAccounts(Account account) throws SQLException {
        final String sql = "Select * FROM accounts where account_status = ?";
        x = connection.prepareStatement(sql);
        account.setAccountStatus("pending");
        x.setString(1, account.getAccountStatus());

        List<Account> accountList = new ArrayList<>();
        ResultSet rs = x.executeQuery();
        while (rs.next()) {
            account = new Account();
            account.setAccountNumber(rs.getInt("account_number"));
            account.setAccountName(rs.getString("account_name"));
            account.setAccountStatus(rs.getString("account_status"));
            account.setCustomerID(rs.getInt("customer_id"));
            account.setBalance(rs.getDouble("balance"));
            account.setOpeningBalance(rs.getDouble("opening_balance"));
            account.setInterest(rs.getDouble("interest"));
            account.setTransferStatus(rs.getString("transfer_status"));
            accountList.add(account);
        }
        return accountList;

    }

    @Override
    public void acceptOrRejectPendingAcc(Account account) throws SQLException {
        final String sql = "UPDATE accounts SET account_status = ? where customer_id = ? AND account_number = ?";
        x = connection.prepareStatement(sql);
        x.setInt(1, account.getAccountNumber());
        x.setString(3, account.getAccountStatus());
        x.setInt(4, account.getCustomerID());
        int count = x.executeUpdate();
        if (count > 0) System.out.println("Task completed");

    }

    @Override
    public void deleteAccount(int accountNumber) throws SQLException {
        final String sql = "DELETE FROM accounts WHERE account_number = ?";
        x = connection.prepareStatement(sql);

        x.setInt(1, accountNumber);

        int count = x.executeUpdate();
        if (count > 0) {
            System.out.println("Account successfully deleted");
        } else {
            System.out.println("Error: Try Again");
        }
    }

    @Override
    public List<Account> getAllAccounts(Account account) throws SQLException {
        List<Account> accountList = new ArrayList<>();
        final String sql = "SELECT * FROM accounts WHERE customer_id = ?";
        x = connection.prepareStatement(sql);


        x.setInt(1, account.getCustomerID());

        ResultSet rs = x.executeQuery();

        while (rs.next()) {
            account = new Account();
            account.setAccountNumber(rs.getInt("account_number"));
            account.setAccountName(rs.getString("account_name"));
            account.setAccountStatus(rs.getString("account_status"));
            account.setCustomerID(rs.getInt("customer_id"));
            account.setBalance(rs.getDouble("balance"));
            account.setOpeningBalance(rs.getDouble("opening_balance"));
            account.setInterest(rs.getDouble("interest"));

            accountList.add(account);
        }
        return accountList;
    }

    @Override
    public Account accountByNumber(int accountNumber) throws SQLException {
        final String sql = "SELECT * FROM accounts WHERE account_number = ?";
        x = connection.prepareStatement(sql);

        x.setInt(1, accountNumber);
        ResultSet rs = x.executeQuery();
        Account account = new Account();

        if (rs.next()) {
            account.setAccountNumber(rs.getInt("account_number"));
            account.setAccountName(rs.getString("account_name"));
            account.setAccountStatus(rs.getString("account_status"));
            account.setCustomerID(rs.getInt("customer_id"));
            account.setBalance(rs.getDouble("balance"));
            account.setOpeningBalance(rs.getDouble("opening_balance"));
            account.setInterest(rs.getDouble("interest"));
        } else {
            System.out.println("Error: Not In System");
        }
        return account;
    }

    @Override
    public Account accountByCustomerId(int customer_ID) throws SQLException {
        final String sql = "SELECT *  FROM accounts where customer_id = ?";
        x = connection.prepareStatement(sql);

        x.setInt(1, customer_ID);
        ResultSet rs = x.executeQuery();
        Account account = new Account();

        if (rs.next()) {
            account.setAccountNumber(rs.getInt("account_number"));

            account.setAccountName(rs.getString("account_name"));
            account.setAccountStatus(rs.getString("account_status"));
            account.setCustomerID(rs.getInt("customer_id"));
            account.setBalance(rs.getDouble("balance"));
            account.setOpeningBalance(rs.getDouble("opening_balance"));
            account.setInterest(rs.getDouble("interest"));
            account.setTransferStatus(rs.getString("transfer_status"));
        } else {
            System.out.println("Error: Not In System");
        }
        return account;
    }
}