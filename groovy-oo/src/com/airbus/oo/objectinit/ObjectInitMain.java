package com.airbus.oo.objectinit;

public class ObjectInitMain {
    public static void main(String[] args) {
//        Product product = new Product();
//        System.out.println(product.id);
//        System.out.println(product.name);

//        Product product = new Product();
//        //after object creation
//        product.id = 1;
//        product.name = "Phone";
//
//        System.out.println(product.id);
//        System.out.println(product.name);

//        //using constructor
//        Product product = new Product();
//        System.out.println(product.id);
//        System.out.println(product.name);
//        //arg constructor
//        Product product1 = new Product(20,"Books");
//        System.out.println(product1.id);
//        System.out.println(product1.name);
//
//        Product product2 = new Product(30);
//        System.out.println(product2.id);
//        System.out.println(product2.name);
//
//        Product product3 = new Product("Food Items");
//        System.out.println(product3.id);
//        System.out.println(product3.name);

        Product product = new Product();
        product.setId(1);
        product.setName("Phone");
        System.out.println("Id " + product.getId());
        System.out.println("Name " + product.getName());

        Patient patient = new Patient();
        patient.setId(1);
        patient.setName("Ram");
        patient.setCity("Coimbatore");
        patient.setEmail("ram@gmail.com");
        patient.setMobileNo("99999999");
        System.out.println(patient.getId() + " " + patient.getName() + " " + patient.getEmail());
    }
}
