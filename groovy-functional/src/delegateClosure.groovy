def mycls = {
    println "this : " + this;
    println "Owner :" + owner // who is controlling this closure
    println "Delegate : " + delegate
}
mycls()

class Bar {
    def myls = {
        println "Bar "
        println "this : " + this;
        println "owner : " + owner;
        println "Delegate : " + delegate

    }
}

def myclass = new Bar();
myclass.myls()
