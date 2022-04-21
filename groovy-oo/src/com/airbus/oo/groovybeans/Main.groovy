import com.airbus.oo.groovybeans.Message

//no arg constructor
def msg = new Message()
//setters
msg.message = "Hello" //groovy interally calls message.setMessage()
msg.to = "John"
msg.from = "Subramanian"
//getters
println("Message ${msg.message} ${msg.to} ${msg.from}")

//without . operator if you want to access the variables, without getter
println(msg.@message)

//parameterized constructor
//key:value ; key-instance variable; value ; variable value
def msg1 = new Message(message: "Hai", to: "Foo", from: "Bar")
println("Message ${msg1.message} ${msg1.to} ${msg1.from}")

def msg2 = new Message(message: "welcome")
println("Message ${msg2.message} ${msg2.to} ${msg2.from}")


