package dao;

import menu.LinkedCustomerMainMenu;
import menu.LinkedEmployeeMenu;
import pojo.User;
import util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    static PreparedStatement x;
    Connection connection = null;

    public UserDAOImpl() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void createUser(User user) throws SQLException {
        final String sql = "INSERT INTO users (username, password, user_type) VALUES (?, ?, ?)";
        x = connection.prepareStatement(sql);

        x.setString(1, user.getUsername());
        System.out.println(user.getUsername());
        x.setString(2, user.getPassword());
        x.setString(3, user.getUserType());

        int count = x.executeUpdate();
        if (count > 0) {
            System.out.println("User account created.");
        } else {
            System.out.println("Error: Please try again!");
        }
    }


    @Override
    public User retrieveUserID(int userID) throws SQLException {
        final String sql = "SELECT * FROM users WHERE userID = ?";
        x = connection.prepareStatement(sql);

        x.setInt(1, userID);
        ResultSet rs = x.executeQuery();
        User user = new User();

        if (rs.next()) {
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
        }
        return user;
    }


    @Override
    public void updateUsers(User user) throws SQLException {
        final String sql = "UPDATE users SET password = ? WHERE username = ?";
        x = connection.prepareStatement(sql);

        x.setString(1, user.getPassword());
        x.setString(2, user.getUsername());

        int count = x.executeUpdate();
        if (count > 0) {
            System.out.println("Password: Updated!");
        } else {
            System.out.println("Error : Invalid Username");
        }
    }


    @Override
    public void rmUser(int userID) throws SQLException {
        final String sql = "DELETE FROM users WHERE userID = ?";
        x = connection.prepareStatement(sql);

        x.setInt(1, userID);

        int count = x.executeUpdate();
        if (count > 0) {
            System.out.println("User successfully deleted.");
        } else {
            System.out.println("Incorrect UserID please\n"
                    + "Try viewing all users and confirm it is the correct User ID.");
        }
    }


    @Override
    public List<User> getUsers() throws SQLException {
        List<User> userList = new ArrayList<>();
        final String sql = "SELECT * FROM users";
        x = connection.prepareStatement(sql);

        ResultSet rs = x.executeQuery();
        while (rs.next()) {
            User user = new User();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setUserID(rs.getInt("userID"));
            userList.add(user);
        }

        return userList;
    }

    @Override
    public void authenticateCustomerLogin(String username, String password) throws SQLException {
        final String sql = "Select * FROM users where username = ? AND password = ?";
        x = connection.prepareStatement(sql);

        x.setString(1, username);
        x.setString(2, password);

        ResultSet rs = x.executeQuery();
        String dbUsername, dbPw;

        while (rs.next()) {
            dbUsername = rs.getString("username");
            dbPw = rs.getString("password");
            if (username.equals(dbUsername) && password.equals(dbPw)) {
                System.out.println("Login successful");
                LinkedCustomerMainMenu.customerMenu();
                break;
            } else {
                System.out.println("Invalid login information");
            }
        }
    }

    @Override
    public void authenticateEmployeeLogin(String username, String password) throws SQLException {
        final String sql = "Select * FROM users where username = ? AND password = ? AND user_type = ?";
        x = connection.prepareStatement(sql);
        String dbUsername, dbPw, dbUserType, userType = "admin";

        x.setString(1, username);
        x.setString(2, password);
        x.setString(3, userType);
        ResultSet rs = x.executeQuery();


        while (rs.next()) {
            dbUsername = rs.getString("username");
            dbPw = rs.getString("password");
            dbUserType = rs.getString("user_type");

            if (username.equals(dbUsername) && password.equals(dbPw) && userType.equals(dbUserType)) {
                System.out.println("Login successful");
                LinkedEmployeeMenu.employeeMenu();
                break;
            } else {
                System.out.println("Invalid login information");
            }
        }
    }


}