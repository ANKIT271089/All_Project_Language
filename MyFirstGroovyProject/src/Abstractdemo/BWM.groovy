package Abstractdemo

class BWM extends Car {

	int topspeed1 
	
	@Override
	public Object topspeed() {
	
		println "Tops speed for $name is $topspeed1"
	}
	
	static void main(args) {
		
		BWM mycar = new BWM()
		mycar.name = "BMW1"
		mycar.colour = "Black"
		mycar.model = 2000
		mycar.topspeed1 = 200
		
		mycar.startengine()
		mycar.topspeed()
	}
}
