package com.airbus.oo.objectinit;

public class Product {
    //state
//    int id =1;
//    String name="Phone";
    private int id;
    private String name;

    //no arg - no arg constructor
    public Product() {
        this.id = 0;
        this.name = "defaultProduct";
    }

    //with id and name
    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(int id) {
        this.id = id;
        this.name = "defaultProduct";

    }

    public Product(String name) {
        this.name = name;
        this.id = 199;
    }

    //setters and getters -are used to read and write data.
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }

}
