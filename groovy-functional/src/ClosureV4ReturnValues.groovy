//How to return values from the groovy.
def add = null;
add = { a = 1, b = 2 ->
    def result = a + b;
    return result;
}
println(add(10, 10))
//no return statement is needed.
add = { a = 1, b = 2 ->
    def result = a + b;
    result;
}
println(add(10, 10))
/////////////////////////////////////////////////////////////////////////////////
// if you have single parameter and you want to return
def getName = { it }
println(getName('Ram'))
