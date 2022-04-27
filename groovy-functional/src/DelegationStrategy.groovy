//Delegation Strategy: how to lookup the properties
//def name = 'foo'
//def upperCasedName = {
//    println "this : ${this}"
//    println "Owner : ${owner}"
//    println "Delegate : ${delegate}"
//    println("${name.toUpperCase()}")
//}
//upperCasedName()

//script append method: writer's owner method
def append(String str) {
    "Fake append"
}

Closure writer = {
    println "Owner $owner"
    println "this $this"
    println "delegate ${delegate}"
    println append(it);
}

def greet(String message) {
    "Greet $message"
}

def sayGreet = {
    greet it
}
writer "Hai"
println " ........"
StringBuffer sb = new StringBuffer();
//by default groovy looksup methods in the owner, if you want to change
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb
writer "Hello"
//First lookup sayGreet in the StringBuffer
sayGreet.resolveStrategy = Closure.DELEGATE_FIRST
sayGreet.delegate = sb
println sayGreet("Hello")

