package com.test.demo
//
//1.upto(5){
//	println "I love Groovy"
//}
//
//
//1.step(10,2){
//	println "$it"
//}
//
//def x = 0
//def y = 5
//while ( y-- > 0 ) {
//	x++
//}
//println x
//
//
//try{
//	int num = 1/0
//}catch(Exception exp){
//	println "I am inside exception block"
//}
//println "I am outside exception"
//
//
//def str = "Groovy"
//print str.length()

//def str = "RAGHAV"
//print str.substring(3)
//
////def str = "RAGHAV"
//print str.substring(1,3)

def str = "Automation Step by Step"
print str-("Step")

//def sum(int num1, int num2){
//	println "Sum is "+(num1+num2)
//}
//sum()


def myClosure1 = { print "Hello World" }
myClosure1.call()



def map1 = ['a' : 1 , 'b' : 2]

def entry1 = map1.entrySet()

println entry1

entry1.each { entry ->
 
   println entry.key in ['a']
   println	 entry.value in [1,2]

}


def range1 = 10..1 // 10 9 8 7 6 5 4 3 2 1
def range2 = range1.subList(3, 8)
print range2

def range3 = 10..1
def range4 = range3.subList(1,5)
println range4

