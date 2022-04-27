import groovy.transform.ToString

@ToString(includes = ['id', 'name'])
class Employee {
    Integer id
    String name
    Double salary
}

def emp = new Employee(id: 1, name: 'Subramanian', salary: 1000.78)
println emp
//println( emp.id + emp.name + emp.salary)