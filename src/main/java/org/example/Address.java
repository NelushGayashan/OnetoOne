package org.example;

public class Address {
    private int addressId;
    private String addressLine1, city, state, country;
    private int zipcode;
    private Employee employee;

    // Constructors, other methods, etc.

    // Setters
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    // Getters
    public int getAddressId() {
        return addressId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getZipcode() {
        return zipcode;
    }

    public Employee getEmployee() {
        return employee;
    }
}
