package com.test.demo

File mywritefile = new File ("data4.txt")

mywritefile.write("This is line Ankit1")
mywritefile << "\nThis is line Ankit2"

//mywritefile.text = "This is line Ankit3" //Overwrite everything

//print mywritefile.text

mywritefile.withWriter { writer ->          //Overwrite everything
	writer.writeLine("This is line Ankit4")
	
}

mywritefile.append("This is line Ankit5")
println mywritefile.text
//
//println mywritefile.length()
//println mywritefile.isFile()
//println mywritefile.isHidden() 
//println mywritefile.isDirectory()
//
//def newFile = ("data5.text")
//newFile << mywritefile.text
//
////mywritefile.bytes = []  // Delete all data
//
//mywritefile.renameTo("newname1")

mywritefile.delete()










