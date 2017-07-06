/*
A simple Banke which allows to,
	-create a new account.
	-deposit to the account.
	-withdrawal from the account.
	-check the balance.
*/

class Banker{
	static String name="DNM Bank";
	long dep_amount, withdrawal;
	String custname;
	int acc_num;
	long current_amount;
	
	void createAccount(String n, int ac, long amt )
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
		current_amount+= dep_amount;
	}
	
	void withdraw(long w)
	{
		if(w > current_amount){
			System.out.println("You do not have sufficient funds to complete this transcation.");
		}
		else{
		withdrawal = w;
		current_amount-= withdrawal;
		}
	}
}

class DNMBank{
	public static void main(String args[])
	{
		Banker nev = new Banker();
		nev.createAccount("Nev", 281988, 5000000);
		nev.checkBalance();
		
		nev.deposit(5000000);
		nev.checkBalance();
		
		nev.withdraw(100000000);
		nev.checkBalance();
		
	}
}
