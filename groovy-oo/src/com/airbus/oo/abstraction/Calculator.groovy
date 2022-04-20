package com.airbus.oo.abstraction

class Calculator {
    //state
    //instance variables
    int result
    int a, b //instance
    //methods
    int add(int a, int b ){ //local variables {
        this.a = a // local variable a's value is assigned to instance variable
        this.b = b
       // a=a //lvalue requ
        this.result = a + b
        return result
    }
    //groovy syntax
    def multiply(a=0,b=0){
        a*b
    }
}
