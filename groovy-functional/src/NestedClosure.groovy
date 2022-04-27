/**
 * if you want to call inner closure
 * 1.within outer closure
 * 2.outside outer closure
 */
//def outerClosure = {
//    println "Outer closure"
//    def innerClosure = {
//        println "Inner Clsoure"
//        def innerMostClosure = {
//            println "InnerMost Closure"
//        }
//        innerMostClosure()
//    }
//    innerClosure()
//}
def outerClosure = {
    println "Outer closure"
    def innerClosure = {
        println "Inner Clsoure"
        def innerMostClosure = {
            println "InnerMost Closure"
        }
    }
}
//calling from outside class
outerClosure()()()
