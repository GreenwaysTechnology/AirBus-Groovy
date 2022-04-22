import com.airbus.oo.groovy.isa.typing.overloading.Calculator
import com.airbus.oo.groovy.isa.typing.overloading.Person

def calc = new Calculator()
println(calc.add(10, 10))
println(calc.add(3, 8, 9))
//constructor overloading
def person = new Person(id: 1, name: 'Test')
def person2 = new Person(id: 1)
def person3 = new Person(name: 'test')