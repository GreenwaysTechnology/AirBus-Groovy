//single params
def outerClosure = {
    println "Outer closure $it"
    def innerClosure = {
        println "Inner Clsoure $it"
        def innerMostClosure = {
            println "InnerMost Closure $it"
        }
    }
}
//calling from outside class
outerClosure("Hello")("How are you")("Welcome")
def multiArgsOuter = { String name, String message ->
    println "Outer closure $name $message"
    def multiArgsInner = { String nameOne = "one", String messageOne = "msg1" ->
        println "Inner Clsoure $nameOne $messageOne"
        def multiArgsInnerMost = { String nameTwo = "n2", String messageTwo = "msg2" ->
            println "InnerMost Closure $nameTwo $messageTwo"
        }
    }
}
multiArgsOuter('Subramanian', 'Hello')()()