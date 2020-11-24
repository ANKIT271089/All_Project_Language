package com.test.demo

//Finally block can be use without catch block also
try {

int i = 1/0

}

//catch (ArithmeticException exp1 ) {
//	println "This is simple arithemetic error"
//}

catch (Exception exp) {
	println "I am inside exception block"
	println exp.getCause()
	println exp.getMessage()
	//exp.printStackTrace()
}finally {
	println "I am inside finally block"
}

println "Another set of code" 



def i = 7, j = 0
try {
		def k = i / j
		
} 
catch (Exception exp2) {
	println "Arithmatic exeption"
}finally {
	println	 'reached here'  //always executed even if Exception thrown
} 

try{
	int num = 1/0
}catch(Exception exp){
	println "I am inside exception block"
	println "Exception is "+exp
}