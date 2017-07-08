//Program concept -> Copying the values of one object into another using constructors

class Stud{
	static String schoolname = "SFX High";
	int id;
	String name;
	String div;
	int age;
	
	Stud(int n, String p, String d, int a){
		id = n;
		name = p;
		div = d;
		age = a;
	}
	
	//Constructor where the Obj as a parameter.
	//Overloading principles apply.
	Stud(Stud s)
	{
		id = s.id;
		name = s.name;
		div = s.div;
		age = s.age;
	}
	
	void display()
	{
		System.out.println("========"+schoolname+"==========");
		System.out.println("Student Details");
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Division: "+div);
		System.out.println("=========================");
	}
}

class Student3{
	public static void main(String args[])
	{
		Stud dia = new Stud(21, "Dia", "A", 15);
		Stud mia = new Stud(dia); //mia will have same values as Dia.
		
		dia.display();
		mia.display();
	}
}
