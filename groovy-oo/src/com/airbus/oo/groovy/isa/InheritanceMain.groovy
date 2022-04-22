import com.airbus.oo.groovy.isa.Employee

def emp = new Employee(empId: 1,firstName:"Subramanian",lastName: "Murugan" )
println("${emp.empId} ${emp.firstName} ${emp.lastName}")