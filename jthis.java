/***
Program concept -> this keyword.
1. To refer current class instance variable.
2. To invoke current class method.
3. To invoke current class constructor.
4. Passed as argument in method call.
5. Passed as argument in constructor call.
6. To return current class instance from method.
***/

class Student{
	static String schoolname = "DNM School";
	String name;
	int roll_no;
	int age;
	
	Student(String name, int roll_no)
	{
		//Using this to refer to current class instance variables.
		this.name = name;
		this.roll_no = roll_no;
	}
	
	Student(String name, int roll_no, int age)
	{
		this(name, roll_no); //Using this to invoke class constructor. this() must always be the first statement in the constructor to avoid compile error.
		this.age = age;
	}
	
	void display(){
		System.out.println("========"+schoolname+"=======");
		System.out.println("Student Details");
		System.out.println("Roll Number: "+roll_no);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("=========================");
	}
}

class jthis{
	public static void main(String args[]){
		
		Student a1 = new Student("Nev", 10);  			//op:- Name= Nev; RollNo: 10 Age = 0
		Student a2 = new Student("Dia", 20, 10);		//op:- Name= Dia; RollNo: 20 Age = 10
		
		a1.display();
		a2.display();
		
		
	}
}

//TODO : Add examples for 4, 5, 6.
