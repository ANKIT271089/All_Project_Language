package com.test.demo


//MAPS
//key-value pair
//unordered collection
//[key : value]
//['name' : 'Raghav']
//[:] = empty map

def country = ['name':'India', 'Area' : 3000]

println country
println country.name
println country['name']
println country.get('name')
println country.getAt('Area')

country.put('capital', 'delhi')
println country

println country.size()
println country.containsKey('Area')
println country.containsValue('delhi')

println country.getMetaClass()

def desh = country.clone()
println desh

country.each { key,value ->
 
	println "$key : $value"	
	
}

country.eachWithIndex { k,v,i ->
	
	println "$i | $k : $v"
}



//country.each { entry,i ->
//	
//	println "$i | $entry.key : $entry.value"
//	
//}

def map1 = ['a' : 1 , 'b' : 2]
 
def entry1 = map1.entrySet()

entry1.each { entry ->
  
	assert entry.key in ['a','b'] 	
	assert entry.value in [1,2]

}

map1.clear()
println map1












	
	








