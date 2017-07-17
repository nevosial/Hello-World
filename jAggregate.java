/***
Program concept -> Aggregation.

***/

class Address{
	String house;
	String city;
	String state;
	int pincode;
	String country;
	
	public Address(String house, String city, String state, int pincode, String country){
		this.house = house;
		this. city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
		
	}
}

class Student{
	static String schoolname = "DNM High";   //applicable only for this class.
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
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
		System.out.println("Address: "+address);
		System.out.println("=========================");
	}
}

class jAggregate{
		public static void main(String a[]){
			Address a1 = new Address("Bethel", "Panjim", "Goa", 22312, "INDIA");
			Address a2 = new Address("Paradise", "Alibaug", "Maharashtra", 42132, "India");
			
			Student s1 = new Student("Dia", 12, a1);
			Student s2 = new Student("Nev", 14, a2);
			
			s1.display();
			s2.display();
		}
}


