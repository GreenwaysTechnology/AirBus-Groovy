//Groovy Style methods : dynamic typed

def sayHello(){
    println("Hello Groovy method")
}
sayHello()
//args and parameters : args are style strong typing
def sayWelcome(String name,String message){
    println("$message $name")
}
sayWelcome("Subramanian","Hello")
//args and parameters with dynamic typed
def sayHai(def name){
   println("Hai $name")
}
sayHai("Subramanian")
//with def keyword
def doStuff_(def myvar){
    println("My Variable value is $myvar")
}
//without def keyword also valid
def doStuff(myvar){
    println("My Variable value is $myvar")
}
//you can pass any type of value
doStuff("I am passing string")
doStuff(1000)
doStuff(10.78)
doStuff(true)
doStuff() //no value means null

///drawbacks or trade off dynamic typed parameters
def calculate(a,b){
    def c = a * b
    println("The Result is $c")
}
calculate(10,10)
calculate(34.68,89.90)
//calculate(true , false) // you will get runtime error



