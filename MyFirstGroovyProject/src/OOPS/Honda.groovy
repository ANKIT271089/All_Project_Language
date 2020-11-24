package OOPS

class Honda extends Bike {
	
	int topspeed
	
	def speed () {
		
		println "$topspeed km/sec is remarkable"
	}
	

	static void main(args) {
		Honda newbike = new Honda()
		
		newbike.name = "Honda1"
		newbike.colour = "Black"
		newbike.model = 1920
		newbike.topspeed= 200
		
		newbike.startengine()
		newbike.stopengine()
		newbike.accelerate()
		newbike.speed()
		
	}
}
