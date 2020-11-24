package com.test.demo


//Class is collection of data and methods that that repersent a real word object

//Class is kind of blueprint for object.you can create multiple object
class Fruits {

    private String fruitname
    private String fruitcolour
    
    def setFruitName(String name) {
        fruitname = name
    }
    
    def setFruitColour(String colour) {
       fruitcolour = colour
    }
    
    def getFruitName() {
        
       println "Name of the fruit is $fruitname"
		
        
    }
    
    def getFruitColour() {
        
        println "Colour of the fruit is $fruitcolour"
        
    }
    
    static void main(args) {     //This is main Method for given class
        
         Fruits apple = new Fruits()
         apple.setFruitName("Apple")  
        apple.setFruitColour("Red")
        
        apple.getFruitName()
        apple.getFruitColour()
          
         
    }
}
