import com.airbus.oo.groovy.isa.traits.*

def bird = new Bird()
println(bird.fly())


//
def greetings = new Person();
println(greetings.greeting())

//binding trait dynamically
def machine = new Machine() as Advanced;
println machine.doStuff()

def flyingMachine = new Machine() as Flyable;
println flyingMachine.fly()

//have advanced feature with fly

def newMachine = new Machine()
//attach features
def newMachineWith = newMachine.withTraits(Advanced, Flyable)
println(newMachineWith.fly() + " " + newMachineWith.doStuff())