class Banker{
	static String name="DNM Bank";
	long dep_amount, withdrawal;
	String custname;
	int acc_num;
	long current_amount;
	
	//Constructor 1 to create account.
	Banker(String n, int ac, long amt)
	{
		custname = n;
		acc_num = ac;
		current_amount = amt;
	}
	
	
	void checkBalance()
	{
		System.out.println("\n");
		System.out.println("==DNM Bank Account Details==");
		System.out.println("Account Holder Name: "+custname);
		System.out.println("Account Number     : "+acc_num);
		System.out.println("Account Balance    : "+current_amount);
		System.out.println("==========Thank You==========\n");
	}
	
	
	void deposit(long d)
	{
		dep_amount = d;
		System.out.println("Depositing "+d+" to your account...");
		current_amount+= dep_amount;
	}
	
	void withdraw(long w)
	{
		if(w > current_amount){
			System.out.println("You do not have sufficient funds to complete this transcation.");
		}
		else{
			System.out.println("Withdrawing "+w+" from your account...");
			withdrawal = w;
			current_amount-= withdrawal;
		}
	}
}

class DNMBank2{
	public static void main(String args[])
	{
		Banker nev = new Banker("Nev", 281988, 5000000);
		Banker dia = new Banker("Dia", 281988, 1000000);
		
		nev.checkBalance();
		nev.deposit(5000000);
		nev.checkBalance();
		nev.withdraw(30000);
		nev.checkBalance();
		
		dia.checkBalance();
		dia.deposit(5000000);
		dia.checkBalance();
		dia.withdraw(176000);
		dia.checkBalance();
		
	}
}
