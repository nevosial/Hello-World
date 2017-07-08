//Program concept -> Constructors & overloading.
class Stud{
	static String schoolname = "SFX High";
	int id;
	String name;
	String div;
	int age;
	
	//constructor1.
	Stud(int n, String p){
		id = n;
		name = p;
	}
	
	//Overloading constructor.
	Stud(int n, String p, String d, int a){
		id = n;
		name = p;
		div = d;
		age = a;
	}
	
	void display()
	{
		System.out.println("========"+schoolname+"==========");
		System.out.println("Student Details");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Division: "+div);
		System.out.println("================================");
	}
}

class Student2{
	public static void main(String args[])
	{
		Stud nev = new Stud(0027, "Nev");
		Stud dia = new Stud(0021, "Dia", "A", 15);
		
		nev.display();
		dia.display();
	}
}
