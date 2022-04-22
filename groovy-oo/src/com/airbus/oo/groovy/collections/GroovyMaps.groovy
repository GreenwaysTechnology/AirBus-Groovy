//Map with items
def person = [
        id  : 1,
        name: 'Subramanian',
        city: 'Coimbatore'
]
println(person.city)

//Empty map:
def items = [:]
//later you can add values
items.put("id", 10)
items.put("qty", 9000)
items.put("inStock", true)

println(items.get("inStock"))
