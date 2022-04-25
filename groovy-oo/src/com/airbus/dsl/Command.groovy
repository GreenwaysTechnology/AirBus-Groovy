package com.airbus.dsl

import static com.airbus.dsl.Direction.*

class Command {
    static  void main(String[] args) {
        def robot = new Robot()
        robot.move left
    }
}
