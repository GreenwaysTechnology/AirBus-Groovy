import com.airbus.oo.groovy.isa.abstractclasses.Cow
import com.airbus.oo.groovy.isa.abstractclasses.Tiger

def animal = null
animal = new Tiger()
println(animal.eat() + " " + animal.saveAnimals())

animal = new Cow()
println(animal.eat() + " " + animal.saveAnimals())
