//List
println("List")
def list = [1, 2, 3, 4, 4, 5, 5]
list.each { item -> println(item) }

println("..................")

println("Set")
//Set
def set = [1, 2, 3, 4, 5, 3, 4, 6, 5] as HashSet
set.each { item -> println(item) }
