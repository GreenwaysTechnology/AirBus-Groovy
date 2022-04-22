package com.airbus.oo.groovy.isa.typing;

public class Cat extends Animal{
    @Override
    public String eat() {
        return "Cat drinks milk";
    }
    //this is cat specific method
    public String huntRats(){
        return  "Cat Can Hunt rats";
    }
}
