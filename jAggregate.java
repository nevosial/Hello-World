/***
Program concept -> Aggregation.

***/

class Address{
	String house;
	String city;
	String state;
	int pincode;
	String country;
	
	Address(String house, String city, String state, int pincode, String country){
		this.house = house;
		this. city = city;
		this state = state;
		this.pincode = pincode;
		this.country = country;
		
	}
}

class Student{
	String name;
	int rollno;
	Address address;
	
	Student(String name, int rollno, Address address){
		this.name = name;
		this.rollno = rollno;
		this.address = address;
	}
	
	void display(){
		System.out.println("========"+schoolname+"==========");
		System.out.println("Student Details");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Division: "+div);
		System.out.println("=========================");
	}
}

