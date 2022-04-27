//This closure is defined inside script
def hello = {
    println this  // this points always current
}
hello()

//create Object
def h = new HelloClosure()
h.hello()