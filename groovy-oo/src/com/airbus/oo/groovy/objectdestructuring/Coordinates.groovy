package com.airbus.oo.groovy.objectdestructuring

class Coordinates {
    double latitutde;
    double longitude;
    //object destructing api
    def getAt(int idx) {
        if (idx == 0) latitutde
        else if (idx == 1) longitude
        else throw new Exception("Property not found")
    }
}
