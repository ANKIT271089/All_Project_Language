package com.test.demo

//a block of code that can
//- take parameters
//- refer variables
//- return values
//- can be passed as parameter in a method

def closures1 = {println "Hello Bonn"}
closures1.call()

def closures2 = {age -> println "Hello $age"}

closures2.call("twenty")

def str = "Hello"
def closures3 = {age -> println "$str $age"} //Directly calling variable which is not possible in methods

closures3.call("twenty")

def myMethod(clos1) {
	clos1.call("ram")
}
myMethod(closures3)

def clousres4 = {
	
	a,b,c ->
	return (a+b+c)	
	
}
println clousres4(10,20,30)

def List1 = ["Apple","Apple2","Apple3"]
println List1.each { it }


def Map1 = [
	'Subject' : 'Groovy',
	'Time'   : 'Ninght'
	]
println Map1.each { it }

def List2 = [1,2,3,45,6]
println List2.find { value -> value == 45 }
println List2.findAll { value1 -> value1>=2 }

println List2.any { value3 -> value3 ==5 }
	
println List2.every { value4 -> value4 > 0  }

println List2.collect { value5 -> value5 * 0 }





	
























