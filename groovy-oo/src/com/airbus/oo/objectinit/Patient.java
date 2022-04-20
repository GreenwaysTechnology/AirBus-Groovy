package com.airbus.oo.objectinit;

public class Patient {
    private int id;
    private String name;
    private String city;
    private String mobileNo;
    private String email;

    public Patient() {

    }

    public Patient(int id, String name, String city, String mobileNo, String email) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //setters and getters

    //constructors
}
