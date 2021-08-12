package pojo;

public class Customer {
    private int customerID;
    private String firstName, lastName, state, ssn;


    public Customer() {
    }

    public Customer(int customerID, String firstName, String lastName, String state, String ssn) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.ssn = ssn;

    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}