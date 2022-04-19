//Groovy allows to skip parameters

def sayHello_(String name) {
    println("name $name")
}

def sayHello(name) {
    println("name $name")
}
//passing parameters
sayHello("Subramanian")
//skip parameters
sayHello()

//what if i dont pass value, how to replace null with some meaningful values
//default values
def sayHai(name = "Foo") {
    println("Hai $name")
}

sayHai("Ram")
sayHai()

def add_(int a = 0, int b = 0) {
    int c = a + b
    println("C is $c")
}

def add(Integer a = 0, Integer b = 0) {
    int c = a + b
    println("C is $c")
}

add(1, 3)
add()
//add("test")