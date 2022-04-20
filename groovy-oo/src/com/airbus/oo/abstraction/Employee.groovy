package com.airbus.oo.abstraction

class Employee {
    //state -data
    int id = 1 // 4 bytes
    String firstName = "Subramanian" // 2 byte for each character -  10 *2 =20bytes
    String lastName = "Murugan" // 5 *2 = 10 bytes
    double salary = 100000 // 8 bytes
    String department = "Dev Ops" // 10 bytes
    String role = "Consultant" // 10 bytes
}
//total bytes = 4 + 20 +10+8+10+10 => 62bytes => size of object would be 62bytes