package Abstractdemo


//Concereat method means we are putting body for method

//We van not create object for abstract class
abstract class Car {
	
	String name
	String colour
	int model
	
	def startengine() {
		
		println "Engine start $name"
	}
	
	abstract def topspeed(); 
	
}
