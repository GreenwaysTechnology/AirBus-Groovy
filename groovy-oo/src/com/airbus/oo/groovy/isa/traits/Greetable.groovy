package com.airbus.oo.groovy.isa.traits

trait Greetable {
    abstract String name();
    String greeting() {
        "Hello ${name()}"
    }
}