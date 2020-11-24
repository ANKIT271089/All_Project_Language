package com.test.demo



//Variables  are used to store information

//Best Practice to syntax in def 
def name = "Ankit"
println name 

String name1 = "Mohan"
println name1 

name2 = "RAM"
println name2

/*
 * How to name variables
   letters, digits, underscore _
 */

def name2 = "Mummy"
println 'Name is '+name2
println 'Name is ${name2}'
//${} syntax "" are in used -- Double quotes
println "Name is ${name2}"
println "Name is $name2"

// groovy is case sensitive

def x=10
def X=20
println x
println X

// groovy is a dynamically typed language which is not common in java and C it will through error

def name3 = "Ram"
name3 = 30
println name3

def (String a,int b ,Double c) = [40,50,60]
println a
println b
println c

