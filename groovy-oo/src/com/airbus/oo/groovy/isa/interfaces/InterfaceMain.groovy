import com.airbus.oo.groovy.isa.interfaces.Airplane
import com.airbus.oo.groovy.isa.interfaces.Bird
import com.airbus.oo.groovy.isa.interfaces.Flyable

def flyBehaviour = null
//Flyable flyBehaviour =null
//with Bird
flyBehaviour = new Bird()
println(flyBehaviour.fly())
println(flyBehaviour.eat())
println(flyBehaviour.buildNest())
//with AirPlane
flyBehaviour = new Airplane()
println(flyBehaviour.fly())