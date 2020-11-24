package com.test.demo

def name = "Ankit"
println "My name is "+ name
println "My name is ".concat(name)

println "My name is ${name}"
println "My name is $name"
println 'My name is $name'//Interpolation is not possible in single coated string

//If we are using double line then triple single or triple double will be used 
def s1 = """this is my class of string and
going good till now"""

println s1

println name.length()
println name[2]
println name[-2]
println name[0..2]
println name[4..2]
println name[0,2,2]
//println name.indexOf('A')
println name.substring(2)
println name.subSequence(1, 3)

println "========================================"

def str= "This is Raghav class of Groovy"

println str.split(" ")
println str-("class ")
println str.replace("class", "session")
println str.toUpperCase()
println str.toLowerCase()

println str.toList() 

println "Grrovy " *3

println "ABC".equals("abc")
println "ABC".equalsIgnoreCase("abc")




def s4 = 'Germany'
def s2 = /I live in bonn $s4/
def s3 = $/it in is koln area $s4/$

println s2
println s3

def s5 = /My name is "ankit srivastava"/
println s5

def s6 = "My name is \"RAM\"" //No need to use scape char
println s6





















