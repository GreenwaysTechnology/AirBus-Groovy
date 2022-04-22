package com.airbus.oo.groovy.isa.typing

class Car extends Vehicle{
    //override method
    def startEngine() {
        "Car engine starts" + super.startEngine()
    }
}
