import com.airbus.oo.abstraction.Employee

//Create Object

//Static typed way of creating Object
Employee employee = new Employee()
//access object properties
println("Employee Id : ${employee.id}")
println("Employee FirstName  : ${employee.firstName}")
println("Employee LastName : ${employee.lastName}")
println("Employee Salary : ${employee.salary}")
println("Employee Deparment : ${employee.department}")
println("Employee Role : ${employee.role}")

//Dynamic typed way of creating object
def emp = new Employee()
println("Employee Id : ${emp.id}")
println("Employee FirstName  : ${emp.firstName}")
println("Employee LastName : ${emp.lastName}")
println("Employee Salary : ${emp.salary}")
println("Employee Deparment : ${emp.department}")
println("Employee Role : ${emp.role}")
