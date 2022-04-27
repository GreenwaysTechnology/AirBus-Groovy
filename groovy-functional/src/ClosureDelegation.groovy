// if you want to delegate

class Person {
    String name
}

class Visitor {
    String name
}
//define closure
//def sayGreet = {
//    println "this : " + this;
//    println "owner : " + owner;
//    println "Delegate : " + delegate
//}
def sayGreet = {
    //how to access instance variables of object
    delegate.name
}
def person = new Person(name: 'Subramanian')
def visitor = new Visitor(name: 'Ram')
//change Closure Relationship
sayGreet.delegate = person
println sayGreet()
sayGreet.delegate = visitor
println sayGreet()
//////////////////////////////////////////////////////////////////////////////////////////////////

class Util {
    def add = {
        delegate.a + delegate.b
    }
}

def util = new Util()

class Math {
    int a;
    int b
}

def math = new Math(a: 10, b: 20)
util.add.delegate = math
println util.add()














