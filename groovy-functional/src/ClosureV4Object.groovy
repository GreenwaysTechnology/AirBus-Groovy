//Generics
Closure<Boolean> isOdd = {
    it % 2 != 0 // return true or false
}
isOdd(3) ? println("Odd") : println("Even")
//another way of calling closure
isOdd.call(4) ? println("Odd") : println("Even")