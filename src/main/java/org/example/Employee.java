package org.example;

public class Employee {
    private int employeeId;
    private String fname, lname, email;
    private Address address;

    // Constructors, other methods, etc.

    // Setters
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }
}
