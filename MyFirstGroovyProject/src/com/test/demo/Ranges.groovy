package com.test.demo

import groovy.time.BaseDuration.From

//RANGES
//creates a list of sequential values
//denoted by first and last value of the sequence
//
//1..10
//'a'..'z'
//10..1
//
//2 types -  inclusive & exclusive

def range1 = 1..10
println range1
println range1.size()
println range1.getFrom()
println range1.getTo()

assert range1.from == 1
assert range1.to == 10

println range1.get(3)
println range1[3]


println range1.contains(5)
println range1.reverse

def range2 = range1.subList(3, 8)
print range2

//iteration on range

for (i in range1) {
	println i
}


//range1.each { i ->
//	println "Value = $i"
//}

(1..10).each{i ->
	println "Value = $i"
}

//Range is a instance of java util list

println range1 instanceof java.util.List //Can be interview question


























