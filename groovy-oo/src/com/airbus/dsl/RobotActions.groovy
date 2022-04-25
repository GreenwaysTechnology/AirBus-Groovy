//import com.airbus.dsl.Robot

//def binding =new Binding([robot: new Robot()])
////def shell = new GroovyShell(binding)
////shell.evaluate(new File("Command.groovy"))
//
//
//GroovyShell shell = new GroovyShell(binding);

def shell = new GroovyShell()
shell.evaluate(
        new File("command.groovy")
)