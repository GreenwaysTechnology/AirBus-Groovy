//single parameter
def sayHello = null

sayHello = { String name ->
    println("Hello $name")
}
sayHello("Subramanian")

sayHello = { name ->
    println("Hello $name")
}
sayHello("Subramanian")

//add it
sayHello = { it ->
    println("Hello $it")
}
sayHello("Subramanian")
//without any explicit parameter
sayHello = {println("Hello $it") }
sayHello("Subramanian")