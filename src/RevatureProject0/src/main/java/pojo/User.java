package pojo;

public class User {
    private String username;
    private String password, userType;
    private int userID;
    private boolean isLoggedIn;

    public User() {
    }

    public User(String username, String password, String userType, int userID, boolean isLoggedIn) {
        this.username = username;
        this.password = password;
        this.userType = userType;
        this.userID = userID;
        this.isLoggedIn = isLoggedIn;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userID=" + userID +
                ", isLoggedIn=" + isLoggedIn +
                '}';
    }
}