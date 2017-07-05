class stddetails{

	int roll_number;
	String name;
	int age;
	static String school_name="Model High School";

	public void details()
	{
		System.out.println("--Student detail--");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Roll Number : "+roll_number);
		System.out.println("-------------------");
	}

	public void appears_Exam()
	{
		System.out.println("---Student Exam detail---");
		System.out.println(name + " from " + school_name + " has appeared  for the exam this year");
	}
}

class Student{
	public static void main(String args[])
	{
		stddetails nev = new stddetails();
		stddetails dia = new stddetails();
		
		nev.name =  "Nev";
		nev.age = 10;
		nev.roll_number = 7;

		dia.name = "Dia";
		dia.age  = 20;
		dia.roll_number = 27;

		nev.details();
		dia.details();

		nev.appears_Exam();
		dia.appears_Exam();
	}
}
