package com.airbus.oo.groovybeans

//by default groovy class is public classes
class Message {
    //state  // here variables must not be marked private,
    // the reason groovy generates , setters and getters for us
    String message
    String to
    String from
    //can i declare the variables using def keyword : yes, but not recommended
//    def message
//    def to
//    def from
}
