import com.airbus.oo.groovy.isa.typing.Car

def myVar = null

myVar = new Car()
//myVar = (Car) myVar - this code  groovy writes automatically
println(myVar.startEngine())




