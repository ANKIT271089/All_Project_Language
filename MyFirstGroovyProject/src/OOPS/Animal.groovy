package OOPS

//Process where one class acquires properties(methods and fields) from another class
//
//parent  child
//super sub
//base derived

class Animal {

	String name
	String breed
	
	def eats () {
		
		println "$name eats"
		
	}
	
	def moves() {
		
		println "$name moves"
	}
}

