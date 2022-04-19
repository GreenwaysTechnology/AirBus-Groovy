//def return values

def sayHello() {
    return "Hello"
}

println(sayHello())

def getIntValue() {
    return 100
}

println(getIntValue())

def calculate_(int a = 0, int b = 0) {
    return a + b  // expression
}

def calculate(int a = 0, int b = 0) {
    return "The result is ${a + b}"  // expression
}

println(calculate(13, 90))

//without return statement indicates that method by default returns

String getName_() {
    def firstName = 'Subramanian'
    def lastName = 'Murugan'
    def fullName = "$firstName $lastName"
    //old style
    return fullName
}

String getName() {
    def firstName = 'Subramanian'
    def lastName = 'Murugan'
    def fullName = "$firstName $lastName"
}

println(getName())

def getFullName() {
    def firstName = 'Subramanian'
    def lastName = 'Murugan'
    def fullName = "$firstName $lastName"
}

println(getFullName())
//return values with expressions and hardcoded values

def getPrice() {
    //here 100 to be returned
    100
}

println(getPrice())

def getTotalPrice() {
    def qty = 100
    def price = 900
    qty * price
}

println(getTotalPrice())

def iterate() {
    for (def i = 0; i < 10; i++) {
        println("I $i")
    }
}

def value = iterate()
println("Returned value is $value")
//empty method
def empty() {

}

def emptyResult = empty();
println("Empty Method Result $emptyResult")

//logic
def login(String name = "", String password = "") {
    (name == "admin") && (password == "admin")
}

login("admin", "admin") ? println("Login is Success") : println("Login is failed")
login("admin", "foo") ? println("Login is Success") : println("Login is failed")

//Receive the parameter and return the same
def getStockvalue(stock) {
    stock
}
println(getStockvalue(100))

