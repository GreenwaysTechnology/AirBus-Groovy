// return closure from method or another closure.

//def counter() {
//    int a = 0;
//    def innerClosure = {
//        ++a; //closure returns value
//    }
//    return innerClosure;
//}
//Without Return Statement:
//def counter() {
//    int a = 0;
//    def innerClosure = {
//        ++a;
//    }
//}
//without assigning closure
def counter() {
    int a = 0;
    //This is invalid , because compiler understands that {} is function or scope syntax
//    {
//        ++a;
//    }
    //if you want to return clsoure without assigning you have to use return statement
    return {
        ++a;
    }
}

def res = counter()
println res()
println res.call()
println counter().call()

//return closure from another closure

def myCounter = {
    int a = 0;
    return {
        ++a + it
    }
}
println(myCounter().call(10))