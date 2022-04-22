package com.airbus.oo.groovy.isa.interfaces

class Airplane implements Flyable{
    @Override
    String fly() {
        return "AirPlane is flying"
    }
}
