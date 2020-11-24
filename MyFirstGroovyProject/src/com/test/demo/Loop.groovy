package com.test.demo

//for 

//for (def i=1; i<=5; i++) {
//	println i
//}

def i=1 // int i = 1
for (i; i<=5; i++) {
	println i
}

//for in
for (a in 6..10) {
	println a
}

//Keywords in Groovy

1.upto(5) {println "$it"}
5.times { println "$it" }
//1.step(10, 3) {println "$it"  }

// iterate over a list

for (z in [0, 1, 2, 3, 4] ) {
	println z
}

// iterate over a map
def map = ['name':"ankit", 'age':30, 'job':"telekom" ]

for ( e in map ) {
// println e
	print e.key+"="
	println e.value
}

// iterate over the characters in a string
def text = "abc"
def list = []
for (c in text) {
	list.add(c)
	print list
}


//While loop
int s = 1
while (s<=5) {
	println s
	s=s+1
}


x = 0
for ( j in [0, 1, 2, 3, 4] ) {
	x += j
}
println x


















