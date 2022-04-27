//List
def list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
//process data in pipelines : Data process is done in stage by stage
list.stream()
        .filter { it % 2 == 0 } //filter even numbers
        .map { it * 2 } //double it all even numbers
        .each { println it }

//i want to find out even numbers from 1 to 1000
def longList = 1..1000 // .. here is range operator

//find out even numbers ,find the first element
longList.stream()
        .filter { it % 2 == 0 }
        .findFirst().orElse(0) // here if element is present return it else return default value 0
        .each { println it }