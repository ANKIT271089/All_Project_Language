package com.test.demo


/** Reading files **/

String filepath = "C:/Users/Ankit_Srivastava/eclipse-workspace/MyFirstGroovyProject/data.txt"

File myfile = new File(filepath) //Directly inside also we can give path

//Reading entire content as string

println myfile.text

//Collect lines in List

def List = myfile.collect { it }
println "List : $List"

//store file content in array

def array = myfile as String[]
println "Array : $array"

//Read file into a List of string

def lines = myfile.readLines()
println "line :$lines"


//read life line by line

myfile.eachLine  {x ->  //Clouser
	
	println "$x"
}


//read life line by line with line number

myfile.eachLine  {x ,i->  //Clouser i is linenumber
	
	println "$i:$x"
}


//read life line by line with line number
def linenumberrangei = 2..4
def lineList = []

myfile.eachLine  {x ,i->  //Clouser i is linenumber
	if (linenumberrangei.contains(i)) {
		lineList.add(x)
	}
}
println "$lineList"

//read with reader
def line1
myfile.withReader { reader1 ->
	while((line1 = reader1.readLine()) != null)
	println line1
}

def outputfile1 = "data1.txt"
def reader = myfile.newReader()
new File(outputfile1).append(reader)
reader.close()

//Working with binary files,read content type in byte

byte[] contents1 = myfile.bytes
println contents1


//size of your file in bytes
println myfile.length()

//Check if is a file or directory

println myfile.isFile()
println myfile.isDirectory()

//get list of file file any directory

new File("C:/Users/Ankit_Srivastava/Desktop/Java").eachFile {
	Pathinsidefile -> println Pathinsidefile.getAbsolutePath()
}

//recursively display all filesin a dir & sub dir

new File("C:/Users/Ankit_Srivastava/Desktop/Java").eachFileRecurse {
	Pathinsidefile -> println Pathinsidefile.getAbsolutePath()
}

//copy file data in another file
 def newfile = new File ("data3.txt")
 newfile << myfile.text
 
 
 //delete file
 
 newfile.delete()
 
 
 
 
 
 
 






















































 


