
def process = "ls -l".execute()
// println "Found text ${process.text}"
//println process
process.in.eachLine { line ->               
    println line                            
}
