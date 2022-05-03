import groovy.json.JsonSlurper

//map object
def json = new JsonSlurper()
def map = json.parseText('{"name" : "Subramanian"}')
println map

def jsonList = new JsonSlurper()
def list = jsonList.parseText('{ "myList": [4, 8, 15, 16, 23, 42] }')
println list
// parsing data from the json file.
//load json from json file
def jsonFile = new JsonSlurper()
def response = jsonFile.parse(new File("./", "todos.json"))
println response


