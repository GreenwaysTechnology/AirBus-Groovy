import groovy.json.JsonOutput

def data = [
        name     : "Foo Bar",
        year     : "2018",
        timestamp: "2018-03-08T00:00:00",
        tags     : ["person", "employee"],
        grade    : 3.14
]
def baseDir = "./"
def json_str = JsonOutput.toJson(data)
def json_beauty = JsonOutput.prettyPrint(json_str)
new File(baseDir, 'emp.json') << json_str
print json_beauty