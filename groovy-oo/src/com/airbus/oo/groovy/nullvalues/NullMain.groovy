import com.airbus.oo.groovy.nullvalues.Product


//product variable here not pointing any valid memory address
Product product = null
//println(product.id)
//safe navigation operator will safely handle null errors
//def res = product?.id
//println("Result ${res}") //null
//Product product = new Product(id:1000)

if (product?.id) {
    println(product.id)
} else {
    println("No Product Id")
}
//using tenary we can give default values

println(product?.id ? product.id : 10)

//using elvish we can give default values
println(product?.id ?: 10)


//here you have initalized the variable called "product1 with valid Memory address"
Product product1 = new Product()
product1.id = 1
println(product1.id)