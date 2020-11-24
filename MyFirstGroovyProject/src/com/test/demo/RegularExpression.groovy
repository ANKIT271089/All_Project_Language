package com.test.demo

//regex - pattern used to find substrings in text or in a string
// ~ "Expression"
//https://regexr.com/
//http://buildregex.com/

//def match = "Groovy" =~"o"
// if (match) {
//	def  i=0
//	 while (match) {
//		 println match[i]
//		 i++
//	 } 	
// }else {
//	 println "No match found"
// }

def regularexp = /(?:[^Groovy]*)/
def match = "I am in Groovy class" =~ regularexp
if (match) {
		def  i=0
		 while (match) {
			 println match[i]
			 i++
}
}else {
		 println "No match found"
}









