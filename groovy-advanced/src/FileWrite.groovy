def baseDir="./"

//Step: 1 read file For 
def myFile = new File(baseDir,"version.txt") 
//extract text content
def text = myFile.text
//declare pattern to match String NEW_VERSION = 1.0.1
def (foundText) = (text =~ /NEW_VERSION = (\d{1,3})\.(\d{1,3})\.(\d{1,3})/)[0]

//value to be supplied to replace existing version infro
def version = "4.0.1"

//Write Operation
def file =  new File(baseDir , "version.txt")
//replace old string to new string
def newConfig = file.text.replaceAll(foundText, "NEW_VERSION = ${version}")
//update the file with new data
file.text = newConfig
println text

