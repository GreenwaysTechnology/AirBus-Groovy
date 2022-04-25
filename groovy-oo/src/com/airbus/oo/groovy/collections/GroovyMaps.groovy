//map

def product = [
        id   : 1,
        name : 'Phone',
        qty  : 100,
        price: 10000.78
]
//println(product.get(0))
product.each { entry -> println(entry) }

product.each { entry -> println("${entry.key} ${entry.value}") }


//nested Map
def users = [
        id    : 1,
        name  : 'Subramanian',
        skills: [
                skillId: 100,
                skill  : 'Groovy'
        ]
]
//println("Skill Id" + users.get("skills").get("skillId"))
//println("Skill Value" + users.get("skills").get("skill"))

//users.each { entry ->
//    {
////        if (entry.key instanceof java.util.Map) {
////            print("...")
////        }
//        println(entry.key + (entry.key instanceof java.util.Map) + " " + entry.value)
//
//    }
//}

print(".........")
users.each {key,value->
    println("${key} ${value}")
    if(value instanceof  java.util.Map){
        println(value.get("skillId") + value.get("skill"))
    }
}
