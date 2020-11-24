package com.test.demo

//Operators are symbols that tell the compiler to perform some specific operation

//http://groovy-lang.org/operators.html

//Arithmetic Operator

//Basic normal operators
//assert is an statement

assert  1  + 2 == 3
assert  4  - 3 == 1
assert  3  * 5 == 15
assert  3  / 2 == 1.5
assert 10  % 3 == 1
assert  2 ** 3 == 8
//assert 2 ** 3 == 7 -- Statement is not correct to it will fail
assert 3.intdiv(2) == 1
assert 2.2.plus(1.1) == 3.3

//Unary Operator
assert +3 == 3
assert -4 == 0 - 4

assert -(-1) == 1

//Increment ++ and Decrement -- operator both prefix and postfix notation
int i = 10
//println i++ //
println (++i) 
println i
println ("=======================================")


//The postfix increment will increment a after the expression has been evaluated and assigned into b
//def a = 2
//def b = a++ * 3
//assert a == 3 && b == 6
//
////The postfix decrement will decrement c after the expression has been evaluated and assigned into d
//def c = 3
//def d = c-- * 2
//assert c == 2 && d == 6
//
//
////The prefix increment will increment e before the expression is evaluated and assigned into f
//def e = 1
//def f = ++e + 3
//assert e == 2 && f == 5
//
////The prefix decrement will decrement g before the expression is evaluated and assigned into h
//def g = 4
//def h = --g + 1
//assert g == 3 && h == 4

//Assignment arithmetic operators

def a = 4
a += 3 // a = a+3
assert a == 7

def b = 5
b -= 3 // b = b-3
assert b == 2

def c = 5
c *= 3 // c = c*3
assert c == 15

def e = 10
e %= 3
assert e == 1

def f = 3
f **= 2 // f to the power 2
assert f == 9

//Rational Operators

assert 1 + 2 == 3
assert 3 != 4 // Not equal to !

assert -2 < 3
assert 2 <= 2
assert 3 <= 4

assert 5 > 1
assert 5 >= -2

//Logical operators

//&&: logical "and"

//||: logical "or"

//!: logical "not"

assert !false // Not false
assert true && true //Both side must be true
assert true || false //Any one should be true

// Precedence
//The logical "not" has a higher priority than the logical "and".

assert (!false && false) == false

//The logical "and" has a higher priority than the logical "or".

assert true || true && false

//Bitwise operator

//&: bitwise "and"

int x = 20
int y = 25
println (x & y)
println Integer.toBinaryString(20)       // 10100
println Integer.toBinaryString(25)       // 11001
println Integer.parseInt("10000" , 2)    // 10000
//|: bitwise "or"
int x1 = 20
int y1 = 25
println (x1 | y1)     // 11101
println Integer.parseInt("11101" ,2)
//^: bitwise "xor" (exclusive "or")

//~: bitwise negation

// Conditional operators

//assert (!true)    == false
//assert (!'foo')   == false
//assert (!'')      == true

//Ternary Operator
def output1 = (1>0) ? "1 is greater" : "1 is not greater"
println output1
//result = string ? 'Found' : 'Not found'























  
