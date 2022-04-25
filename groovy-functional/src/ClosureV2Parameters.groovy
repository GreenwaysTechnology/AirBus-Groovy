//Groovy closure parameters and args

//-> Arrow : which separates body of the function and args
//Strong typing
def add = null
add = { int a, int b ->
    def result = a + b
    println("The Result is ${result}")
}
add(10, 10)

//if you dont pass values
add = { int a = 0, int b = 0 ->
    def result = a + b
    println("The Result is ${result}")
}
add()

//dynamic parameters
add = { def a = 0, def b = 0 ->
    def result = a + b
    println("The Result is ${result}")
}
add(5, 8)

//dynamic parameters without even def keyword
add = { a = 0, b = 0 ->
    def result = a + b
    println("The Result is ${result}")
}
add(5, 8)