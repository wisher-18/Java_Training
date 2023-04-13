
class BankCustomer
{
	int acno;
	String atype;
	double amt;
	BankCustomer()//default constructor
	{
		acno = 122;
		atype = "Current";
		amt = 60000;
	}
	BankCustomer(int acno, String atype) //parameterized constructor
	{
		this.acno=acno;
		this.atype=atype;
	}
	BankCustomer(double amt) // parameterized constructor or constructor overloading
	{
		this.amt = amt;
	}
	void show()
	{
		System.out.println("Ac no: "+acno+"\nAccount type: "+atype+"\nBalance: "+amt);
	}
}


public class BankingTask {

	public static void main(String[] args) {
		BankCustomer b1 = new BankCustomer();
		BankCustomer b2 = new BankCustomer(101, "Savings");
		BankCustomer b3 = new BankCustomer(50000);
		b1.show();
		b2.show();
		b3.show();

	}

}
