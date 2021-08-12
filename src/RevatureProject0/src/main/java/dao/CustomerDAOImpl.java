package dao;

import pojo.Customer;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
     static PreparedStatement x;
    Connection connection = null;

    public CustomerDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void addCustomer(Customer customer) throws SQLException {
        final String sql ="INSERT INTO customers (first_name, last_name, state, ssn) values (?,?,?,?)";
        x = connection.prepareStatement(sql);

        x.setString(1, customer.getFirstName());
        x.setString(2, customer.getLastName());
        x.setString(3, customer.getState());
        x.setString(4, customer.getSsn());

        int count = x.executeUpdate();
        if (count > 0) {
            System.out.println("Successfully created!");
        } else {
            System.out.println("Error: Try again!");
        }
    }

    @Override
    public void updateCustomer(Customer customer) throws SQLException {
        final String sql = "UPDATE customers set first_name = ?, last_name = ?, state = ?  WHERE customer_id = ?";
        x = connection.prepareStatement(sql);

        x.setString(1, customer.getFirstName());
        x.setString(2, customer.getLastName());
        x.setString(3, customer.getState());
        x.setInt(4, customer.getCustomerID());


        int count = x.executeUpdate();
        if (count > 0) {
            System.out.println("Edit to account complete");
        } else {
            System.out.println("Error: Input Incorrect try again");
        }
    }

    @Override
    public void deleteCustomer(int id) throws SQLException {
        final String sql = "DELETE FROM customers WHERE customer_id = ?";
        x = connection.prepareStatement(sql);

        x.setInt(1, id);

        int count = x.executeUpdate();
        if (count > 0) {
            System.out.println("Deletion complete!");
        } else {
            System.out.println("Error: Please try again");
        }
    }

    @Override
    public List<Customer> getCustomer() throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        final String sql = "SELECT * FROM customers";
        x = connection.prepareStatement(sql);

        ResultSet rs = x.executeQuery();
        while (rs.next()) {
            Customer customer = new Customer();
            customer.setCustomerID(rs.getInt("customer_id"));
            customer.setFirstName(rs.getString("first_name"));
            customer.setLastName(rs.getString("last_name"));
            customer.setState(rs.getString("state"));
            customer.setSsn(rs.getString("ssn"));
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public Customer customerByID(int id) throws SQLException {
        final String sql = "SELECT * FROM customers where customer_id = ?";
        x = connection.prepareStatement(sql);
        x.setInt(1, id);

        ResultSet rs = x.executeQuery();
        Customer customer = new Customer();
        if (rs.next()) {
            customer.setCustomerID(rs.getInt("customer_id"));
            customer.setFirstName(rs.getString("first_name"));
            customer.setLastName(rs.getString("last_name"));
            customer.setState(rs.getString("state"));
            customer.setSsn(rs.getString("ssn"));
        }
        return customer;
    }

    @Override
    public Customer getCustomerBySSN(String SSN) throws SQLException {
        final String sql = "SELECT * FROM customers where ssn = ?";
        x = connection.prepareStatement(sql);
        x.setString(1, SSN);
        ResultSet rs = x.executeQuery();
        Customer customer = new Customer();
        if (rs.next()) {
            customer.setCustomerID(rs.getInt("customer_id"));
            customer.setFirstName(rs.getString("first_name"));
            customer.setLastName(rs.getString("last_name"));
            customer.setState(rs.getString("state"));
            customer.setSsn(rs.getString("ssn"));

        }

        return customer;
    }
}