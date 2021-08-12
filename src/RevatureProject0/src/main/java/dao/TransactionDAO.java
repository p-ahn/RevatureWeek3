package dao;

import pojo.Transaction;

import java.sql.SQLException;
import java.util.List;

public interface TransactionDAO {
    void addTransaction(Transaction transaction) throws SQLException;

    void updateTransaction(Transaction transaction) throws SQLException;

    void deleteTransaction(int accountNumber) throws SQLException;

    List<Transaction> getAllTransactions() throws SQLException;

    Transaction getTransactionByID(int accountNumber) throws SQLException;
}