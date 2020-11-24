package com.test.demo

def Room = ["Bedroom", "Kitchen", "DiningRoom"]

println Room[1]
println Room.get(0)

def mylist = [1,2,3,['A','B','Laptop'],7]

//println mylist[0]
//println mylist[3]
//println mylist[3][2]
//
//println mylist.get(3).get(2)

//println mylist[0..2]
//
//println mylist[4..2]
//println mylist[3].contains('Laptop')
//
//println mylist.size()
//println mylist[3].size()

//mylist = mylist.add(50)
//println mylist
//println mylist << 40
//
//mylist.pop()
//println mylist
////println mylist.removeLast()
//
//mylist.removeLast()
//println mylist
//
//println mylist.intersect([7,3,9])

mylist = mylist.reverse()
println mylist

mylist = mylist.sort()
println mylist

mylist.clear()
println mylist.isEmpty()













