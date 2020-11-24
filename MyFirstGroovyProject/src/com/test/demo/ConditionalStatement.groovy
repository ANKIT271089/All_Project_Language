package com.test.demo

/*In control structure:-
 * Conditional structures if / else and switch / case
 */ 
 
//For single statement we can remove {} also but for good practice is better to have this
def num = 11

if (num==10) {
	println "number is 10"
}
else {
	println "number is not 10"
}

//Check Number is positive or negative

def number1 = 0
if (number1 > 0)
	println "Number is positive"
else if (number1 == 0)  //This is called nested else if but simple way to use switch-case
	println "Number is zero"
else
	println "Number is negative"
	
//switch-case	
	
int x = 0.5
def result = ""
switch(x) {
	  case 0:
	  result = "x is zero"
	  break
	  case {x>0}:
	  result = "x is +ve"
	  break
	  case {x<0}:
	  result = "x is -ve"
	  break
	  default:
	  result = "x is invalid number"
	  }
 println result
 
 
 def num1 = 'A'
 switch(num1){
	 case 0:
		 println "num is zero"
		 break
	 case {num1>0}:
		 println "num is positive"
		 break
	 case {num1<0}:
		 println "num is negative"
		 break
	 default:
		 println "invalid input"
 }
 
 def num2 = 'abc'
 switch(num2){
	 case 0:
		 println "num is zero"
		 break
	 case {num2>0}:
		 println "num is positive"
		 break
	 case {num2<0}:
		 println "num is negative"
		 break
	 default:
		 println "invalid input"
 }
 


	
	
		
	
	