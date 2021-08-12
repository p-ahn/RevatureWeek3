package dao;

import pojo.Transaction;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TransactionDAOImpl implements TransactionDAO {
    static PreparedStatement x;
    Connection connection = null;

    public TransactionDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addTransaction(Transaction transaction) throws SQLException {
        final String sql = "INSERT INTO transactions (amount, account_number, transaction_type) VALUES (?, ?, ?)";
        x = connection.prepareStatement(sql);

        x.setDouble(1, transaction.getAmount());
        x.setInt(2, transaction.getAccountNumber());
        x.setString(3, transaction.getTransactionType());

        x.executeUpdate();

    }

    @Override
    public void updateTransaction(Transaction transaction) throws SQLException {
        final String sql = "UPDATE transactions SET amount = ? WHERE account_number = ?";
        x = connection.prepareStatement(sql);

        x.setDouble(1, transaction.getAmount());
        x.setInt(2, transaction.getAccountNumber());

        x.getUpdateCount();

    }

    @Override
    public void deleteTransaction(int accountNumber) throws SQLException {
        final String sql = "DELETE FROM transactions WHERE account_number = ?";
        x = connection.prepareStatement(sql);

        x.setInt(1, accountNumber);

        x.executeUpdate();

    }

    @Override
    public List<Transaction> getAllTransactions() throws SQLException {
        List<Transaction> transactionList = new ArrayList<>();
        final String sql = "call project0.sp_get_transactions() ";
        x = connection.prepareStatement(sql);

        ResultSet rs = x.executeQuery();

        while (rs.next()) {
            Transaction transaction = new Transaction();
            transaction.setAccountNumber(rs.getInt("account_number"));
            transaction.setAmount(rs.getDouble("amount"));

            transactionList.add(transaction);
        }

        return transactionList;
    }

    @Override
    public Transaction getTransactionByID(int accountNumber) throws SQLException {
        final String sql = "SELECT * FROM transactions WHERE account_number = ?";
        x = connection.prepareStatement(sql);

        x.setInt(1, accountNumber);
        ResultSet rs = x.executeQuery();
        Transaction transaction = new Transaction();

        if (rs.next()) {
            transaction.setAccountNumber(rs.getInt("account_number"));
            transaction.setAmount(rs.getDouble("amount"));
        } else {
            System.out.println("Transaction not found.");
        }

        return transaction;
    }
}