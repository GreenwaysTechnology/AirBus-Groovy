package com.airbus.oo.groovy.isa.typing;

public class AnimalMain {
    public static void main(String[] args) {
        //Object creation syntax
        //syntax -1
        Cat cat  =new Cat();
        System.out.println(cat.eat());
        //syntax 2:
        Animal cat1 = new Cat();
        System.out.println(cat1.eat());
        Cat catTemp = (Cat)cat1;
        System.out.println(catTemp.huntRats());

        //Syntax 3:
        Object cat3 = new Cat();
        Cat cat3Temp = (Cat)cat3;
        cat3Temp.eat();
        cat3Temp.huntRats();

    }
}
