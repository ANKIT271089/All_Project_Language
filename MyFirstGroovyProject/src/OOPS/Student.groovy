package OOPS

class Student {
	
	String name;
	int subject1mark;
	int subject2mark;
	
	def printtotal() {
		
		println "$name has total marks = "+(subject1mark+subject2mark)
	}

	static void main(args) {
		
		Student studentproperty = new Student() //Created object for class
		studentproperty.name = "ankit"
		studentproperty.subject1mark = 12
		studentproperty.subject2mark =13
		studentproperty.printtotal() //Call the function which in class
		
		Student studentproperty11 = new Student()
		studentproperty11.name = "john"
		studentproperty11.subject1mark = 50
		studentproperty11.subject2mark =25
		studentproperty11.printtotal()
	}
}
