package OOPS

class ObjectCars {

	static void main(args) {
		Cars car1 = new Cars()
		car1.name = "bmw"
		car1.Colour = "BLACK"
		car1.Model = 1990
		car1.Size = "big"
		
		println "=============================="
		
		
		Cars car2 = new Cars()
		car2.name = "audy"
		car2.Colour = "white"
		car2.Model = 200
		car2.Size = "small"
		
		car1.getcardetails()
		car1.startcarengin()
		println "==============================="
		car2.getcardetails()
		car2.startcarengin()
		
	}
}
