//Function as parameter

//method takes String parameter
def sayGreet(String name) {
    println "$name"
}
//hardcode value
sayGreet('Subramanian')
def firstName = 'Subramanian';
sayGreet(firstName);
///////////////////////////////////////////////////////////////////////////////////////////////////
//callback is just Variable going to hold function
def connect(Closure<Void> callback) {
    //call the variable
    callback()
}

//passing closure variable
def webServer = {
    println "WebServer is connecting"
}
connect(webServer)
//passing closure directly
connect({
    println "My another web Server"
})
//DSL code : Ommiting ()
connect {
    println "My another web Server "
}
///

