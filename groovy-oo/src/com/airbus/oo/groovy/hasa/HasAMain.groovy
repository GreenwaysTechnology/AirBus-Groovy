import com.airbus.oo.groovy.hasa.Address
import com.airbus.oo.groovy.hasa.Customer


def address = new Address(doorno: "10", street: "10th street", city: "Coimbatore", state: "TN", zipcode: "6632323")
def customer = new Customer(id: 1, firstName: "Subramanian", lastName: "Murguan", address: address)
println("${customer.firstName} ${customer.address.city}")

//another syntax to attach objects
def customer1 = new Customer(id: 1,
        firstName: "Subramanian",
        lastName: "Murguan",
        address: new Address(doorno: "10", street: "10th street", city: "Coimbatore",
                state: "TN", zipcode: "6632323"))
println("${customer1.firstName} ${customer1.address.city}")
