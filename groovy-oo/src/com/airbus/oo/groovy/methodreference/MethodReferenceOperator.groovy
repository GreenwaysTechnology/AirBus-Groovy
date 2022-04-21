import com.airbus.oo.groovy.methodreference.Greeter

def greeter= new Greeter()
//method is called
println(greeter.sayHello()) //direct method call

//method can be stored inside variable and later it can be called.
def hai = greeter.&sayHello
println(hai())


