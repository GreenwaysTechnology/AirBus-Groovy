def baseDir = "./"
//eachLine reads data in the form of string
// new File(baseDir, 'haiku.txt').eachLine {
//     println it
// }

//read file with line no
// new File(baseDir, 'haiku.txt').eachLine { line,nb ->
//    println "$nb $line"
// }

//if you want to read file using java apis
// new File(baseDir,"haiku.txt").withReader { reader ->
//    while (reader.readLine()) {
//        println reader.readLine()
//    }
// }
//if you want to process file content.
//store file content into list
// def list = new File(baseDir, 'myfile.txt').collect {it}
// //you can convert into data stream:so that you can process
// list.stream().filter(item->item.startsWithIgnoreCase("a")).map(String::toUpperCase).each {println it}


// def file = new File(baseDir,"haiku.txt").eachByte {println it}

// def file = new File(baseDir,"haiku.txt").eachByte {println it as char}

// def file = new File(baseDir, "haiku.txt")
// byte[] contents = file.bytes
// println "length of the file $contents.length"
// contents.each { println it }

def file = new File(baseDir, "haiku.txt").newInputStream()
byte[] contents = file.bytes
println "length of the file $contents.length"
contents.each { println it }

def file = new File(baseDir, "haiku.txt").withInputStream { stream ->
   byte [] bytes = stream.bytes
   bytes.each {println it}
}