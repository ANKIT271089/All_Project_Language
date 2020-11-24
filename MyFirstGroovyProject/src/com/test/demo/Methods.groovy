package com.test.demo

//What is a method
//- named block of code
//- makes code modular and reusable
//- can take parameters
//- can have a return type

def BaiscMathod() {
	println "Hello India"
}

BaiscMathod()

def sum (int a ,int b) {
	println "sum is "+(a+b)
}
sum(3, 4)

def sum1 (int a=20, int b= 30) {
	println "sum is ${a+b}"
}

sum1()



def sub (int a , int b) {
	
	def c = a-b
	return c
}

def result = sub(10, 5)
print result








