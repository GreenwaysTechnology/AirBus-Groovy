def mycls = {
    println "this : " + this;
    println "Owner :"  + owner // who is controlling this closure
}
mycls()
class Foo {
    def myls = {
        println "Foo "
        println "this : " + this;
        println "owner : " + owner;
    }
}
def myclass = new Foo();
myclass.myls()
