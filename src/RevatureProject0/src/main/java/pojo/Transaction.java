package pojo;

public class Transaction {
    private double amount;
    private int accountNumber;
    private String transactionType;


    public Transaction() {
    }

    public Transaction(double amount, int accountNumber, String transactionType) {
        this.amount = amount;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }



    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", accountNumber=" + accountNumber +
                '}';
    }
}