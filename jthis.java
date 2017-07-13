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
	String name;
	int roll_no;
	int age;
	
	Student(String name, int roll_no)
	{
		this.name = name;
		this roll_no = roll_no;
	}
	
	void display(){
		System.out.println("========"+schoolname+"==========");
		System.out.println("Student Details");
		System.out.println("Roll Number: "+roll_no);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("=========================");
	}
}

class jthis{
	public static void main(String args[]){
		
	}
}
