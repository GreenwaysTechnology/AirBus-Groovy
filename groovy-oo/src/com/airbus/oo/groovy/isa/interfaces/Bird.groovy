package com.airbus.oo.groovy.isa.interfaces

class Bird implements Flyable ,Eatable {
    @Override
    String fly() {
        "Bird is flying"
    }

    @Override
    String eat() {
        return "Bird eats nuts"
    }
//extra method
    String buildNest(){
        "Bird building Nest"
    }
}
