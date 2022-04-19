//methods : group biz logic

//static typed methods - style of static typed methods
//method declaration
void sayHello() {
    println("Hello Java Style")
}
//method invocation
sayHello();

//parameters and args

//name, message are args
void sayWelcome(String name, String message) {
    println("$message $name")
}

sayWelcome("Subramanian", "Hello") // parameters
//sayWelcome("Subramanian",34) // //wrong

//if method returns values
int add(int a, int b) {
    int c = a + b
    //return a + b // you are sending output to outside method
    return c
}

int result = add(10, 10) //  calling method
println("The add Result is $result")

//Return string
String getName() {
    return "Subramanian"
}

String name = getName()
println(name)
//biz logic with return
boolean login(String name, String password) {
    if (name == "admin" && password == "admin") {
        return true
    }
    return false
}

boolean isValid = login("admin", "admin")
if (isValid) {
    println("Login success")
} else {
    println("Login Failed")
}
//using tenary operator
isValid ?  println("Login success") :  println("Login Failed")

login("foo", "foo") ? println("Login success") : println("Login Failed")